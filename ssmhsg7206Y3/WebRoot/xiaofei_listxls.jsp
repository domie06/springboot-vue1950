<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<jsp:useBean id="sn" scope="page" class="com.bean.SystemBean" />
<jsp:useBean id="xiaofeihsgb" scope="page" class="com.bean.XiaofeiBean" /> 

<%
response.setContentType("application/vnd.ms-excel");
response.addHeader("Content-Disposition", "attachment;filename=xiaofei.xls");
%>
<html>
  <head>
    <title>消费</title>
  </head>

  <body >
 <%
			String sql="select * from xiaofei  order by id desc";

			
			%>
<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="00FFFF" style="border-collapse:collapse">  
  <tr>
    <td width="30" align="center" bgcolor="CCFFFF">序号</td>
    <td align='center'>客房编号</td>
    <td align='center'>客房类型</td>
    <td align='center'>客户编号</td>
    <td align='center'>客户姓名</td>
    <td align='center'>消费名称</td>
    <td align='center'>费用</td>
    <td align='center'>备注</td>
    
	
    <td width="120" align="center" bgcolor="CCFFFF">添加时间</td>
    
  </tr>
   <%		
				List pagelist3=xiaofeihsgb.getAllXiaofei(9);
			if(!pagelist3.isEmpty()){
				for(int i=0;i<pagelist3.size();i++){
					List pagelist2 =(ArrayList)pagelist3.get(i);
			%>
  <tr>
    <td  align="center"><%=i+1 %></td>
    <td>${u.kefangbianhao}</td>
    <td>${u.kefangleixing}</td>
    <td>${u.lvkebianhao}</td>
    <td>${u.lvkexingming}</td>
    <td>${u.xiaofeimingcheng}</td>
    <td>${u.feiyong}</td>
    <td>${u.beizhu}</td>
    
	
	
   
  </tr>
  	<%
  }}
   %>
   
</table>
<br>
  </body>
</html>

