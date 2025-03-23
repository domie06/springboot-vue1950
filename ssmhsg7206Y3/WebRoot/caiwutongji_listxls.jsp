<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<jsp:useBean id="sn" scope="page" class="com.bean.SystemBean" />
<jsp:useBean id="caiwutongjihsgb" scope="page" class="com.bean.CaiwutongjiBean" /> 

<%
response.setContentType("application/vnd.ms-excel");
response.addHeader("Content-Disposition", "attachment;filename=caiwutongji.xls");
%>
<html>
  <head>
    <title>财务统计</title>
  </head>

  <body >
 <%
			String sql="select * from caiwutongji  order by id desc";

			
			%>
<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">序号</td>
    <td align='center'>财务编号</td>    <td align='center'>财务名称</td>    <td  width='90' align='center'>财务报表</td>    <td align='center'>说明</td>    
	
    <td width="120" align="center" bgcolor="CCFFFF">添加时间</td>
    
  </tr>
   <%		
				List pagelist3=caiwutongjihsgb.getAllCaiwutongji(6);
			if(!pagelist3.isEmpty()){
				for(int i=0;i<pagelist3.size();i++){
					List pagelist2 =(ArrayList)pagelist3.get(i);
			%>
  <tr>
    <td  align="center"><%=i+1 %></td>
    <td>${u.caiwubianhao}</td>    <td>${u.caiwumingcheng}</td>    <td width='90' align='center'><a href='${u.caiwubaobiao}' target='_blank'><img src='${u.caiwubaobiao}' width=88 height=99 border=0 /></a></td>    <td>${u.shuoming}</td>    
	
	
   
  </tr>
  	<%
  }}
   %>
   
</table>
<br>
  </body>
</html>

