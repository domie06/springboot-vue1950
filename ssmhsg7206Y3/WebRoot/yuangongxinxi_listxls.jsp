<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<jsp:useBean id="sn" scope="page" class="com.bean.SystemBean" />
<jsp:useBean id="yuangongxinxihsgb" scope="page" class="com.bean.YuangongxinxiBean" /> 

<%
response.setContentType("application/vnd.ms-excel");
response.addHeader("Content-Disposition", "attachment;filename=yuangongxinxi.xls");
%>
<html>
  <head>
    <title>员工信息</title>
  </head>

  <body >
 <%
			String sql="select * from yuangongxinxi  order by id desc";

			
			%>
<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">序号</td>
    <td align='center'>账号</td>    <td align='center'>密码</td>    <td align='center'>员工姓名</td>    <td  width='40' align='center'>性别</td>    <td align='center'>年龄</td>    <td align='center'>电话</td>    <td align='center'>地址</td>    
	
    <td width="120" align="center" bgcolor="CCFFFF">添加时间</td>
    
  </tr>
   <%		
				List pagelist3=yuangongxinxihsgb.getAllYuangongxinxi(9);
			if(!pagelist3.isEmpty()){
				for(int i=0;i<pagelist3.size();i++){
					List pagelist2 =(ArrayList)pagelist3.get(i);
			%>
  <tr>
    <td  align="center"><%=i+1 %></td>
    <td>${u.zhanghao}</td>    <td>${u.mima}</td>    <td>${u.yuangongxingming}</td>    <td align='center'>${u.xingbie}</td>    <td>${u.nianling}</td>    <td>${u.dianhua}</td>    <td>${u.dizhi}</td>    
	
	
   
  </tr>
  	<%
  }}
   %>
   
</table>
<br>
  </body>
</html>

