package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.JiezhangMapper;
import com.entity.Jiezhang;
import com.server.JiezhangServer;
@Service
public class JiezhangServerImpi implements JiezhangServer {
   @Resource
   private JiezhangMapper gdao;
	@Override
	public int add(Jiezhang po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Jiezhang po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Jiezhang> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Jiezhang> getsyjiezhang1(Map<String, Object> map) {
		return gdao.getsyjiezhang1(map);
	}
	public List<Jiezhang> getsyjiezhang2(Map<String, Object> map) {
		return gdao.getsyjiezhang2(map);
	}
	public List<Jiezhang> getsyjiezhang3(Map<String, Object> map) {
		return gdao.getsyjiezhang3(map);
	}
	
	@Override
	public Jiezhang quchongJiezhang(Map<String, Object> account) {
		return gdao.quchongJiezhang(account);
	}

	@Override
	public List<Jiezhang> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Jiezhang> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Jiezhang getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

