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
  				//窗口打开时进行当前页、查询开始行的初始化
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
	  				//获取数据库中所有角色的数目，计算总页数
	  				int count = juesedao.findAll().size();
	  				int pagetotal = (int)Math.ceil(count/(5+0.0));
	  				
	  				int bianhao=1;
	  				
	  				//在角色DAO中新写了一个方法，输入起始行数和从起始行数往后要读取的数目，来获取指定的角色
	  				List<Juese>jueses =juesedao.findpage(sn, maxnumber);
	  					  				
	  				//遍历取出的角色，然后将各项数据放入表中
	  				if(jueses.size()>0){
	  				 for(Juese a:jueses){
	  				 	String jsqx="";
						Set jsqxs = a.getJuesequanxians();
						//通过迭代器来获取角色的操作权限，因为一个角色对应一个操作表，所以实际上只获取一个值就可以了
						Iterator iterator = jsqxs.iterator();
						while(iterator.hasNext()){
							jsqx=((Juesequanxian)iterator.next()).getCaozuobiao();
						} 
  					%> 
	  					<tr><td><%=a.getJueseming()%></td><td><%=a.getJuesejieshao()%></td><td><%=jsqx %></td><td align="center"><input type="button" value="编辑" onclick="editRole(this)" id="<%=a.getJueseid() %>"/></td><td align="center"><input type="button" value="删除" onclick="deleteRole(this)" id="<%=a.getJueseid()%>"/></td></tr>
	  					<% 
	  				}
	  			}
	  			%>3
	  		</table>
	  		<table id="table2" width="1000">
	  		 <tr><td align="center"><a href="./back/operation/admin-role.jsp?currentpage=<%=((cp-1)<1?1:(cp-1))%>&statrnumber=<%=((sn-maxnumber)<0?0:(sn-maxnumber))%>">上一页</a> 当前第<%=cp %>页 <a href="./back/operation/admin-role.jsp?currentpage=<%=(cp<pagetotal?(cp+1):cp)%>&startnumber=<%=((sn+maxnumber)<count?(sn+maxnumber):sn)%>">下一页</a></td></tr>
    		</table>
  			<%
  				}catch(Exception e){
  						//如果重复进入页面，可能会出现和session相关的异常，初步猜测为缓存导致，此处进行异常处理，如果进入界面后出现异常就刷新当前页面
	  					response.setHeader("refresh", "0.1");
	  				}
	  				
  			 %>
  		</div>
  		
  		<script language=javascript>
  		
  		//实现窗口居中效果
  		var pagewidth=document.body.clientWidth;
  		var tablewidth=document.getElementById("table").width;
  		function startup(){
  			document.getElementById("div").style="margin-left:"+(pagewidth-tablewidth)/2+"px";
  		}

  		window.focus(startup());
  		
  		//进入添加角色的页面
  		function pop(){
  		window.open("./back/operation/add-role.jsp","_self");
  		}
  	
  		//进行删除角色的处理，获取角色ID，发送至servlet进行处理
  		 function deleteRole(object){
  			var result =confirm("确认删除？");
  			var roleid=object.id;
  			if(result==true){
  				window.location="deleteRole?roleid="+roleid;
  			}
  		}
  		
  		//进行编辑角色的处理，获取角色ID，发送至servlet进行处理
  		 function editRole(object){
  		 	var id = object.id;
  		 	window.location.href="editRole?method=query&id="+id;
  		 }
  		 
  		 //查询处理
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
