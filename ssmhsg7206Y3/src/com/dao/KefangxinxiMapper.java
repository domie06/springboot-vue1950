package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Kefangxinxi;

public interface KefangxinxiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Kefangxinxi record);

    int insertSelective(Kefangxinxi record);

    Kefangxinxi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Kefangxinxi record);
	
    int updateByPrimaryKey(Kefangxinxi record);
	public Kefangxinxi quchongKefangxinxi(Map<String, Object> kefangbianhao);
	public List<Kefangxinxi> getAll(Map<String, Object> map);
	public List<Kefangxinxi> getsykefangxinxi1(Map<String, Object> map);
	public List<Kefangxinxi> getsykefangxinxi3(Map<String, Object> map);
	public List<Kefangxinxi> getsykefangxinxi2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Kefangxinxi> getByPage(Map<String, Object> map);
	public List<Kefangxinxi> select(Map<String, Object> map);
//	所有List
}

