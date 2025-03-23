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

import com.entity.Kefangxinxi;
import com.server.KefangxinxiServer;
import com.util.PageBean;
import net.sf.json.JSONObject;
import com.util.db;
import java.sql.SQLException;
import java.sql.*;
@Controller
public class KefangxinxiController {
	@Resource
	private KefangxinxiServer kefangxinxiService;


   
	@RequestMapping("addKefangxinxi.do")
	public String addKefangxinxi(HttpServletRequest request,Kefangxinxi kefangxinxi,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());
		
		kefangxinxi.setAddtime(time.toString().substring(0, 19));
		kefangxinxiService.add(kefangxinxi);
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		
		//session.setAttribute("backurl", "kefangxinxiList.do");
		
		return "redirect:postback.jsp";
		//return "redirect:kefangxinxiList.do";
		
		
		
	}
 
//	处理编辑
	@RequestMapping("doUpdateKefangxinxi.do")
	public String doUpdateKefangxinxi(int id,ModelMap map,Kefangxinxi kefangxinxi){
		kefangxinxi=kefangxinxiService.getById(id);
		map.put("kefangxinxi", kefangxinxi);
		return "kefangxinxi_updt";
	}
	
	
	
	
	
//	后台详细
	@RequestMapping("kefangxinxiDetail.do")
	public String kefangxinxiDetail(int id,ModelMap map,Kefangxinxi kefangxinxi){
		kefangxinxi=kefangxinxiService.getById(id);
		map.put("kefangxinxi", kefangxinxi);
		return "kefangxinxi_detail";
	}
//	前台详细
	@RequestMapping("kfxxDetail.do")
	public String kfxxDetail(int id,ModelMap map,Kefangxinxi kefangxinxi){
		kefangxinxi=kefangxinxiService.getById(id);
		map.put("kefangxinxi", kefangxinxi);
		return "kefangxinxidetail";
	}
//	
	@RequestMapping("updateKefangxinxi.do")
	public String updateKefangxinxi(int id,ModelMap map,Kefangxinxi kefangxinxi,HttpServletRequest request,HttpSession session){
		kefangxinxiService.update(kefangxinxi);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:kefangxinxiList.do";
	}

//	分页查询
	@RequestMapping("kefangxinxiList.do")
	public String kefangxinxiList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Kefangxinxi kefangxinxi, String kefangbianhao, String kefangleixing, String jiage1,String jiage2, String zhuangtai){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(kefangbianhao==null||kefangbianhao.equals("")){pmap.put("kefangbianhao", null);}else{pmap.put("kefangbianhao", kefangbianhao);}		if(kefangleixing==null||kefangleixing.equals("")){pmap.put("kefangleixing", null);}else{pmap.put("kefangleixing", kefangleixing);}		if(jiage1==null||jiage1.equals("")){pmap.put("jiage1", null);}else{pmap.put("jiage1", jiage1);}		if(jiage2==null||jiage2.equals("")){pmap.put("jiage2", null);}else{pmap.put("jiage2", jiage2);}		if(zhuangtai==null||zhuangtai.equals("")){pmap.put("zhuangtai", null);}else{pmap.put("zhuangtai", zhuangtai);}		
		int total=kefangxinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Kefangxinxi> list=kefangxinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "kefangxinxi_list";
	}
	
	
	
	@RequestMapping("kfxxList.do")
	public String kfxxList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Kefangxinxi kefangxinxi, String kefangbianhao, String kefangleixing, String jiage1,String jiage2, String zhuangtai){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);
		
		
		if(kefangbianhao==null||kefangbianhao.equals("")){pmap.put("kefangbianhao", null);}else{pmap.put("kefangbianhao", kefangbianhao);}		if(kefangleixing==null||kefangleixing.equals("")){pmap.put("kefangleixing", null);}else{pmap.put("kefangleixing", kefangleixing);}		if(jiage1==null||jiage1.equals("")){pmap.put("jiage1", null);}else{pmap.put("jiage1", jiage1);}		if(jiage2==null||jiage2.equals("")){pmap.put("jiage2", null);}else{pmap.put("jiage2", jiage2);}		if(zhuangtai==null||zhuangtai.equals("")){pmap.put("zhuangtai", null);}else{pmap.put("zhuangtai", zhuangtai);}		
		int total=kefangxinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Kefangxinxi> list=kefangxinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "kefangxinxilist";
	}
	
	@RequestMapping("deleteKefangxinxi.do")
	public String deleteKefangxinxi(int id,HttpServletRequest request){
		kefangxinxiService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:kefangxinxiList.do";
	}
	
	@RequestMapping("quchongKefangxinxi.do")
	public void quchongKefangxinxi(Kefangxinxi kefangxinxi,HttpServletResponse response){
		   Map<String,Object> map=new HashMap<String,Object>();
		   map.put("kefangbianhao", kefangxinxi.getKefangbianhao());
		   System.out.println("kefangbianhao==="+kefangxinxi.getKefangbianhao());
		   System.out.println("kefangbianhao222==="+kefangxinxiService.quchongKefangxinxi(map));
		   JSONObject obj=new JSONObject();
		   if(kefangxinxiService.quchongKefangxinxi(map)!=null){
				 obj.put("info", "ng");
			   }else{
				   obj.put("info", "客房编号可以用！");
				  
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
