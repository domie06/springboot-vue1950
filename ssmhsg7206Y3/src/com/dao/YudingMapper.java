package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Yuding;

public interface YudingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Yuding record);

    int insertSelective(Yuding record);

    Yuding selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Yuding record);
	
    int updateByPrimaryKey(Yuding record);
	public Yuding quchongYuding(Map<String, Object> kefangbianhao);
	public List<Yuding> getAll(Map<String, Object> map);
	public List<Yuding> getsyyuding1(Map<String, Object> map);
	public List<Yuding> getsyyuding3(Map<String, Object> map);
	public List<Yuding> getsyyuding2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Yuding> getByPage(Map<String, Object> map);
	public List<Yuding> select(Map<String, Object> map);
//	所有List
}

