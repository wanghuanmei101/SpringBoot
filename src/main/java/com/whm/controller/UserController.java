package com.whm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.whm.pojo.User;
import com.whm.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService us;
	@RequestMapping(value = "/user", method = RequestMethod.GET)  
	public String getUser(Model model){
		  List<User> user = us.getUser();
		  for(int i=0;i<user.size();i++){
			  System.out.println(user.get(i).getName() );
		  }
		 
	      model.addAttribute("users", user);  //传递给Model,页面获取
	        return "generator/list";
	}
	  public void setUs(UserService us) {
		this.us = us;
	}
	 
}
