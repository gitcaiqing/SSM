package com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssm.dao.AdminuserDao;
import com.ssm.dao.CmpyinfoDao;
import com.ssm.entity.Adminuser;
import com.ssm.entity.Cmpyinfo;
import com.ssm.mapper.CmpyinfoMapper;
import com.ssm.service.CmpyinfoService;

@Service
public class CmpyinfoServiceImpl implements CmpyinfoService{

	@Autowired
	private CmpyinfoMapper cmpyinfomapper;
	
	@Autowired
	private CmpyinfoDao cmpyinfoDao;
	
	@Autowired
	private AdminuserDao adminuserDao;
	
	@Override
	public Cmpyinfo getCmpyinfo(Integer id) {
		// TODO Auto-generated method stub
		return cmpyinfomapper.selectByPrimaryKey(id);
	}
	
	@Transactional
	public Integer insertCmpyAndUser() {
		
		//插入
		Adminuser adminuser = new Adminuser();
		adminuser.setUsername("xxxxxx");
		adminuser.setRealname("77777");
		adminuserDao.save(adminuser);
		
		//触发器执行... （更加cmpyinfo插入 触发 tb_basic_cmpyinfo_trigger 插入一条对应的记录）
		
		Cmpyinfo cmpyinfo = new Cmpyinfo();
		cmpyinfo.setQydm("77777");
		cmpyinfo.setCmpname("测试xxxxxx哈哈");
		cmpyinfo.setGname("gname");
		cmpyinfoDao.save(cmpyinfo);
		System.out.println("*********************************************");
		return 1;
	}

}
