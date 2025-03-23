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
		<TITLE>添加客户信息</TITLE>
	    

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
	document.location.href="lvkexinxi_add.jsp?id=<%=id%>";
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
			<form action="addLvkexinxi.do" name="form1" method="post">
				      <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1"  style="border-collapse:collapse" bgcolor="#F2FDFF">
						<tr bgcolor="#E7E7E7">
							<td height="20" colspan="2" background="images/table_header.gif">添加客户信息</td>
						</tr>
						<tr ><td width="200">客户编号：</td><td><input name='lvkebianhao' type='text' id='lvkebianhao' value='' onblur='hsgcheck()' style='border:solid 1px #000000; color:#666666' />&nbsp;*<label id='clabellvkebianhao' /></td></tr>
		<tr ><td width="200">客户姓名：</td><td><input name='lvkexingming' type='text' id='lvkexingming' value='' onblur='checkform()' style='border:solid 1px #000000; color:#666666' />&nbsp;*<label id='clabellvkexingming' /></td></tr>
		<tr ><td width="200">类型：</td><td><select name='xingbie' id='xingbie'><option value="普通">普通</option><option value="VIP会员">VIP会员</option></select></td></tr>
		<tr ><td width="200">电话：</td><td><input name='dianhua' type='text' id='dianhua' value='' onblur='' style='border:solid 1px #000000; color:#666666' /></td></tr>
		<tr ><td width="200">地址：</td><td><input name='dizhi' type='text' id='dizhi' value='' onblur='' size='50' style='border:solid 1px #000000; color:#666666' /></td></tr>
		
		
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




<script language=javascript >  
function hsgcheck() {
		var lvkebianhao = $("#lvkebianhao").val();
		if(lvkebianhao==""||(lvkebianhao.length<6||lvkebianhao.length>12)){
			 $("#clabellvkebianhao").html("<font color=red>客户编号不能为空且长度在3～12位之间！</font>");
			 $("input[id=lvkebianhao]").focus();
			 $("#querenzhuce").attr("disabled","disabled");
			 return false;
		} 
		else
		{
			$("#clabellvkebianhao").html("");
			$.ajax({
				url : "quchongLvkexinxi.do",
				type : "post",
				data : "lvkebianhao=" + lvkebianhao,
				dataType : "json",
				success:function(result){
				if(result.info=="ng"){
					$("#clabellvkebianhao").html("<font color=red>客户编号已存在，请更换！</font>");
					$("input[id=lvkebianhao]").focus();
					$("#querenzhuce").attr("disabled","disabled");
					return false;
				}
				else
				{
					$("#querenzhuce").removeAttr("disabled");
				}
				},
				error:function(){
					$("#clabellvkebianhao").html("系统异常，请检查错误！");
					$("input[id=lvkebianhao]").focus();
					$("#querenzhuce").attr("disabled","disabled");
					return false;
				}
			});
		}
	}
</script>


<script language=javascript >  
 
 function checkform(){  
 
	var lvkebianhaoobj = document.getElementById("lvkebianhao"); if(lvkebianhaoobj.value==""){document.getElementById("clabellvkebianhao").innerHTML="&nbsp;&nbsp;<font color=red>请输入客户编号</font>";return false;}else{document.getElementById("clabellvkebianhao").innerHTML="  "; } 
	var lvkexingmingobj = document.getElementById("lvkexingming"); if(lvkexingmingobj.value==""){document.getElementById("clabellvkexingming").innerHTML="&nbsp;&nbsp;<font color=red>请输入客户姓名</font>";return false;}else{document.getElementById("clabellvkexingming").innerHTML="  "; } 
	


return true;   
}   
popheight=450;
</script>  
