package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Lvkexinxi;

public interface LvkexinxiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Lvkexinxi record);

    int insertSelective(Lvkexinxi record);

    Lvkexinxi selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Lvkexinxi record);
	
    int updateByPrimaryKey(Lvkexinxi record);
	public Lvkexinxi quchongLvkexinxi(Map<String, Object> lvkebianhao);
	public List<Lvkexinxi> getAll(Map<String, Object> map);
	public List<Lvkexinxi> getsylvkexinxi1(Map<String, Object> map);
	public List<Lvkexinxi> getsylvkexinxi3(Map<String, Object> map);
	public List<Lvkexinxi> getsylvkexinxi2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Lvkexinxi> getByPage(Map<String, Object> map);
	public List<Lvkexinxi> select(Map<String, Object> map);
//	所有List
}

