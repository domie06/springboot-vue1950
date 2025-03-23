<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>
<html>
  <head>
    <title>员工信息详细</title>
<style type="text/css">
<!--
body,td,th {
	font-size: 12px;
}
-->
</style>

  </head>

  <body >

  员工信息详细:
  <br><br>
  
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#CBD8AC" style="border-collapse:collapse">  
   <tr>
     <td width='11%'>账号：</td><td width='39%'>${yuangongxinxi.zhanghao}</td>     <td width='11%'>密码：</td><td width='39%'>${yuangongxinxi.mima}</td></tr><tr>     <td width='11%'>员工姓名：</td><td width='39%'>${yuangongxinxi.yuangongxingming}</td>     <td width='11%'>性别：</td><td width='39%'>${yuangongxinxi.xingbie}</td></tr><tr>     <td width='11%'>年龄：</td><td width='39%'>${yuangongxinxi.nianling}</td>     <td width='11%'>电话：</td><td width='39%'>${yuangongxinxi.dianhua}</td></tr><tr>     <td width='11%'>地址：</td><td width='39%'>${yuangongxinxi.dizhi}</td>     <td>&nbsp;</td><td>&nbsp;</td></tr><tr><td colspan=4 align=center><input type=button name=Submit5 value=返回 onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=打印 onClick="javascript:window.print()" /></td></tr>
    
  </table>

  </body>
</html>

