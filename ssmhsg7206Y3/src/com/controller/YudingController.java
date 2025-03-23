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

import com.entity.Yuding;
import com.server.YudingServer;
import com.util.PageBean;
import net.sf.json.JSONObject;
import com.util.db;
import java.sql.SQLException;
import java.sql.*;
@Controller
public class YudingController {
	@Resource
	private YudingServer yudingService;


   
	@RequestMapping("addYuding.do")
	public String addYuding(HttpServletRequest request,Yuding yuding,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());
		
		yuding.setAddtime(time.toString().substring(0, 19));
		yudingService.add(yuding);
		
		String sql="";
		
       sql="update kefangxinxi set zhuangtai='已预约' where kefangbianhao='"+yuding.getKefangbianhao()+"'";
			
			
        db dbo = new db();
        dbo.hsgexecute(sql);
		
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		
		//session.setAttribute("backurl", "yudingList.do");
		
		return "redirect:postback.jsp";
		//return "redirect:yudingList.do";
		
		
		
	}
 
//	处理编辑
	@RequestMapping("doUpdateYuding.do")
	public String doUpdateYuding(int id,ModelMap map,Yuding yuding){
		yuding=yudingService.getById(id);
		map.put("yuding", yuding);
		return "yuding_updt";
	}
	
	
	
	
	
//	后台详细
	@RequestMapping("yudingDetail.do")
	public String yudingDetail(int id,ModelMap map,Yuding yuding){
		yuding=yudingService.getById(id);
		map.put("yuding", yuding);
		return "yuding_detail";
	}
//	前台详细
	@RequestMapping("ydDetail.do")
	public String ydDetail(int id,ModelMap map,Yuding yuding){
		yuding=yudingService.getById(id);
		map.put("yuding", yuding);
		return "yudingdetail";
	}
//	
	@RequestMapping("updateYuding.do")
	public String updateYuding(int id,ModelMap map,Yuding yuding,HttpServletRequest request,HttpSession session){
		yudingService.update(yuding);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:yudingList.do";
	}

//	分页查询
	@RequestMapping("yudingList.do")
	public String yudingList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Yuding yuding, String kefangbianhao, String kefangleixing, String jiage, String lvkebianhao, String lvkexingming, String shifouruzhu){
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
		if(shifouruzhu==null||shifouruzhu.equals("")){pmap.put("shifouruzhu", null);}else{pmap.put("shifouruzhu", shifouruzhu);}
		
		int total=yudingService.getCount(pmap);
		pageBean.setTotal(total);
		List<Yuding> list=yudingService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "yuding_list";
	}
	
		@RequestMapping("yudingList2.do")
	public String yudingList2(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Yuding yuding, String kefangbianhao, String kefangleixing, String jiage, String lvkebianhao, String lvkexingming, String shifouruzhu){
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
		if(shifouruzhu==null||shifouruzhu.equals("")){pmap.put("shifouruzhu", null);}else{pmap.put("shifouruzhu", shifouruzhu);}
		
		int total=yudingService.getCount(pmap);
		pageBean.setTotal(total);
		List<Yuding> list=yudingService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "yuding_list2";
	}
	
	
	@RequestMapping("ydList.do")
	public String ydList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Yuding yuding, String kefangbianhao, String kefangleixing, String jiage, String lvkebianhao, String lvkexingming, String shifouruzhu){
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
		if(shifouruzhu==null||shifouruzhu.equals("")){pmap.put("shifouruzhu", null);}else{pmap.put("shifouruzhu", shifouruzhu);}
		
		int total=yudingService.getCount(pmap);
		pageBean.setTotal(total);
		List<Yuding> list=yudingService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "yudinglist";
	}
	
	@RequestMapping("deleteYuding.do")
	public String deleteYuding(int id,HttpServletRequest request){
		yudingService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:yudingList.do";
	}
	
	
}
