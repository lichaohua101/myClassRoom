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
			return "example";
	    }
	    @RequestMapping("index")
	    public String b(){
	        return "jsp/index";//返回 /WEB-INF/jsp/index.jsp 页面(jsp)
	    }
	}

}
