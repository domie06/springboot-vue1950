package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Jiezhang;

public interface JiezhangMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Jiezhang record);

    int insertSelective(Jiezhang record);

    Jiezhang selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Jiezhang record);
	
    int updateByPrimaryKey(Jiezhang record);
	public Jiezhang quchongJiezhang(Map<String, Object> kefangbianhao);
	public List<Jiezhang> getAll(Map<String, Object> map);
	public List<Jiezhang> getsyjiezhang1(Map<String, Object> map);
	public List<Jiezhang> getsyjiezhang3(Map<String, Object> map);
	public List<Jiezhang> getsyjiezhang2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Jiezhang> getByPage(Map<String, Object> map);
	public List<Jiezhang> select(Map<String, Object> map);
//	所有List
}

