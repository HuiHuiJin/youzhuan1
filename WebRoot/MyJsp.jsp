<<<<<<< HEAD
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
=======
<%@page import="cn.yutongjiaoyu.zhangwei.djzx.model.*"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

>>>>>>> pr/9
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
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
    
<<<<<<< HEAD
   <form action="ShipinpingjiaCl" method="get">
    <input type="text" name="username" />
    <input type="submit" value="提交"/>
   </form>
=======
<% 
YuangongDAO yg=new YuangongDAO();
List<Yuangong> list=yg.findAll();
%>

	<select name="1" id="1">
	<option value="null">员工</option>
	<%
		for(Yuangong y:list){
		%>
<option value=<%=y.getYuangongid() %>> <%=y.getYuangongming() %></option>
		<%
					}
	 %>
	</select>
    
>>>>>>> pr/9
    
  </body>
</html>
