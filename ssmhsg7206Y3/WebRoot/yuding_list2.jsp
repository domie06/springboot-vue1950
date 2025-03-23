<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>


<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
<script type="text/javascript" src="js/popup.js"></script>
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
	<TITLE>预订查询</TITLE>
	<style type="text/css">
<!--
body,td,th {
	font-size: 12px;
}
-->
</style>
	</head>
	<body>
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
			<tr valign="top">
				<td>
					<table width="100%" border="0" align="center" cellpadding="4" cellspacing="1" bgcolor="#aec3de">
						<tr align="left" bgcolor="#F2FDFF">
							<td colspan="17" background="images/table_header.gif">预订列表</td>
						</tr>
					</table>
				</td>
			</tr>
			
			<tr valign="top">
			  <td bgcolor="#FFFFFF">
			  <table width="100%" border="0" align="center" cellpadding="4" cellspacing="1" bgcolor="#aec3de">
						
					<tr align="right" bgcolor="#ebf0f7">
					  <td colspan="21">
					  <table width="100%" border="0" align="center" cellpadding="4" cellspacing="1" >
						<tr align="left" >
							<td colspan="17">
								<form action="yudingList2.do" name="myform" method="post">
									查询   客房编号：<input name="kefangbianhao" type="text" id="kefangbianhao" style='border:solid 1px #000000; color:#666666' size="12" />  客房类型：<input name="kefangleixing" type="text" id="kefangleixing" style='border:solid 1px #000000; color:#666666' size="12" />  客户编号：<input name="lvkebianhao" type="text" id="lvkebianhao" style='border:solid 1px #000000; color:#666666' size="12" />  客户姓名：<input name="lvkexingming" type="text" id="lvkexingming" style='border:solid 1px #000000; color:#666666' size="12" /> 是否入住：<select name='shifouruzhu' id='shifouruzhu' style='border:solid 1px #000000; color:#666666;'><option value="">所有</option><option value="否">否</option><option value="是">是</option></select>
									<input type="submit" value="查询" />
								</form>								</td>
						</tr></table>
					  </td>
			    </tr>
					
						<tr align="center">
						<td style="padding-left:0px; padding-right:0px;"><table width="100%" border="0" align="center" cellpadding="4" cellspacing="1" bgcolor="#ebf0f7">
                          <tr>
                            <td align="center" bgcolor="#ebf0f7" width="30px">序号</td>
                            <td align='center'>客房编号</td>
    <td align='center'>客房类型</td>
    <td align='center'>价格</td>
    <td align='center'>客户编号</td>
    <td align='center'>客户姓名</td>
    <td align='center'>是否入住</td>
    
                            <td align="center" bgcolor="#ebf0f7" width="150px"> 添加时间 </td>
                            <td align="center" bgcolor="#ebf0f7" width="150px"> 操作 </td>
                          </tr>
                          <%
					int i=0;
				%>
                          <c:forEach items="${list }" var="u">
                            <%
					i++;
				%>
                            <tr align="center" bgcolor="#FFFFFF">
                              <td align="center"><%=i%></td>
                             <td>${u.kefangbianhao}</td>
    <td>${u.kefangleixing}</td>
    <td>${u.jiage}</td>
    <td>${u.lvkebianhao}</td>
    <td>${u.lvkexingming}</td>
    <td>${u.shifouruzhu}</td>
    
                              <td align="center"> ${u.addtime } </td>
                              <td align="center"><a href="deleteYuding.do?id=${u.id }"
										onclick="{if(confirm('确定要退房吗?')){return true;}return false;}">退房</a> <a href="doUpdateYuding.do?id=${u.id }">换房</a>  </td>
                            </tr>
                          </c:forEach>
                        </table></td>
						</tr>
					</table>
					
					
			  </td>
	  </tr>
		</table>
		
		
		
			<p align="center"> <c:if test="${sessionScope.p==1 }">
		 <c:if test="${page.page>1}">
              <a href="yudingList.do?page=1" >首页</a>
             <a href="yudingList.do?page=${page.page-1 }"> 上一页</a>             </c:if>
    	     <c:if test="${page.page<page.totalPage}">
			<a href="yudingList.do?page=${page.page+1 }">下一页</a>
			<a href="yudingList.do?page=${page.totalPage }">末页</a>		    </c:if>		
	</c:if>
	</p>
			
			
			
			
			
	</body>
</html>
