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

import com.entity.Xiaofei;
import com.server.XiaofeiServer;
import com.util.PageBean;
import net.sf.json.JSONObject;
import com.util.db;
import java.sql.SQLException;
import java.sql.*;
@Controller
public class XiaofeiController {
	@Resource
	private XiaofeiServer xiaofeiService;


   
	@RequestMapping("addXiaofei.do")
	public String addXiaofei(HttpServletRequest request,Xiaofei xiaofei,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());
		
		xiaofei.setAddtime(time.toString().substring(0, 19));
		xiaofeiService.add(xiaofei);
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		
		//session.setAttribute("backurl", "xiaofeiList.do");
		
		return "redirect:postback.jsp";
		//return "redirect:xiaofeiList.do";
		
		
		
	}
 
//	处理编辑
	@RequestMapping("doUpdateXiaofei.do")
	public String doUpdateXiaofei(int id,ModelMap map,Xiaofei xiaofei){
		xiaofei=xiaofeiService.getById(id);
		map.put("xiaofei", xiaofei);
		return "xiaofei_updt";
	}
	
	
	
	
	
//	后台详细
	@RequestMapping("xiaofeiDetail.do")
	public String xiaofeiDetail(int id,ModelMap map,Xiaofei xiaofei){
		xiaofei=xiaofeiService.getById(id);
		map.put("xiaofei", xiaofei);
		return "xiaofei_detail";
	}
//	前台详细
	@RequestMapping("xfDetail.do")
	public String xfDetail(int id,ModelMap map,Xiaofei xiaofei){
		xiaofei=xiaofeiService.getById(id);
		map.put("xiaofei", xiaofei);
		return "xiaofeidetail";
	}
//	
	@RequestMapping("updateXiaofei.do")
	public String updateXiaofei(int id,ModelMap map,Xiaofei xiaofei,HttpServletRequest request,HttpSession session){
		xiaofeiService.update(xiaofei);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:xiaofeiList.do";
	}

//	分页查询
	@RequestMapping("xiaofeiList.do")
	public String xiaofeiList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Xiaofei xiaofei, String kefangbianhao, String kefangleixing, String lvkebianhao, String lvkexingming, String xiaofeimingcheng, String feiyong, String beizhu){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(kefangbianhao==null||kefangbianhao.equals("")){pmap.put("kefangbianhao", null);}else{pmap.put("kefangbianhao", kefangbianhao);}		if(kefangleixing==null||kefangleixing.equals("")){pmap.put("kefangleixing", null);}else{pmap.put("kefangleixing", kefangleixing);}		if(lvkebianhao==null||lvkebianhao.equals("")){pmap.put("lvkebianhao", null);}else{pmap.put("lvkebianhao", lvkebianhao);}		if(lvkexingming==null||lvkexingming.equals("")){pmap.put("lvkexingming", null);}else{pmap.put("lvkexingming", lvkexingming);}		if(xiaofeimingcheng==null||xiaofeimingcheng.equals("")){pmap.put("xiaofeimingcheng", null);}else{pmap.put("xiaofeimingcheng", xiaofeimingcheng);}		if(feiyong==null||feiyong.equals("")){pmap.put("feiyong", null);}else{pmap.put("feiyong", feiyong);}		if(beizhu==null||beizhu.equals("")){pmap.put("beizhu", null);}else{pmap.put("beizhu", beizhu);}		
		int total=xiaofeiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Xiaofei> list=xiaofeiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "xiaofei_list";
	}
	
	
	
	@RequestMapping("xfList.do")
	public String xfList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Xiaofei xiaofei, String kefangbianhao, String kefangleixing, String lvkebianhao, String lvkexingming, String xiaofeimingcheng, String feiyong, String beizhu){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(kefangbianhao==null||kefangbianhao.equals("")){pmap.put("kefangbianhao", null);}else{pmap.put("kefangbianhao", kefangbianhao);}		if(kefangleixing==null||kefangleixing.equals("")){pmap.put("kefangleixing", null);}else{pmap.put("kefangleixing", kefangleixing);}		if(lvkebianhao==null||lvkebianhao.equals("")){pmap.put("lvkebianhao", null);}else{pmap.put("lvkebianhao", lvkebianhao);}		if(lvkexingming==null||lvkexingming.equals("")){pmap.put("lvkexingming", null);}else{pmap.put("lvkexingming", lvkexingming);}		if(xiaofeimingcheng==null||xiaofeimingcheng.equals("")){pmap.put("xiaofeimingcheng", null);}else{pmap.put("xiaofeimingcheng", xiaofeimingcheng);}		if(feiyong==null||feiyong.equals("")){pmap.put("feiyong", null);}else{pmap.put("feiyong", feiyong);}		if(beizhu==null||beizhu.equals("")){pmap.put("beizhu", null);}else{pmap.put("beizhu", beizhu);}		
		int total=xiaofeiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Xiaofei> list=xiaofeiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "xiaofeilist";
	}
	
	@RequestMapping("deleteXiaofei.do")
	public String deleteXiaofei(int id,HttpServletRequest request){
		xiaofeiService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:xiaofeiList.do";
	}
	
	
}
