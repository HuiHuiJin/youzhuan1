<%@page import="cn.yutongjiaoyu.zhangwei.djzx.model.Juesequanxian"%>
<%@page import="cn.yutongjiaoyu.zhangwei.djzx.model.Juese"%>
<%@page import="cn.yutongjiaoyu.zhangwei.djzx.model.JueseDAO"%>
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
  			<%
  				String currentPage = request.getParameter("currentPage");
  				String startnumber = request.getParameter("startnumber");
  				if(currentPage==null){
  					currentPage="1";
  				}
  				if(startnumber==null){
  					startnumber ="0";
  				}
  				int cp = Integer.parseInt(currentPage);
  				int sn = Integer.parseInt(startnumber);
  				int maxnumber = 5;
  			 %>
    	<div id="div">
    		<table id="table1" width="1000">
    			<tr><td colspan="3" align="left"><input type=button value="添加角色" onclick="pop()"/></td><td align="right"><input type="text" id="search"><input type="button" value="搜索" onclick="searchRole()"></td></tr>
    		</table>
	  		<table id="table" border="1" width="1000" cellspacing="0" >
	  			<tr align="center"><td>角色名</td><td>介绍</td><td>权限范围</td><td colspan="2">操作</td></tr>
	  			<% 
	  				JueseDAO juesedao = new JueseDAO();
	  				try{
	  				int count = juesedao.findAll().size();
	  				int pagetotal = (int)Math.ceil(count/(cp+0.0));
	  				
	  				int bianhao=1;
	  				List<Juese>jueses =juesedao.findpage(sn, maxnumber);
	  					  				
	  				if(jueses.size()>0){
	  				 for(Juese a:jueses){
	  				 	String jsqx="";
						Set jsqxs = a.getJuesequanxians();
						Iterator iterator = jsqxs.iterator();
						while(iterator.hasNext()){
							jsqx=((Juesequanxian)iterator.next()).getCaozuobiao();
						} 
  					%> 
	  					<tr><td><%=a.getJueseming()%></td><td><%=a.getJuesejieshao()%></td><td><%=jsqx %></td><td align="center"><input type="button" value="编辑" onclick=""/></td><td align="center"><input type="button" value="删除" onclick="deleteRole(this)" id="<%=a.getJueseid()%>"/></td></tr>
	  					<% 
	  				}
	  			}
	  			%>
	  		</table>
	  		<table id="table2" width="1000">
	  		 <tr><td align="center"><a href="./back/operation/admin-role.jsp?currentpage=<%=((cp-1)<1?1:(cp-1))%>&statrnumber=<%=((sn-maxnumber)<0?0:(sn-maxnumber))%>">上一页</a> 当前第<%=cp %>页 <a href="./back/operation/admin-role.jsp?currentpage=<%=(cp<pagetotal?(cp+1):cp)%>&startnumber=<%=((sn+maxnumber)<count?(sn+maxnumber):sn)%>">下一页</a></td></tr>
    		</table>
  			<%
  				}catch(Exception e){
	  					response.setHeader("refresh", "0.1");
	  				}
	  				
  			 %>
  		</div>
  		
  		<script language=javascript>
  		var pagewidth=document.body.clientWidth;
  		var tablewidth=document.getElementById("table").width;
  		function startup(){
  			document.getElementById("div").style="margin-left:"+(pagewidth-tablewidth)/2+"px";
  		}

  		window.focus(startup());
  		function pop(){
  		window.open("./back/operation/add-role.jsp","_self");
  		}
  	
  		 function deleteRole(object){
  			var result =confirm("确认删除？");
  			var roleid=object.id;
  			if(result==true){
  				window.location="deleteRole?roleid="+roleid;
  			}
  		}
  		
  		 function editRole(){
  		 	
  		 }
  		 
  		 function searchRole(){
  		 	var name=document.getElementById("search").value;
  		 	if(name==null){
  		 		alert("请输入要查询的角色名");
  		 	}
  		 	else{
  		 		window.location.href="SearchRole?name="+name;
  		 	}
  		 	
  		 }
  		</script>
  		
  </body>
</html>
