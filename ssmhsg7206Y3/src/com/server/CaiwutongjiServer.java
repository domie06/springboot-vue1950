package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Caiwutongji;

public interface CaiwutongjiServer {

  public int add(Caiwutongji po);

  public int update(Caiwutongji po);
  
  
  
  public int delete(int id);

  public List<Caiwutongji> getAll(Map<String,Object> map);
  public List<Caiwutongji> getsycaiwutongji1(Map<String,Object> map);
  public List<Caiwutongji> getsycaiwutongji2(Map<String,Object> map);
  public List<Caiwutongji> getsycaiwutongji3(Map<String,Object> map);
  public Caiwutongji quchongCaiwutongji(Map<String, Object> acount);

  public Caiwutongji getById( int id);

  public List<Caiwutongji> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Caiwutongji> select(Map<String, Object> map);
}
//	所有List
