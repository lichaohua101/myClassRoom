package com.entor.web;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entor.entity.User;
import com.entor.service.IUserService;
@Controller
@RequestMapping("/user/*")
public class UserLoginController {

	@Autowired
	private IUserService userService;
	
	// 跳转到登录页面
	@RequestMapping("login")
	public String login() {
		return "login";
	}
	// 通过帐号 验证登录
	@RequestMapping("loginCheck")
	public String loginCheck(User loginUser,ModelMap model,HttpSession session) {
		System.out.println(loginUser);
		User user  = userService.queryUserByUsername(loginUser.getUsername());
		if (null == user) {
			return "redirect:/user/login";
		}
		if (user.getPassword().equals(loginUser.getPassword())) {
			session.setAttribute("user", user);
			return "redirect:/user/index";
		}else {
			return "redirect:/user/login";
		}
	}
	//后台主页
	@RequestMapping("index")
	public String index(HttpSession session,ModelMap model) {
		User user = (User) session.getAttribute("user");
		if (null == user) {
			return "redirect:/login";
		}
		model.put("username", user.getUsername());
		return "index";
	}
	//注销用户
	@RequestMapping("logout")
	public String logout() {
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		return "redirect:/user/login";
	}
}
