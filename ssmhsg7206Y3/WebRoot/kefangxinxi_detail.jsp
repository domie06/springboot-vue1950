<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>
<html>
  <head>
    <title>客房信息详细</title>
<style type="text/css">
<!--
body,td,th {
	font-size: 12px;
}
-->
</style>

  </head>

  <body >

  客房信息详细:
  <br><br>
  
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#CBD8AC" style="border-collapse:collapse">  
   <tr>
     <td width='11%'>客房编号：</td><td width='39%'>${kefangxinxi.kefangbianhao}</td>     <td width='11%'>客房类型：</td><td width='39%'>${kefangxinxi.kefangleixing}</td></tr><tr>     <td width='11%'>价格：</td><td width='39%'>${kefangxinxi.jiage}</td>     <td width='11%'>状态：</td><td width='39%'>${kefangxinxi.zhuangtai}</td>     </tr><tr><td colspan=4 align=center><input type=button name=Submit5 value=返回 onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=打印 onClick="javascript:window.print()" /></td></tr>
    
  </table>

  </body>
</html>

