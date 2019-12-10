package com.entor.controller;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entor.entity.User;
import com.entor.service.IUserService;

@Controller
@RequestMapping("/admin/*")
public class LoginController {
	
	@Autowired
	private IUserService userService;
	
	// 跳转到后台登录页面
	@RequestMapping("/login")
	public String login() {
		return "jsp/login";
	}
	// 通过帐号 验证登录
	@RequestMapping("/loginCheck")
	public String loginCheck(User loginUser,ModelMap model,HttpSession session) {
		System.out.println(loginUser);
		User user  = userService.queryUserByUsername(loginUser.getUsername());
		if (null == user) {
			return "redirect:/admin/login";
		}
		if (user.getPassword().equals(loginUser.getPassword())) {
			session.setAttribute("user", user);
			return "redirect:/admin/index";
		}else {
			return "redirect:/admin/login";
		}
	}
	//后台主页
	@RequestMapping("/index")
	public String index(HttpSession session,ModelMap model) {
		User user = (User) session.getAttribute("user");
		if (null == user) {
			return "redirect:/login";
		}
		model.put("username", user.getUsername());
		return "jsp/index";
	}
	//注销用户
	@RequestMapping("/logout")
	public String logout() {
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		return "redirect:/admin/login";
	}
}
