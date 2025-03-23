package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Kefangxinxi;

public interface KefangxinxiServer {

  public int add(Kefangxinxi po);

  public int update(Kefangxinxi po);
  
  
  
  public int delete(int id);

  public List<Kefangxinxi> getAll(Map<String,Object> map);
  public List<Kefangxinxi> getsykefangxinxi1(Map<String,Object> map);
  public List<Kefangxinxi> getsykefangxinxi2(Map<String,Object> map);
  public List<Kefangxinxi> getsykefangxinxi3(Map<String,Object> map);
  public Kefangxinxi quchongKefangxinxi(Map<String, Object> acount);

  public Kefangxinxi getById( int id);

  public List<Kefangxinxi> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Kefangxinxi> select(Map<String, Object> map);
}
//	所有List
