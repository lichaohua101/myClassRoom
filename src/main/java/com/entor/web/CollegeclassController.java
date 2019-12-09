package com.entor.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.entor.entity.Collegeclass;
import com.entor.entity.User;
import com.entor.service.ICollegeclassDetailsService;
import com.entor.service.ICollegeclassService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author LiChaoHua
 * @since 2019-10-25
 */
@Controller
public class CollegeclassController {
	
	@Autowired
	private ICollegeclassService collegeclassService;
	private ICollegeclassDetailsService CCDS;
	
	// 有什么学院
	@RequestMapping("/queryCollege")
	private String queryCollege(Model model) {
		List<Collegeclass> list = collegeclassService.queryCollege();
		model.addAttribute("list1", list);
		return "college/college";
	}
	// 学院里有哪些班级
	@RequestMapping("/queryCollegeClass")
	private String queryClass(HttpServletRequest request, Model model) {
		String college = request.getParameter("collegeName");
		List<Collegeclass> list = collegeclassService.queryClass(college);
		model.addAttribute("list2", list);
		return "college/college";
	}
	//班级里的所有学生
	@RequestMapping("/goCClass")
	private String goCClass(HttpServletRequest request,Model model) {
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		List<User> list = CCDS.queryAllByCollegeId(id);
		model.addAttribute("list", list);
		for (User user : list) {
			System.out.println(user);
		}
		return "college/collegeClass";
	}
}
