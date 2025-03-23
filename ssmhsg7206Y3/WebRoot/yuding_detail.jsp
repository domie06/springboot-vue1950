<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>
<html>
  <head>
    <title>预订详细</title>
<style type="text/css">
<!--
body,td,th {
	font-size: 12px;
}
-->
</style>

  </head>

  <body >

  预订详细:
  <br><br>
  
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#CBD8AC" style="border-collapse:collapse">  
   <tr>
     <td width='11%'>客房编号：</td><td width='39%'>${yuding.kefangbianhao}</td>
     <td width='11%'>客房类型：</td><td width='39%'>${yuding.kefangleixing}</td></tr><tr>
     <td width='11%'>价格：</td><td width='39%'>${yuding.jiage}</td>
     <td width='11%'>客户编号：</td><td width='39%'>${yuding.lvkebianhao}</td></tr><tr>
     <td width='11%'>客户姓名：</td><td width='39%'>${yuding.lvkexingming}</td>
     <td width='11%'>是否入住：</td><td width='39%'>${yuding.shifouruzhu}</td>
     </tr><tr><td colspan=4 align=center><input type=button name=Submit5 value=返回 onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=打印 onClick="javascript:window.print()" /></td></tr>
    
  </table>

  </body>
</html>

