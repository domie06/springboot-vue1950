package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.XiaofeiMapper;
import com.entity.Xiaofei;
import com.server.XiaofeiServer;
@Service
public class XiaofeiServerImpi implements XiaofeiServer {
   @Resource
   private XiaofeiMapper gdao;
	@Override
	public int add(Xiaofei po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Xiaofei po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Xiaofei> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Xiaofei> getsyxiaofei1(Map<String, Object> map) {
		return gdao.getsyxiaofei1(map);
	}
	public List<Xiaofei> getsyxiaofei2(Map<String, Object> map) {
		return gdao.getsyxiaofei2(map);
	}
	public List<Xiaofei> getsyxiaofei3(Map<String, Object> map) {
		return gdao.getsyxiaofei3(map);
	}
	
	@Override
	public Xiaofei quchongXiaofei(Map<String, Object> account) {
		return gdao.quchongXiaofei(account);
	}

	@Override
	public List<Xiaofei> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Xiaofei> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Xiaofei getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

