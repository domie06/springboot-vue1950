<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>
<html>
  <head>
    <title>消费详细</title>
<style type="text/css">
<!--
body,td,th {
	font-size: 12px;
}
-->
</style>

  </head>

  <body >

  消费详细:
  <br><br>
  
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#CBD8AC" style="border-collapse:collapse">  
   <tr>
     <td width='11%'>客房编号：</td><td width='39%'>${xiaofei.kefangbianhao}</td>
     <td width='11%'>客房类型：</td><td width='39%'>${xiaofei.kefangleixing}</td></tr><tr>
     <td width='11%'>客户编号：</td><td width='39%'>${xiaofei.lvkebianhao}</td>
     <td width='11%'>客户姓名：</td><td width='39%'>${xiaofei.lvkexingming}</td></tr><tr>
     <td width='11%'>消费名称：</td><td width='39%'>${xiaofei.xiaofeimingcheng}</td>
     <td width='11%'>费用：</td><td width='39%'>${xiaofei.feiyong}</td></tr><tr>
     <td width='11%'>备注：</td><td width='39%'>${xiaofei.beizhu}</td>
     <td>&nbsp;</td><td>&nbsp;</td></tr><tr><td colspan=4 align=center><input type=button name=Submit5 value=返回 onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=打印 onClick="javascript:window.print()" /></td></tr>
    
  </table>

  </body>
</html>

