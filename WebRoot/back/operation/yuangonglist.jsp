<%@page import="cn.yutongjiaoyu.zhangwei.djzx.model.*"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%
YuangongDAO yg=new YuangongDAO();
List<Yuangong> list=yg.findAll();
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>员工列表界面</title>
		<style type="text/css">
			#box{
				border-collapse: collapse;
				margin: 10px auto; 
				padding:20px ;
				background-color: #ffffff;
				width: 70%;
			}
		</style>
	</head>
	
	<body>
		<h1 align="center">员工详细信息</h1>
		<div style="width: 100%; margin-top: 10%; background-color: #999;">
			<table border="2" id="box">
				<tr>
				<td>员工ID</td>
				<td>员工名</td>
				<td>生日	</td>
				<td>性别	</td>
				<td>政治面貌	</td>
				<td>入职时间	</td>
				<td>所在部门	</td>
				<td>备注	</td>
				<td>登录名	</td>
				<td>登录密码	</td>
				
				</tr>
				<%
				
				for(Yuangong y:list){
					%>
					<tr>
					<td><%=y.getYuangongid() %></td>
					<td><%=y.getYuangongming() %></td>
					<td><%=y.getYuangongrenwus() %></td>
					<td><%=y.getYonghuJueses() %></td>
					<td><%=y.getZhengzhimianmao() %></td>
					<td><%=y.getRuzhishijian() %></td>
					<td><%=y.getBumen()  %></td>
					<td><%=y.getBeizhu() %></td>
					<td><%=y.getDengluming() %></td>
					<td><%=y.getDenglumima() %></td>
				</tr>
					<%
				}
				
				%>
			</table>
		
		</div>
	</body>
</html>
