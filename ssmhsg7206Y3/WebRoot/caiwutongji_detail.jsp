<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="java.sql.*" %>
<jsp:useBean id="connDbBean" scope="page" class="com.util.db"/>
<html>
  <head>
    <title>财务统计详细</title>
<style type="text/css">
<!--
body,td,th {
	font-size: 12px;
}
-->
</style>

  </head>

  <body >

  财务统计详细:
  <br><br>
  
   <table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#CBD8AC" style="border-collapse:collapse">  
   <tr>
     <td width='11%' height=44>财务编号：</td><td width='39%'>${caiwutongji.caiwubianhao}</td><td  rowspan=3 align=center><a href=${caiwutongji.caiwubaobiao} target=_blank><img src=${caiwutongji.caiwubaobiao} width=228 height=215 border=0></a></td></tr><tr><td width='11%' height=44>财务名称：</td><td width='39%'>${caiwutongji.caiwumingcheng}</td></tr><tr><td width='11%' height=44>说明：</td><td width='39%'>${caiwutongji.shuoming}</td></tr><tr><td colspan=3 align=center><input type=button name=Submit5 value=返回 onClick="javascript:history.back()" />&nbsp;<input type=button name=Submit5 value=打印 onClick="javascript:window.print()" /></td></tr>
    
  </table>

  </body>
</html>

