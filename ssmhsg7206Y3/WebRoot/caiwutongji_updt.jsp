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
		<TITLE>修改财务统计</TITLE>
	    
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
	document.location.href="caiwutongji_add.jsp?id=<%=id%>";
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
			<form action="updateCaiwutongji.do" name="form1" method="post">
				      <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1"  style="border-collapse:collapse" bgcolor="#F2FDFF">
						<tr bgcolor="#E7E7E7">
							<td height="20" colspan="2" background="images/table_header.gif">修改财务统计<input type="hidden" name="id" value="${caiwutongji.id}" /></td>
						</tr>
						<tr ><td width="200">财务编号：</td><td><input name='caiwubianhao' type='text' id='caiwubianhao' value='' onblur='hsgcheck()' style='border:solid 1px #000000; color:#666666' />&nbsp;*<label id='clabelcaiwubianhao' /></td></tr>		<tr ><td width="200">财务名称：</td><td><input name='caiwumingcheng' type='text' id='caiwumingcheng' value='' onblur='checkform()' style='border:solid 1px #000000; color:#666666' />&nbsp;*<label id='clabelcaiwumingcheng' /></td></tr>		<tr ><td width="200">财务报表：</td><td><input name='caiwubaobiao' type='text' id='caiwubaobiao' size='50' value='' onblur='' style='border:solid 1px #000000; color:#666666' />&nbsp;<input type='button' value='上传' onClick="up('caiwubaobiao')" style='border:solid 1px #000000; color:#666666'/></td></tr>		<tr ><td width="200">说明：</td><td><input name='shuoming' type='text' id='shuoming' value='' onblur='' size='50' style='border:solid 1px #000000; color:#666666' /></td></tr>		
		
						<tr align='center'   height="22">
						    <td width="25%"  align="right">&nbsp;
						        
						    </td>
						    <td width="75%"  align="left">
						       <input type="submit" name="querenzhuce" id="querenzhuce" value="提交" onClick="return checkform();"/>
						       <input type="reset" value="重置"/>&nbsp;
						    </td>
						</tr>
						<script language="javascript">document.form1.caiwubianhao.value='${caiwutongji.caiwubianhao}';</script>	<script language="javascript">document.form1.caiwumingcheng.value='${caiwutongji.caiwumingcheng}';</script>	<script language="javascript">document.form1.caiwubaobiao.value='${caiwutongji.caiwubaobiao}';</script>	<script language="javascript">document.form1.shuoming.value='${caiwutongji.shuoming}';</script>	
					 </table>
			</form>
   </body>
</html>






<script language=javascript >  
 
 function checkform(){  
 
	var caiwubianhaoobj = document.getElementById("caiwubianhao"); if(caiwubianhaoobj.value==""){document.getElementById("clabelcaiwubianhao").innerHTML="&nbsp;&nbsp;<font color=red>请输入财务编号</font>";return false;}else{document.getElementById("clabelcaiwubianhao").innerHTML="  "; } 	var caiwumingchengobj = document.getElementById("caiwumingcheng"); if(caiwumingchengobj.value==""){document.getElementById("clabelcaiwumingcheng").innerHTML="&nbsp;&nbsp;<font color=red>请输入财务名称</font>";return false;}else{document.getElementById("clabelcaiwumingcheng").innerHTML="  "; } 	


return true;   
}   
popheight=450;
</script>  
