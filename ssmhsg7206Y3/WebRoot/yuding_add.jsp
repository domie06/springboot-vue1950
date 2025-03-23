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
		<TITLE>添加预订</TITLE>
	    

 	<style type="text/css">
<!--
body,td,th {
	font-size: 12px;
}
-->
</style>      
	</head>
<%
  String id=request.getParameter("id");
   %>

<script language="javascript">

function gows()
{
	document.location.href="yuding_add.jsp?id=<%=id%>&lvkebianhao="+document.form1.lvkebianhao.value;
}
function hsgxia2shxurxu(nstr,nwbk)
{
	if (eval("form1."+nwbk).value.indexOf(nstr)>=0)
	{
		eval("form1."+nwbk).value=eval("form1."+nwbk).value.replace(nstr+"；", "");
	}
	else
	{
		eval("form1."+nwbk).value=eval("form1."+nwbk).value+nstr+"；";
	}
}
</script>
	<body>
			<form action="addYuding.do" name="form1" method="post">
				      <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1"  style="border-collapse:collapse" bgcolor="#F2FDFF">
						<tr bgcolor="#E7E7E7">
							<td height="20" colspan="2" background="images/table_header.gif">添加预订</td>
						</tr>
						<tr ><td width="200">客房编号：</td><td><input name='kefangbianhao' type='text' id='kefangbianhao' value='' onblur='' style='border:solid 1px #000000; color:#666666'  readonly='readonly' /></td></tr><script language="javascript">document.form1.kefangbianhao.value='<%=connDbBean.readzd("kefangxinxi","kefangbianhao","id",request.getParameter("id"))%>';document.form1.kefangbianhao.setAttribute("readOnly",'true');</script>
		<tr ><td width="200">客房类型：</td><td><input name='kefangleixing' type='text' id='kefangleixing' value='' onblur='' style='border:solid 1px #000000; color:#666666'  readonly='readonly' /></td></tr><script language="javascript">document.form1.kefangleixing.value='<%=connDbBean.readzd("kefangxinxi","kefangleixing","id",request.getParameter("id"))%>';document.form1.kefangleixing.setAttribute("readOnly",'true');</script>
		<tr ><td width="200">价格：</td><td><input name='jiage' type='text' id='jiage' value='' onblur='' style='border:solid 1px #000000; color:#666666'  readonly='readonly' /></td></tr><script language="javascript">document.form1.jiage.value='<%=connDbBean.readzd("kefangxinxi","jiage","id",request.getParameter("id"))%>';document.form1.jiage.setAttribute("readOnly",'true');</script>
		<tr ><td width="200">客户编号：</td><td><select name='lvkebianhao' id='lvkebianhao' style='height:20px; border:solid 1px #000000; color:#666666' onChange='gows();'><%=connDbBean.hsggetoption2("lvkexinxi","lvkebianhao")%></select></td></tr>
		<tr ><td width="200">客户姓名：</td><td><input name='lvkexingming' type='text' id='lvkexingming' style='border:solid 1px #000000; color:#666666' ></td></tr>
		<tr ><td width="200">是否入住：</td><td><select name='shifouruzhu' id='shifouruzhu'><option value="否">否</option><option value="是">是</option></select></td></tr>
		
		
						<tr align='center'   height="22">
						    <td width="25%"  align="right">&nbsp;
						        
						    </td>
						    <td width="75%"  align="left">
						       <input type="submit" name="querenzhuce" id="querenzhuce" value="提交" onClick="return checkform();"/>
						       <input type="reset" value="重置"/>&nbsp;
						    </td>
						</tr>
					 </table>
			</form>
   </body>
</html>

<%
if(request.getParameter("lvkebianhao")==null || request.getParameter("lvkebianhao").equals("")){}else{
%>
<script language="javascript">
document.form1.lvkebianhao.value="<%=connDbBean.readzd("lvkexinxi","lvkebianhao","lvkebianhao",request.getParameter("lvkebianhao"))%>";
document.form1.lvkexingming.value="<%=connDbBean.readzd("lvkexinxi","lvkexingming","lvkebianhao",request.getParameter("lvkebianhao"))%>";


</script>
<%
}
%>





