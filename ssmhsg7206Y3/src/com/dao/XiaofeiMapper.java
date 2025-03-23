package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Xiaofei;

public interface XiaofeiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Xiaofei record);

    int insertSelective(Xiaofei record);

    Xiaofei selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Xiaofei record);
	
    int updateByPrimaryKey(Xiaofei record);
	public Xiaofei quchongXiaofei(Map<String, Object> kefangbianhao);
	public List<Xiaofei> getAll(Map<String, Object> map);
	public List<Xiaofei> getsyxiaofei1(Map<String, Object> map);
	public List<Xiaofei> getsyxiaofei3(Map<String, Object> map);
	public List<Xiaofei> getsyxiaofei2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Xiaofei> getByPage(Map<String, Object> map);
	public List<Xiaofei> select(Map<String, Object> map);
//	所有List
}

