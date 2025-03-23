package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Caiwutongji;

public interface CaiwutongjiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Caiwutongji record);

    int insertSelective(Caiwutongji record);

    Caiwutongji selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Caiwutongji record);
	
    int updateByPrimaryKey(Caiwutongji record);
	public Caiwutongji quchongCaiwutongji(Map<String, Object> caiwubianhao);
	public List<Caiwutongji> getAll(Map<String, Object> map);
	public List<Caiwutongji> getsycaiwutongji1(Map<String, Object> map);
	public List<Caiwutongji> getsycaiwutongji3(Map<String, Object> map);
	public List<Caiwutongji> getsycaiwutongji2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Caiwutongji> getByPage(Map<String, Object> map);
	public List<Caiwutongji> select(Map<String, Object> map);
//	所有List
}

