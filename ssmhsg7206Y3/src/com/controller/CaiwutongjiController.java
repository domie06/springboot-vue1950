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

import com.entity.Caiwutongji;
import com.server.CaiwutongjiServer;
import com.util.PageBean;
import net.sf.json.JSONObject;
import com.util.db;
import java.sql.SQLException;
import java.sql.*;
@Controller
public class CaiwutongjiController {
	@Resource
	private CaiwutongjiServer caiwutongjiService;


   
	@RequestMapping("addCaiwutongji.do")
	public String addCaiwutongji(HttpServletRequest request,Caiwutongji caiwutongji,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());
		
		caiwutongji.setAddtime(time.toString().substring(0, 19));
		caiwutongjiService.add(caiwutongji);
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		
		//session.setAttribute("backurl", "caiwutongjiList.do");
		
		return "redirect:postback.jsp";
		//return "redirect:caiwutongjiList.do";
		
		
		
	}
 
//	处理编辑
	@RequestMapping("doUpdateCaiwutongji.do")
	public String doUpdateCaiwutongji(int id,ModelMap map,Caiwutongji caiwutongji){
		caiwutongji=caiwutongjiService.getById(id);
		map.put("caiwutongji", caiwutongji);
		return "caiwutongji_updt";
	}
	
	
	
	
	
//	后台详细
	@RequestMapping("caiwutongjiDetail.do")
	public String caiwutongjiDetail(int id,ModelMap map,Caiwutongji caiwutongji){
		caiwutongji=caiwutongjiService.getById(id);
		map.put("caiwutongji", caiwutongji);
		return "caiwutongji_detail";
	}
//	前台详细
	@RequestMapping("cwtjDetail.do")
	public String cwtjDetail(int id,ModelMap map,Caiwutongji caiwutongji){
		caiwutongji=caiwutongjiService.getById(id);
		map.put("caiwutongji", caiwutongji);
		return "caiwutongjidetail";
	}
//	
	@RequestMapping("updateCaiwutongji.do")
	public String updateCaiwutongji(int id,ModelMap map,Caiwutongji caiwutongji,HttpServletRequest request,HttpSession session){
		caiwutongjiService.update(caiwutongji);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:caiwutongjiList.do";
	}

//	分页查询
	@RequestMapping("caiwutongjiList.do")
	public String caiwutongjiList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Caiwutongji caiwutongji, String caiwubianhao, String caiwumingcheng, String caiwubaobiao, String shuoming){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 5);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 5);
		
		
		if(caiwubianhao==null||caiwubianhao.equals("")){pmap.put("caiwubianhao", null);}else{pmap.put("caiwubianhao", caiwubianhao);}		if(caiwumingcheng==null||caiwumingcheng.equals("")){pmap.put("caiwumingcheng", null);}else{pmap.put("caiwumingcheng", caiwumingcheng);}		if(caiwubaobiao==null||caiwubaobiao.equals("")){pmap.put("caiwubaobiao", null);}else{pmap.put("caiwubaobiao", caiwubaobiao);}		if(shuoming==null||shuoming.equals("")){pmap.put("shuoming", null);}else{pmap.put("shuoming", shuoming);}		
		int total=caiwutongjiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Caiwutongji> list=caiwutongjiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "caiwutongji_list";
	}
	
	
	
	@RequestMapping("cwtjList.do")
	public String cwtjList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Caiwutongji caiwutongji, String caiwubianhao, String caiwumingcheng, String caiwubaobiao, String shuoming){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 5);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 5);
		
		
		if(caiwubianhao==null||caiwubianhao.equals("")){pmap.put("caiwubianhao", null);}else{pmap.put("caiwubianhao", caiwubianhao);}		if(caiwumingcheng==null||caiwumingcheng.equals("")){pmap.put("caiwumingcheng", null);}else{pmap.put("caiwumingcheng", caiwumingcheng);}		if(caiwubaobiao==null||caiwubaobiao.equals("")){pmap.put("caiwubaobiao", null);}else{pmap.put("caiwubaobiao", caiwubaobiao);}		if(shuoming==null||shuoming.equals("")){pmap.put("shuoming", null);}else{pmap.put("shuoming", shuoming);}		
		int total=caiwutongjiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Caiwutongji> list=caiwutongjiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "caiwutongjilist";
	}
	
	@RequestMapping("deleteCaiwutongji.do")
	public String deleteCaiwutongji(int id,HttpServletRequest request){
		caiwutongjiService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:caiwutongjiList.do";
	}
	
	@RequestMapping("quchongCaiwutongji.do")
	public void quchongCaiwutongji(Caiwutongji caiwutongji,HttpServletResponse response){
		   Map<String,Object> map=new HashMap<String,Object>();
		   map.put("caiwubianhao", caiwutongji.getCaiwubianhao());
		   System.out.println("caiwubianhao==="+caiwutongji.getCaiwubianhao());
		   System.out.println("caiwubianhao222==="+caiwutongjiService.quchongCaiwutongji(map));
		   JSONObject obj=new JSONObject();
		   if(caiwutongjiService.quchongCaiwutongji(map)!=null){
				 obj.put("info", "ng");
			   }else{
				   obj.put("info", "财务编号可以用！");
				  
			   }
		   response.setContentType("text/html;charset=utf-8");
		   PrintWriter out=null;
		   try {
			out=response.getWriter();
			out.print(obj);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			out.close();
		}
	}
}
