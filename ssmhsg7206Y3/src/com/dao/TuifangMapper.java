package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Tuifang;

public interface TuifangMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tuifang record);

    int insertSelective(Tuifang record);

    Tuifang selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tuifang record);
	
    int updateByPrimaryKey(Tuifang record);
	public Tuifang quchongTuifang(Map<String, Object> kefangbianhao);
	public List<Tuifang> getAll(Map<String, Object> map);
	public List<Tuifang> getsytuifang1(Map<String, Object> map);
	public List<Tuifang> getsytuifang3(Map<String, Object> map);
	public List<Tuifang> getsytuifang2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Tuifang> getByPage(Map<String, Object> map);
	public List<Tuifang> select(Map<String, Object> map);
//	所有List
}

