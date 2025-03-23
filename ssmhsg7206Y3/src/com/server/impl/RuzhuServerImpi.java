package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.RuzhuMapper;
import com.entity.Ruzhu;
import com.server.RuzhuServer;
@Service
public class RuzhuServerImpi implements RuzhuServer {
   @Resource
   private RuzhuMapper gdao;
	@Override
	public int add(Ruzhu po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Ruzhu po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Ruzhu> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Ruzhu> getsyruzhu1(Map<String, Object> map) {
		return gdao.getsyruzhu1(map);
	}
	public List<Ruzhu> getsyruzhu2(Map<String, Object> map) {
		return gdao.getsyruzhu2(map);
	}
	public List<Ruzhu> getsyruzhu3(Map<String, Object> map) {
		return gdao.getsyruzhu3(map);
	}
	
	@Override
	public Ruzhu quchongRuzhu(Map<String, Object> account) {
		return gdao.quchongRuzhu(account);
	}

	@Override
	public List<Ruzhu> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Ruzhu> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Ruzhu getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

