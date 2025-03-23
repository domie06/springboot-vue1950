<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<jsp:useBean id="sn" scope="page" class="com.bean.SystemBean" />
<jsp:useBean id="jiezhanghsgb" scope="page" class="com.bean.JiezhangBean" /> 

<%
response.setContentType("application/vnd.ms-excel");
response.addHeader("Content-Disposition", "attachment;filename=jiezhang.xls");
%>
<html>
  <head>
    <title>结账</title>
  </head>

  <body >
 <%
			String sql="select * from jiezhang  order by id desc";

			
			%>
<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">序号</td>
    <td align='center'>客房编号</td>
    <td align='center'>客房类型</td>
    <td align='center'>价格</td>
    <td align='center'>客户编号</td>
    <td align='center'>客户姓名</td>
    <td align='center'>入住时间</td>
    <td align='center'>入住天数</td>
    <td align='center'>总金额</td>
    
	
    <td width="120" align="center" bgcolor="CCFFFF">添加时间</td>
    
  </tr>
   <%		
				List pagelist3=jiezhanghsgb.getAllJiezhang(10);
			if(!pagelist3.isEmpty()){
				for(int i=0;i<pagelist3.size();i++){
					List pagelist2 =(ArrayList)pagelist3.get(i);
			%>
  <tr>
    <td  align="center"><%=i+1 %></td>
    <td>${u.kefangbianhao}</td>
    <td>${u.kefangleixing}</td>
    <td>${u.jiage}</td>
    <td>${u.lvkebianhao}</td>
    <td>${u.lvkexingming}</td>
    <td>${u.ruzhushijian}</td>
    <td>${u.ruzhutianshu}</td>
    <td>${u.zongjine}</td>
    
	
	
   
  </tr>
  	<%
  }}
   %>
   
</table>
<br>
  </body>
</html>

