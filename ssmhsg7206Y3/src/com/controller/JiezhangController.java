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

import com.entity.Jiezhang;
import com.server.JiezhangServer;
import com.util.PageBean;
import net.sf.json.JSONObject;
import com.util.db;
import java.sql.SQLException;
import java.sql.*;
@Controller
public class JiezhangController {
	@Resource
	private JiezhangServer jiezhangService;


   
	@RequestMapping("addJiezhang.do")
	public String addJiezhang(HttpServletRequest request,Jiezhang jiezhang,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());
		
		jiezhang.setAddtime(time.toString().substring(0, 19));
		jiezhangService.add(jiezhang);
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		
		//session.setAttribute("backurl", "jiezhangList.do");
		
		return "redirect:postback.jsp";
		//return "redirect:jiezhangList.do";
		
		
		
	}
 
//	处理编辑
	@RequestMapping("doUpdateJiezhang.do")
	public String doUpdateJiezhang(int id,ModelMap map,Jiezhang jiezhang){
		jiezhang=jiezhangService.getById(id);
		map.put("jiezhang", jiezhang);
		return "jiezhang_updt";
	}
	
	
	
	
	
//	后台详细
	@RequestMapping("jiezhangDetail.do")
	public String jiezhangDetail(int id,ModelMap map,Jiezhang jiezhang){
		jiezhang=jiezhangService.getById(id);
		map.put("jiezhang", jiezhang);
		return "jiezhang_detail";
	}
//	前台详细
	@RequestMapping("jzDetail.do")
	public String jzDetail(int id,ModelMap map,Jiezhang jiezhang){
		jiezhang=jiezhangService.getById(id);
		map.put("jiezhang", jiezhang);
		return "jiezhangdetail";
	}
//	
	@RequestMapping("updateJiezhang.do")
	public String updateJiezhang(int id,ModelMap map,Jiezhang jiezhang,HttpServletRequest request,HttpSession session){
		jiezhangService.update(jiezhang);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:jiezhangList.do";
	}

//	分页查询
	@RequestMapping("jiezhangList.do")
	public String jiezhangList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Jiezhang jiezhang, String kefangbianhao, String kefangleixing, String jiage, String lvkebianhao, String lvkexingming, String ruzhushijian, String ruzhutianshu1,String ruzhutianshu2, String zongjine){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(kefangbianhao==null||kefangbianhao.equals("")){pmap.put("kefangbianhao", null);}else{pmap.put("kefangbianhao", kefangbianhao);}		if(kefangleixing==null||kefangleixing.equals("")){pmap.put("kefangleixing", null);}else{pmap.put("kefangleixing", kefangleixing);}		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}		if(lvkebianhao==null||lvkebianhao.equals("")){pmap.put("lvkebianhao", null);}else{pmap.put("lvkebianhao", lvkebianhao);}		if(lvkexingming==null||lvkexingming.equals("")){pmap.put("lvkexingming", null);}else{pmap.put("lvkexingming", lvkexingming);}		if(ruzhushijian==null||ruzhushijian.equals("")){pmap.put("ruzhushijian", null);}else{pmap.put("ruzhushijian", ruzhushijian);}		if(ruzhutianshu1==null||ruzhutianshu1.equals("")){pmap.put("ruzhutianshu1", null);}else{pmap.put("ruzhutianshu1", ruzhutianshu1);}		if(ruzhutianshu2==null||ruzhutianshu2.equals("")){pmap.put("ruzhutianshu2", null);}else{pmap.put("ruzhutianshu2", ruzhutianshu2);}		if(zongjine==null||zongjine.equals("")){pmap.put("zongjine", null);}else{pmap.put("zongjine", zongjine);}		
		int total=jiezhangService.getCount(pmap);
		pageBean.setTotal(total);
		List<Jiezhang> list=jiezhangService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "jiezhang_list";
	}
	
	
	
	@RequestMapping("jzList.do")
	public String jzList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Jiezhang jiezhang, String kefangbianhao, String kefangleixing, String jiage, String lvkebianhao, String lvkexingming, String ruzhushijian, String ruzhutianshu1,String ruzhutianshu2, String zongjine){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(kefangbianhao==null||kefangbianhao.equals("")){pmap.put("kefangbianhao", null);}else{pmap.put("kefangbianhao", kefangbianhao);}		if(kefangleixing==null||kefangleixing.equals("")){pmap.put("kefangleixing", null);}else{pmap.put("kefangleixing", kefangleixing);}		if(jiage==null||jiage.equals("")){pmap.put("jiage", null);}else{pmap.put("jiage", jiage);}		if(lvkebianhao==null||lvkebianhao.equals("")){pmap.put("lvkebianhao", null);}else{pmap.put("lvkebianhao", lvkebianhao);}		if(lvkexingming==null||lvkexingming.equals("")){pmap.put("lvkexingming", null);}else{pmap.put("lvkexingming", lvkexingming);}		if(ruzhushijian==null||ruzhushijian.equals("")){pmap.put("ruzhushijian", null);}else{pmap.put("ruzhushijian", ruzhushijian);}		if(ruzhutianshu1==null||ruzhutianshu1.equals("")){pmap.put("ruzhutianshu1", null);}else{pmap.put("ruzhutianshu1", ruzhutianshu1);}		if(ruzhutianshu2==null||ruzhutianshu2.equals("")){pmap.put("ruzhutianshu2", null);}else{pmap.put("ruzhutianshu2", ruzhutianshu2);}		if(zongjine==null||zongjine.equals("")){pmap.put("zongjine", null);}else{pmap.put("zongjine", zongjine);}		
		int total=jiezhangService.getCount(pmap);
		pageBean.setTotal(total);
		List<Jiezhang> list=jiezhangService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "jiezhanglist";
	}
	
	@RequestMapping("deleteJiezhang.do")
	public String deleteJiezhang(int id,HttpServletRequest request){
		jiezhangService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:jiezhangList.do";
	}
	
	
}
