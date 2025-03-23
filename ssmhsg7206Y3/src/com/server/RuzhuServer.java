package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Ruzhu;

public interface RuzhuServer {

  public int add(Ruzhu po);

  public int update(Ruzhu po);
  
  
  
  public int delete(int id);

  public List<Ruzhu> getAll(Map<String,Object> map);
  public List<Ruzhu> getsyruzhu1(Map<String,Object> map);
  public List<Ruzhu> getsyruzhu2(Map<String,Object> map);
  public List<Ruzhu> getsyruzhu3(Map<String,Object> map);
  public Ruzhu quchongRuzhu(Map<String, Object> acount);

  public Ruzhu getById( int id);

  public List<Ruzhu> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Ruzhu> select(Map<String, Object> map);
}
//	所有List
