package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Ruzhu;

public interface RuzhuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ruzhu record);

    int insertSelective(Ruzhu record);

    Ruzhu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ruzhu record);
	
    int updateByPrimaryKey(Ruzhu record);
	public Ruzhu quchongRuzhu(Map<String, Object> kefangbianhao);
	public List<Ruzhu> getAll(Map<String, Object> map);
	public List<Ruzhu> getsyruzhu1(Map<String, Object> map);
	public List<Ruzhu> getsyruzhu3(Map<String, Object> map);
	public List<Ruzhu> getsyruzhu2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Ruzhu> getByPage(Map<String, Object> map);
	public List<Ruzhu> select(Map<String, Object> map);
//	所有List
}

