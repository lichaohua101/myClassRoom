package com.entor.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entor.entity.User;

@Controller
public class HelloController {

	@Controller
	public class indexController{
	    @RequestMapping("example")
	    public String a(Model model){
//	        return "example";//返回classpath:templates/example.html页面(thymeleaf)
	    	model.addAttribute("content","我是来自后台的");
			model.addAttribute("name","张三");
			model.addAttribute("username","zhangsan");
			model.addAttribute("password","123456");
			//传递一个对象
			User user = new User();
			user.setId(1);
			user.setUsername("李四");
			user.setUsername("lisi");
			user.setPassword("123456");
			model.addAttribute("user",user);
			//传递一个集合
			List<User> list = new ArrayList<User>();
			for (int i = 1; i <= 10; i++) {
				User user1 = new User();
				user1.setId(i);
				user1.setUsername("张三"+i);
				user1.setUsername("zhangsan"+i);
				user1.setPassword("123456");
				list.add(user1);
			}
			model.addAttribute("list",list);
			//测试多条件
			model.addAttribute("score",96);
			model.addAttribute("now",new Date());
			return "example";
	    }
	    @RequestMapping("index")
	    public String b(){
	        return "jsp/index";//返回 /WEB-INF/jsp/index.jsp 页面(jsp)
	    }
	}

}
