<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<jsp:useBean id="sn" scope="page" class="com.bean.SystemBean" />
<jsp:useBean id="tuifanghsgb" scope="page" class="com.bean.TuifangBean" /> 

<%
response.setContentType("application/vnd.ms-excel");
response.addHeader("Content-Disposition", "attachment;filename=tuifang.xls");
%>
<html>
  <head>
    <title>退房</title>
  </head>

  <body >
 <%
			String sql="select * from tuifang  order by id desc";

			
			%>
<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">序号</td>
    <td align='center'>客房编号</td>
    <td align='center'>客房类型</td>
    <td align='center'>价格</td>
    <td align='center'>客户编号</td>
    <td align='center'>客户姓名</td>
    <td align='center'>退房理由</td>
    <td  width='80' align='center'>是否审核</td>
	
    <td width="120" align="center" bgcolor="CCFFFF">添加时间</td>
    
  </tr>
   <%		
				List pagelist3=tuifanghsgb.getAllTuifang(9);
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
    <td>${u.tuifangliyou}</td>
    <td align='center'>${u.issh} <input type="button" value="审核" onclick="javascript:location.href='sh.jsp?id=${u.id}&yuan=${u.issh}&tablename=tuifang'"/></td>
	
	
   
  </tr>
  	<%
  }}
   %>
   
</table>
<br>
  </body>
</html>

