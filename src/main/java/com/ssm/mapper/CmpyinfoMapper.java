package com.ssm.mapper;

import com.ssm.entity.Cmpyinfo;

public interface CmpyinfoMapper {
	/**
	 * @Description: 根据主键id获取数据
	 * @param @param id
	 * @param @return
	 * @author wuchao 
	 * @date 2016-8-16 上午9:13:38 
	 */
	Cmpyinfo selectByPrimaryKey(Integer id);
	
	/**
	 * @Description: 新增记录
	 * @param @param record
	 * @param @return
	 * @author wuchao 
	 * @date 2016-8-16 上午9:18:12 
	 */
	int insertSelective(Cmpyinfo record);
	
	/**
	 * @Description: 更新记录
	 * @param @param record
	 * @param @return
	 * @author wuchao 
	 * @date 2016-8-16 上午9:18:35 
	 */
	int updateByPrimaryKeySelective(Cmpyinfo record);
	
	/**
	 * @Description: 根据主键id删除记录
	 * @param @param id
	 * @param @return
	 * @author wuchao 
	 * @date 2016-8-16 上午9:18:56 
	 */
	int deleteByPrimaryKey(Integer id);

}