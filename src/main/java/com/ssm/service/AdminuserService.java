package com.ssm.service;

import java.util.List;

import com.ssm.entity.Adminuser;

public interface AdminuserService {

	public Adminuser getOne(Integer id);
	
	public List<Adminuser> listByUsername(String username);

	public Adminuser findByUsernameAndPassword(String username, String password);

	public Adminuser findByRealname(String realname);

	public int trans();
	
}
