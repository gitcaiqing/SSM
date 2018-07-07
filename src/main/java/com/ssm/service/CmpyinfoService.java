package com.ssm.service;

import com.ssm.entity.Cmpyinfo;

public interface CmpyinfoService {

	public Cmpyinfo getCmpyinfo(Integer id);
	
	public Integer insertCmpyAndUser();
}
