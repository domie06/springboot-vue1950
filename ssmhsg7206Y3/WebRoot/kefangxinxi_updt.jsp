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
		<TITLE>修改客房信息</TITLE>
	    
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
	document.location.href="kefangxinxi_add.jsp?id=<%=id%>";
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
			<form action="updateKefangxinxi.do" name="form1" method="post">
				      <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1"  style="border-collapse:collapse" bgcolor="#F2FDFF">
						<tr bgcolor="#E7E7E7">
							<td height="20" colspan="2" background="images/table_header.gif">修改客房信息<input type="hidden" name="id" value="${kefangxinxi.id}" /></td>
						</tr>
						<tr ><td width="200">客房编号：</td><td><input name='kefangbianhao' type='text' id='kefangbianhao' value='' onblur='hsgcheck()' style='border:solid 1px #000000; color:#666666' />&nbsp;*<label id='clabelkefangbianhao' /></td></tr>		<tr ><td width="200">客房类型：</td><td><select name='kefangleixing' id='kefangleixing'><option value="单人房">单人房</option><option value="双人房">双人房</option><option value="豪华房">豪华房</option></select>&nbsp;*<label id='clabelkefangleixing' /></td></tr>		<tr ><td width="200">价格：</td><td><input name='jiage' type='text' id='jiage' value='' onblur='checkform()' style='border:solid 1px #000000; color:#666666' />&nbsp;<label id='clabeljiage' />必需数字型</td></tr>		<tr ><td width="200">状态：</td><td><select name='zhuangtai' id='zhuangtai'><option value="未预约">未预约</option><option value="已预约">已预约</option></select></td></tr>		
		
						<tr align='center'   height="22">
						    <td width="25%"  align="right">&nbsp;
						        
						    </td>
						    <td width="75%"  align="left">
						       <input type="submit" name="querenzhuce" id="querenzhuce" value="提交" onClick="return checkform();"/>
						       <input type="reset" value="重置"/>&nbsp;
						    </td>
						</tr>
						<script language="javascript">document.form1.kefangbianhao.value='${kefangxinxi.kefangbianhao}';</script>	<script language="javascript">document.form1.kefangleixing.value='${kefangxinxi.kefangleixing}';</script>	<script language="javascript">document.form1.jiage.value='${kefangxinxi.jiage}';</script>	<script language="javascript">document.form1.zhuangtai.value='${kefangxinxi.zhuangtai}';</script>	
					 </table>
			</form>
   </body>
</html>






<script language=javascript >  
 
 function checkform(){  
 
	var kefangbianhaoobj = document.getElementById("kefangbianhao"); if(kefangbianhaoobj.value==""){document.getElementById("clabelkefangbianhao").innerHTML="&nbsp;&nbsp;<font color=red>请输入客房编号</font>";return false;}else{document.getElementById("clabelkefangbianhao").innerHTML="  "; } 	var kefangleixingobj = document.getElementById("kefangleixing"); if(kefangleixingobj.value==""){document.getElementById("clabelkefangleixing").innerHTML="&nbsp;&nbsp;<font color=red>请输入客房类型</font>";return false;}else{document.getElementById("clabelkefangleixing").innerHTML="  "; } 	    


return true;   
}   
popheight=450;
</script>  
