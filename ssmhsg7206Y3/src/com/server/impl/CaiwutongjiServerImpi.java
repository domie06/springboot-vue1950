package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.CaiwutongjiMapper;
import com.entity.Caiwutongji;
import com.server.CaiwutongjiServer;
@Service
public class CaiwutongjiServerImpi implements CaiwutongjiServer {
   @Resource
   private CaiwutongjiMapper gdao;
	@Override
	public int add(Caiwutongji po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Caiwutongji po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Caiwutongji> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Caiwutongji> getsycaiwutongji1(Map<String, Object> map) {
		return gdao.getsycaiwutongji1(map);
	}
	public List<Caiwutongji> getsycaiwutongji2(Map<String, Object> map) {
		return gdao.getsycaiwutongji2(map);
	}
	public List<Caiwutongji> getsycaiwutongji3(Map<String, Object> map) {
		return gdao.getsycaiwutongji3(map);
	}
	
	@Override
	public Caiwutongji quchongCaiwutongji(Map<String, Object> account) {
		return gdao.quchongCaiwutongji(account);
	}

	@Override
	public List<Caiwutongji> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Caiwutongji> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Caiwutongji getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

