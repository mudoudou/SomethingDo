package com.pan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pan.po.Student;
import com.pan.service.StudentService;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/stulist")
	public ModelAndView stulist() throws Exception {
		
		List<Student> students = studentService.liStudents();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("students", students);
		modelAndView.setViewName("students");
		return modelAndView;

	}
	
	@RequestMapping(value = "/stulist2")
	public String stulist2(Model model) throws Exception {
		
		List<Student> students = studentService.liStudents();
		model.addAttribute("students", students);
		return "students";

	}
}
