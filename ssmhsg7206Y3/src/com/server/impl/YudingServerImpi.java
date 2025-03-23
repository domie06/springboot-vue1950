package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.YudingMapper;
import com.entity.Yuding;
import com.server.YudingServer;
@Service
public class YudingServerImpi implements YudingServer {
   @Resource
   private YudingMapper gdao;
	@Override
	public int add(Yuding po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Yuding po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Yuding> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Yuding> getsyyuding1(Map<String, Object> map) {
		return gdao.getsyyuding1(map);
	}
	public List<Yuding> getsyyuding2(Map<String, Object> map) {
		return gdao.getsyyuding2(map);
	}
	public List<Yuding> getsyyuding3(Map<String, Object> map) {
		return gdao.getsyyuding3(map);
	}
	
	@Override
	public Yuding quchongYuding(Map<String, Object> account) {
		return gdao.quchongYuding(account);
	}

	@Override
	public List<Yuding> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Yuding> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Yuding getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

