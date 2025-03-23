package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Jiezhang;

public interface JiezhangServer {

  public int add(Jiezhang po);

  public int update(Jiezhang po);
  
  
  
  public int delete(int id);

  public List<Jiezhang> getAll(Map<String,Object> map);
  public List<Jiezhang> getsyjiezhang1(Map<String,Object> map);
  public List<Jiezhang> getsyjiezhang2(Map<String,Object> map);
  public List<Jiezhang> getsyjiezhang3(Map<String,Object> map);
  public Jiezhang quchongJiezhang(Map<String, Object> acount);

  public Jiezhang getById( int id);

  public List<Jiezhang> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Jiezhang> select(Map<String, Object> map);
}
//	所有List
