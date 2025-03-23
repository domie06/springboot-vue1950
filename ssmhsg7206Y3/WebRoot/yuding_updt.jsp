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
		<TITLE>修改预订</TITLE>
	    
<style type="text/css">
<!--
body,td,th {
	font-size: 12px;
}
-->
</style>
       
	</head>
<%
  String id="";
 
   %>
<script language="javascript">

function gows()
{
	document.location.href="yuding_add.jsp?id=<%=id%>";
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
			<form action="updateYuding.do" name="form1" method="post">
				      <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1"  style="border-collapse:collapse" bgcolor="#F2FDFF">
						<tr bgcolor="#E7E7E7">
							<td height="20" colspan="2" background="images/table_header.gif">修改预订<input type="hidden" name="id" value="${yuding.id}" /></td>
						</tr>
						<tr ><td width="200">客房编号：</td><td><input name='kefangbianhao' type='text' id='kefangbianhao' value='' onblur='' style='border:solid 1px #000000; color:#666666'   /></td></tr>
		<tr ><td width="200">客房类型：</td><td><input name='kefangleixing' type='text' id='kefangleixing' value='' onblur='' style='border:solid 1px #000000; color:#666666'   /></td></tr>
		<tr ><td width="200">价格：</td><td><input name='jiage' type='text' id='jiage' value='' onblur='' style='border:solid 1px #000000; color:#666666'   /></td></tr>
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
						<script language="javascript">document.form1.kefangbianhao.value='${yuding.kefangbianhao}';</script>
	<script language="javascript">document.form1.kefangleixing.value='${yuding.kefangleixing}';</script>
	<script language="javascript">document.form1.jiage.value='${yuding.jiage}';</script>
	<script language="javascript">document.form1.lvkebianhao.value='${yuding.lvkebianhao}';</script>
	<script language="javascript">document.form1.lvkexingming.value='${yuding.lvkexingming}';</script>
	<script language="javascript">document.form1.shifouruzhu.value='${yuding.shifouruzhu}';</script>
	
					 </table>
			</form>
   </body>
</html>






