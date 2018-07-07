package com.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.entity.Adminuser;
import com.ssm.entity.Cmpyinfo;
import com.ssm.service.AdminuserService;
import com.ssm.service.CmpyinfoService;

@Controller
@RequestMapping("/a")
public class CmpyinfoController {

	@Autowired
	private CmpyinfoService cmpyinfoServicce;
	
	@Autowired
	private AdminuserService adminuserService;
	
	@RequestMapping("/cmpy/list")
	public String getCmpyinfo() {
		return "/cmpyinfo/list";
	}
	
	@RequestMapping("/cmpy/{id}")
	@ResponseBody
	public Cmpyinfo getCmpyinfo(@PathVariable("id")Integer id) {
		//mybatis
		Cmpyinfo cmpyinfo = cmpyinfoServicce.getCmpyinfo(id);
		System.out.println("cmpyinfo:"+cmpyinfo);
		//JAP
		Adminuser adminuser = adminuserService.getOne(id);
		System.out.println("adminuser:"+adminuser);
		
		adminuser = adminuserService.findByUsernameAndPassword("admin","123456");
		
		adminuser = adminuserService.findByRealname("%管理%");
		
		List<Adminuser> adminusers = adminuserService.listByUsername("admin");
		System.out.println("adminusers:"+adminusers);
		
		//事务测试
		int eff = adminuserService.trans();
		
		return cmpyinfo;
	}
	
}
