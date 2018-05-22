<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'admin-role.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    	<div id="div">
    		<table id="table1" width="1000">
    			<tr><td colspan="3" align="left">添加角色</td><td align="right">搜索</td></tr>
    		</table>
	  		<table id="table" border="1" width="1000" cellspacing="0" >
	  			<tr align="center"><td>姓名</td><td>信息</td><td>权限</td><td>操作</td></tr>
	  		</table>
  		</div>
  		
  		<script language=javascript>
  		var pagewidth=document.body.clientWidth;
  		var tablewidth=document.getElementById("table").width;
  		function startup(){
  			document.getElementById("div").style="margin-left:"+(pagewidth-tablewidth)/2+"px";
  		}
  		window.focus(startup());
  		</script>
  </body>
</html>
