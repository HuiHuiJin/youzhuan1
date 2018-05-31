<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add-role.jsp' starting page</title>
    
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
    		<table id="table1" width="500">
    			<tr><td colspan="4" align="right"><input type=button value="后退" onclick="turnback()"/></td></tr>
    		</table>
	  		<table id="table" border="1" width="500" cellspacing="0" >
	  			<tr><td>角色名</td><td><input type="text" name="roleName" id="roleName" autocomplete="off"/></td></tr>
	  			<tr><td valign="top">角色介绍</td><td><textarea cols="55" rows="20" style="resize:none" name="roleIntroduction" id="roleIntroduction"></textarea></td></tr>
	  			<tr>
	  				<td>权限范围</td>
	  				<td>
	  				<input type="checkbox" name="act" value="浏览/评论视频">浏览/评论视频<input type="checkbox" name="act" value="发布视频">发布视频<input type="checkbox" name="act" value="修改/删除部门">修改/删除部门<br/>
	  				<input type="checkbox" name="act" value="增加/删除员工">增加/删除员工<input type="checkbox" name="act" value="设置管理员">设置管理员 
	  			    </td>
	  			</tr>
	  			<tr><td>权限等级</td><td><input type="text" id="premissionLevel" name="premissionLevel" autocomplete="off"/></td></tr>
	  		</table>
	  		<input type="button" onclick="send()" value="提交"/>
  		</div>
  		
  		<script language=javascript>
  		var pagewidth=document.body.clientWidth;
  		var tablewidth=document.getElementById("table").width;
  		function startup(){
  			document.getElementById("div").style="margin-left:"+(pagewidth-tablewidth)/2+"px";
  		}
  		window.focus(startup());
  		
  		function turnback(){
  			window.open("./back/operation/admin-role.jsp","_self");
  		
  		}
  		
  		function send(){
  			var roleName=document.getElementById("roleName").value;
  			var roleIntroduction=document.getElementById("roleIntroduction").value;
  			var rolePremission=document.getElementById("premissionLevel").value;
  			var id = document.getElementsByName("act");
  			var values = new Array();
  			for(var i=0;i<id.length;i++){
  				if(id[i].checked){
  					values.push(id[i].value);
  				}
  			}
  			if(roleName==""){
  				alert("请输入角色名");
  			}
  			else{
  				if(roleIntroduction==""){
  					alert("请输入角色介绍");
  				}
  				else{
  					if(rolePremission==""){
  						alert("请输入角色权限");
  					}
  					else{
  						if(values.length==0){
  							alert("请选择权限范围");
  						}
  						else{
  							window.location.href="AddRole?roleName="+roleName+"&values="+values.toString()+"&roleIntroduction="+roleIntroduction+"&premissionLevel="+rolePremission;
  						}
  					}
  				}
  			} 

  			
}
  			
  		
  		</script>
  </body>
</html>
