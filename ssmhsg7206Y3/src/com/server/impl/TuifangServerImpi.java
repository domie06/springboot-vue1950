package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.TuifangMapper;
import com.entity.Tuifang;
import com.server.TuifangServer;
@Service
public class TuifangServerImpi implements TuifangServer {
   @Resource
   private TuifangMapper gdao;
	@Override
	public int add(Tuifang po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Tuifang po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Tuifang> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Tuifang> getsytuifang1(Map<String, Object> map) {
		return gdao.getsytuifang1(map);
	}
	public List<Tuifang> getsytuifang2(Map<String, Object> map) {
		return gdao.getsytuifang2(map);
	}
	public List<Tuifang> getsytuifang3(Map<String, Object> map) {
		return gdao.getsytuifang3(map);
	}
	
	@Override
	public Tuifang quchongTuifang(Map<String, Object> account) {
		return gdao.quchongTuifang(account);
	}

	@Override
	public List<Tuifang> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Tuifang> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Tuifang getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

