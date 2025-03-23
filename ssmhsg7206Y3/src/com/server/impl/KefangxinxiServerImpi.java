package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.KefangxinxiMapper;
import com.entity.Kefangxinxi;
import com.server.KefangxinxiServer;
@Service
public class KefangxinxiServerImpi implements KefangxinxiServer {
   @Resource
   private KefangxinxiMapper gdao;
	@Override
	public int add(Kefangxinxi po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Kefangxinxi po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Kefangxinxi> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Kefangxinxi> getsykefangxinxi1(Map<String, Object> map) {
		return gdao.getsykefangxinxi1(map);
	}
	public List<Kefangxinxi> getsykefangxinxi2(Map<String, Object> map) {
		return gdao.getsykefangxinxi2(map);
	}
	public List<Kefangxinxi> getsykefangxinxi3(Map<String, Object> map) {
		return gdao.getsykefangxinxi3(map);
	}
	
	@Override
	public Kefangxinxi quchongKefangxinxi(Map<String, Object> account) {
		return gdao.quchongKefangxinxi(account);
	}

	@Override
	public List<Kefangxinxi> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Kefangxinxi> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Kefangxinxi getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

