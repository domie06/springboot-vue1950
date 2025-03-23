package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.LvkexinxiMapper;
import com.entity.Lvkexinxi;
import com.server.LvkexinxiServer;
@Service
public class LvkexinxiServerImpi implements LvkexinxiServer {
   @Resource
   private LvkexinxiMapper gdao;
	@Override
	public int add(Lvkexinxi po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Lvkexinxi po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Lvkexinxi> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Lvkexinxi> getsylvkexinxi1(Map<String, Object> map) {
		return gdao.getsylvkexinxi1(map);
	}
	public List<Lvkexinxi> getsylvkexinxi2(Map<String, Object> map) {
		return gdao.getsylvkexinxi2(map);
	}
	public List<Lvkexinxi> getsylvkexinxi3(Map<String, Object> map) {
		return gdao.getsylvkexinxi3(map);
	}
	
	@Override
	public Lvkexinxi quchongLvkexinxi(Map<String, Object> account) {
		return gdao.quchongLvkexinxi(account);
	}

	@Override
	public List<Lvkexinxi> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Lvkexinxi> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Lvkexinxi getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

