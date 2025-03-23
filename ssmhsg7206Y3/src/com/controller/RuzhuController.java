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

import com.entity.Ruzhu;
import com.server.RuzhuServer;
import com.util.PageBean;
import net.sf.json.JSONObject;
import com.util.db;
import java.sql.SQLException;
import java.sql.*;
@Controller
public class RuzhuController {
	@Resource
	private RuzhuServer ruzhuService;


   
	@RequestMapping("addRuzhu.do")
	public String addRuzhu(HttpServletRequest request,Ruzhu ruzhu,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());
		
		ruzhu.setAddtime(time.toString().substring(0, 19));
		ruzhuService.add(ruzhu);
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		
		//session.setAttribute("backurl", "ruzhuList.do");
		
		return "redirect:postback.jsp";
		//return "redirect:ruzhuList.do";
		
		
		
	}
 
//	处理编辑
	@RequestMapping("doUpdateRuzhu.do")
	public String doUpdateRuzhu(int id,ModelMap map,Ruzhu ruzhu){
		ruzhu=ruzhuService.getById(id);
		map.put("ruzhu", ruzhu);
		return "ruzhu_updt";
	}
	
	
	
	
	
//	后台详细
	@RequestMapping("ruzhuDetail.do")
	public String ruzhuDetail(int id,ModelMap map,Ruzhu ruzhu){
		ruzhu=ruzhuService.getById(id);
		map.put("ruzhu", ruzhu);
		return "ruzhu_detail";
	}
//	前台详细
	@RequestMapping("rzDetail.do")
	public String rzDetail(int id,ModelMap map,Ruzhu ruzhu){
		ruzhu=ruzhuService.getById(id);
		map.put("ruzhu", ruzhu);
		return "ruzhudetail";
	}
//	
	@RequestMapping("updateRuzhu.do")
	public String updateRuzhu(int id,ModelMap map,Ruzhu ruzhu,HttpServletRequest request,HttpSession session){
		ruzhuService.update(ruzhu);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:ruzhuList.do";
	}

//	分页查询
	@RequestMapping("ruzhuList.do")
	public String ruzhuList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Ruzhu ruzhu, String kefangbianhao, String kefangleixing, String jiage, String lvkebianhao, String lvkexingming, String shenfenzheng, String ruzhushijian1,String ruzhushijian2){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(kefangbianhao==null||kefangbianhao.equals("")){pmap.put("kefangbianhao", null);}else{pmap.put("kefangbianhao", kefangbianhao);}
		if(kefangleixing==null||kefangleixing.equals("")){pmap.put("kefangleixing", null);}else{pmap.put("kefangleixing", kefangleixing);}
		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}
		if(lvkebianhao==null||lvkebianhao.equals("")){pmap.put("lvkebianhao", null);}else{pmap.put("lvkebianhao", lvkebianhao);}
		if(lvkexingming==null||lvkexingming.equals("")){pmap.put("lvkexingming", null);}else{pmap.put("lvkexingming", lvkexingming);}
		if(shenfenzheng==null||shenfenzheng.equals("")){pmap.put("shenfenzheng", null);}else{pmap.put("shenfenzheng", shenfenzheng);}
		if(ruzhushijian1==null||ruzhushijian1.equals("")){pmap.put("ruzhushijian1", null);}else{pmap.put("ruzhushijian1", ruzhushijian1);}
		if(ruzhushijian2==null||ruzhushijian2.equals("")){pmap.put("ruzhushijian2", null);}else{pmap.put("ruzhushijian2", ruzhushijian2);}
		
		int total=ruzhuService.getCount(pmap);
		pageBean.setTotal(total);
		List<Ruzhu> list=ruzhuService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "ruzhu_list";
	}
	
	@RequestMapping("ruzhuList2.do")
	public String ruzhuList2(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Ruzhu ruzhu, String kefangbianhao, String kefangleixing, String jiage, String lvkebianhao, String lvkexingming, String shenfenzheng, String ruzhushijian1,String ruzhushijian2){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(kefangbianhao==null||kefangbianhao.equals("")){pmap.put("kefangbianhao", null);}else{pmap.put("kefangbianhao", kefangbianhao);}
		if(kefangleixing==null||kefangleixing.equals("")){pmap.put("kefangleixing", null);}else{pmap.put("kefangleixing", kefangleixing);}
		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}
		if(lvkebianhao==null||lvkebianhao.equals("")){pmap.put("lvkebianhao", null);}else{pmap.put("lvkebianhao", lvkebianhao);}
		if(lvkexingming==null||lvkexingming.equals("")){pmap.put("lvkexingming", null);}else{pmap.put("lvkexingming", lvkexingming);}
		if(shenfenzheng==null||shenfenzheng.equals("")){pmap.put("shenfenzheng", null);}else{pmap.put("shenfenzheng", shenfenzheng);}
		if(ruzhushijian1==null||ruzhushijian1.equals("")){pmap.put("ruzhushijian1", null);}else{pmap.put("ruzhushijian1", ruzhushijian1);}
		if(ruzhushijian2==null||ruzhushijian2.equals("")){pmap.put("ruzhushijian2", null);}else{pmap.put("ruzhushijian2", ruzhushijian2);}
		
		int total=ruzhuService.getCount(pmap);
		pageBean.setTotal(total);
		List<Ruzhu> list=ruzhuService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "ruzhu_list2";
	}
	
	@RequestMapping("ruzhuList3.do")
	public String ruzhuList3(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Ruzhu ruzhu, String kefangbianhao, String kefangleixing, String jiage, String lvkebianhao, String lvkexingming, String shenfenzheng, String ruzhushijian1,String ruzhushijian2){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(kefangbianhao==null||kefangbianhao.equals("")){pmap.put("kefangbianhao", null);}else{pmap.put("kefangbianhao", kefangbianhao);}
		if(kefangleixing==null||kefangleixing.equals("")){pmap.put("kefangleixing", null);}else{pmap.put("kefangleixing", kefangleixing);}
		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}
		if(lvkebianhao==null||lvkebianhao.equals("")){pmap.put("lvkebianhao", null);}else{pmap.put("lvkebianhao", lvkebianhao);}
		if(lvkexingming==null||lvkexingming.equals("")){pmap.put("lvkexingming", null);}else{pmap.put("lvkexingming", lvkexingming);}
		if(shenfenzheng==null||shenfenzheng.equals("")){pmap.put("shenfenzheng", null);}else{pmap.put("shenfenzheng", shenfenzheng);}
		if(ruzhushijian1==null||ruzhushijian1.equals("")){pmap.put("ruzhushijian1", null);}else{pmap.put("ruzhushijian1", ruzhushijian1);}
		if(ruzhushijian2==null||ruzhushijian2.equals("")){pmap.put("ruzhushijian2", null);}else{pmap.put("ruzhushijian2", ruzhushijian2);}
		
		int total=ruzhuService.getCount(pmap);
		pageBean.setTotal(total);
		List<Ruzhu> list=ruzhuService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "ruzhu_list3";
	}
	
	@RequestMapping("rzList.do")
	public String rzList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Ruzhu ruzhu, String kefangbianhao, String kefangleixing, String jiage, String lvkebianhao, String lvkexingming, String shenfenzheng, String ruzhushijian1,String ruzhushijian2){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(kefangbianhao==null||kefangbianhao.equals("")){pmap.put("kefangbianhao", null);}else{pmap.put("kefangbianhao", kefangbianhao);}
		if(kefangleixing==null||kefangleixing.equals("")){pmap.put("kefangleixing", null);}else{pmap.put("kefangleixing", kefangleixing);}
		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}
		if(lvkebianhao==null||lvkebianhao.equals("")){pmap.put("lvkebianhao", null);}else{pmap.put("lvkebianhao", lvkebianhao);}
		if(lvkexingming==null||lvkexingming.equals("")){pmap.put("lvkexingming", null);}else{pmap.put("lvkexingming", lvkexingming);}
		if(shenfenzheng==null||shenfenzheng.equals("")){pmap.put("shenfenzheng", null);}else{pmap.put("shenfenzheng", shenfenzheng);}
		if(ruzhushijian1==null||ruzhushijian1.equals("")){pmap.put("ruzhushijian1", null);}else{pmap.put("ruzhushijian1", ruzhushijian1);}
		if(ruzhushijian2==null||ruzhushijian2.equals("")){pmap.put("ruzhushijian2", null);}else{pmap.put("ruzhushijian2", ruzhushijian2);}
		
		int total=ruzhuService.getCount(pmap);
		pageBean.setTotal(total);
		List<Ruzhu> list=ruzhuService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "ruzhulist";
	}
	
	@RequestMapping("deleteRuzhu.do")
	public String deleteRuzhu(int id,HttpServletRequest request){
		ruzhuService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:ruzhuList.do";
	}
	
	
}
