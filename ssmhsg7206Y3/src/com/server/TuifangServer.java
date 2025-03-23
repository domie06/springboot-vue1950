package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Tuifang;

public interface TuifangServer {

  public int add(Tuifang po);

  public int update(Tuifang po);
  
  
  
  public int delete(int id);

  public List<Tuifang> getAll(Map<String,Object> map);
  public List<Tuifang> getsytuifang1(Map<String,Object> map);
  public List<Tuifang> getsytuifang2(Map<String,Object> map);
  public List<Tuifang> getsytuifang3(Map<String,Object> map);
  public Tuifang quchongTuifang(Map<String, Object> acount);

  public Tuifang getById( int id);

  public List<Tuifang> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Tuifang> select(Map<String, Object> map);
}
//	所有List
