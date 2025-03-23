package com.controller;

import java.io.File;
import java.io.IOException;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.entity.Tuifang;
import com.server.TuifangServer;
import com.util.PageBean;
import net.sf.json.JSONObject;
import com.util.db;
import java.sql.SQLException;
import java.sql.*;
@Controller
public class TuifangController {
	@Resource
	private TuifangServer tuifangService;


   
	@RequestMapping("addTuifang.do")
	public String addTuifang(HttpServletRequest request,Tuifang tuifang,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());
		
		tuifang.setAddtime(time.toString().substring(0, 19));
		tuifangService.add(tuifang);
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		
		//session.setAttribute("backurl", "tuifangList.do");
		
		return "redirect:postback.jsp";
		//return "redirect:tuifangList.do";
		
		
		
	}
 
//	处理编辑
	@RequestMapping("doUpdateTuifang.do")
	public String doUpdateTuifang(int id,ModelMap map,Tuifang tuifang){
		tuifang=tuifangService.getById(id);
		map.put("tuifang", tuifang);
		return "tuifang_updt";
	}
	
	
	
	
	
//	后台详细
	@RequestMapping("tuifangDetail.do")
	public String tuifangDetail(int id,ModelMap map,Tuifang tuifang){
		tuifang=tuifangService.getById(id);
		map.put("tuifang", tuifang);
		return "tuifang_detail";
	}
//	前台详细
	@RequestMapping("tfDetail.do")
	public String tfDetail(int id,ModelMap map,Tuifang tuifang){
		tuifang=tuifangService.getById(id);
		map.put("tuifang", tuifang);
		return "tuifangdetail";
	}
//	
	@RequestMapping("updateTuifang.do")
	public String updateTuifang(int id,ModelMap map,Tuifang tuifang,HttpServletRequest request,HttpSession session){
		tuifangService.update(tuifang);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:tuifangList.do";
	}

//	分页查询
	@RequestMapping("tuifangList.do")
	public String tuifangList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Tuifang tuifang, String kefangbianhao, String kefangleixing, String jiage, String lvkebianhao, String lvkexingming, String tuifangliyou, String issh){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(kefangbianhao==null||kefangbianhao.equals("")){pmap.put("kefangbianhao", null);}else{pmap.put("kefangbianhao", kefangbianhao);}		if(kefangleixing==null||kefangleixing.equals("")){pmap.put("kefangleixing", null);}else{pmap.put("kefangleixing", kefangleixing);}		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}		if(lvkebianhao==null||lvkebianhao.equals("")){pmap.put("lvkebianhao", null);}else{pmap.put("lvkebianhao", lvkebianhao);}		if(lvkexingming==null||lvkexingming.equals("")){pmap.put("lvkexingming", null);}else{pmap.put("lvkexingming", lvkexingming);}		if(tuifangliyou==null||tuifangliyou.equals("")){pmap.put("tuifangliyou", null);}else{pmap.put("tuifangliyou", tuifangliyou);}		
		int total=tuifangService.getCount(pmap);
		pageBean.setTotal(total);
		List<Tuifang> list=tuifangService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "tuifang_list";
	}
	
	
	
	@RequestMapping("tfList.do")
	public String tfList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Tuifang tuifang, String kefangbianhao, String kefangleixing, String jiage, String lvkebianhao, String lvkexingming, String tuifangliyou, String issh){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(kefangbianhao==null||kefangbianhao.equals("")){pmap.put("kefangbianhao", null);}else{pmap.put("kefangbianhao", kefangbianhao);}		if(kefangleixing==null||kefangleixing.equals("")){pmap.put("kefangleixing", null);}else{pmap.put("kefangleixing", kefangleixing);}		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}		if(lvkebianhao==null||lvkebianhao.equals("")){pmap.put("lvkebianhao", null);}else{pmap.put("lvkebianhao", lvkebianhao);}		if(lvkexingming==null||lvkexingming.equals("")){pmap.put("lvkexingming", null);}else{pmap.put("lvkexingming", lvkexingming);}		if(tuifangliyou==null||tuifangliyou.equals("")){pmap.put("tuifangliyou", null);}else{pmap.put("tuifangliyou", tuifangliyou);}		
		int total=tuifangService.getCount(pmap);
		pageBean.setTotal(total);
		List<Tuifang> list=tuifangService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "tuifanglist";
	}
	
	@RequestMapping("deleteTuifang.do")
	public String deleteTuifang(int id,HttpServletRequest request){
		tuifangService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:tuifangList.do";
	}
	
	
}
