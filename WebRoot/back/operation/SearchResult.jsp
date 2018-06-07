<%@page import="cn.yutongjiaoyu.zhangwei.djzx.model.Juesequanxian"%>
<%@page import="cn.yutongjiaoyu.zhangwei.djzx.model.Juese"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'SearchResult.jsp' starting page</title>
    
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
    		<tr><td colspan="4" align="right"><input type=button value="后退" onclick="turnback()"/></td></tr>
    		</table>
	  		<table id="table" border="1" width="1000" cellspacing="0" >
	  		<tr align="center"><td>角色名</td><td>介绍</td><td>权限范围</td><td colspan="2">操作</td></tr>
			<%
				List<Juese> resultList=(List<Juese>)request.getSession().getAttribute("resultList");
				if(resultList==null){
				System.out.println("OK");
				}
				 for(Juese a:resultList){
						String jsqx="";
						Set jsqxs = a.getJuesequanxians();
						Iterator iterator = jsqxs.iterator();
						while(iterator.hasNext()){
							jsqx=((Juesequanxian)iterator.next()).getCaozuobiao();
						}  
				%>
				<tr>
					<td><%=a.getJueseming() %></td><td><%=a.getJuesejieshao() %></td><td><%=jsqx%></td><td align="center"><input type="button" value="编辑" onclick=""/></td><td align="center"><input type="button" value="删除" onclick="deleteRole(this)" id="<%=a.getJueseid()%>"/></td> 
				</tr>
				<% 
				}
			 %>
	  		</table>
  		</div>
  		
  		<script language=javascript>
  		//表格置中
  		var pagewidth=document.body.clientWidth;
  		var tablewidth=document.getElementById("table").width;
  		function startup(){
  			document.getElementById("div").style="margin-left:"+(pagewidth-tablewidth)/2+"px";
  		}
  		
  		//删除角色函数，获取需要删除对象的ID并传往Servlet进行处理
  		function deleteRole(object){
  			var result =confirm("确认删除？");
  			var roleid=object.id;
  			if(result==true){
  				window.location="deleteRole?roleid="+roleid;
  			}
  		}
  		window.focus(startup());
  		
  		//后退函数，返回上一页
  		function turnback(){
  			window.open("./back/operation/admin-role.jsp","_self");
  		}
  		</script>
  </body>
</html>
