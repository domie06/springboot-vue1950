package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Xiaofei;

public interface XiaofeiServer {

  public int add(Xiaofei po);

  public int update(Xiaofei po);
  
  
  
  public int delete(int id);

  public List<Xiaofei> getAll(Map<String,Object> map);
  public List<Xiaofei> getsyxiaofei1(Map<String,Object> map);
  public List<Xiaofei> getsyxiaofei2(Map<String,Object> map);
  public List<Xiaofei> getsyxiaofei3(Map<String,Object> map);
  public Xiaofei quchongXiaofei(Map<String, Object> acount);

  public Xiaofei getById( int id);

  public List<Xiaofei> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Xiaofei> select(Map<String, Object> map);
}
//	所有List
