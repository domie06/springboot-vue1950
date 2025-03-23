package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Yuding;

public interface YudingServer {

  public int add(Yuding po);

  public int update(Yuding po);
  
  
  
  public int delete(int id);

  public List<Yuding> getAll(Map<String,Object> map);
  public List<Yuding> getsyyuding1(Map<String,Object> map);
  public List<Yuding> getsyyuding2(Map<String,Object> map);
  public List<Yuding> getsyyuding3(Map<String,Object> map);
  public Yuding quchongYuding(Map<String, Object> acount);

  public Yuding getById( int id);

  public List<Yuding> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Yuding> select(Map<String, Object> map);
}
//	所有List
