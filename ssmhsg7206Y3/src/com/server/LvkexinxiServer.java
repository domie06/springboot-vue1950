package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Lvkexinxi;

public interface LvkexinxiServer {

  public int add(Lvkexinxi po);

  public int update(Lvkexinxi po);
  
  
  
  public int delete(int id);

  public List<Lvkexinxi> getAll(Map<String,Object> map);
  public List<Lvkexinxi> getsylvkexinxi1(Map<String,Object> map);
  public List<Lvkexinxi> getsylvkexinxi2(Map<String,Object> map);
  public List<Lvkexinxi> getsylvkexinxi3(Map<String,Object> map);
  public Lvkexinxi quchongLvkexinxi(Map<String, Object> acount);

  public Lvkexinxi getById( int id);

  public List<Lvkexinxi> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Lvkexinxi> select(Map<String, Object> map);
}
//	所有List
