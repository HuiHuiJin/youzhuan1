<%@page import="java.util.*" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%@page import="cn.yutongjiaoyu.zhangwei.djzx.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>视频评论区</title>
</head>
<style type="text/css">

	*{margin:0px;padding:0px;list-style: none;text-decoration: none;}
	#box{width:100%;}
	#banner{width:100%;height:100px;background:gray;text-align:center;line-height:100px;font-size: 35px;color:white;}
	#viewBox{width: 100%;}
	#info{width:80%;margin: 0px auto;border: 1px solid gainsboro;margin-bottom: 10px;border-bottom: 5px solid gray;border-collapse: collapse;}
	#info tr{width: 100%;height: 40px;}
	#info tr td{padding-left: 10px;padding-right: 10px;}
	#info tr.videoname{text-align: center;}
	#info tr.time{text-align: right;}
	#info tr.content{height: 150px;}
	
	#pageInfo{width: 85%;height: 30px;background-color: burlywood;margin: 10px auto;padding:5px;line-height: 30px;}
	#menu li{float: left;width: 30px;height: 30px;margin-left: 10px;text-align: center;}
	#pageInfo #pageup{float: left;}
	#pageInfo #menu{width: 60%;margin: 0px auto;background:red;}
	#pageInfo #pagedown{float: right;}
	li:hover{background-color: red;cursor: pointer;}
	#menu li.page{width:100px;height:30px}
	#back{width:100%;height:30px;text-align:center;line-height:30px;}
	
</style>		
<body>
<!--
	视频标题
	评价内容
	评价人
	评价时间
-->		
		<%
		String totalRow =(String) request.getSession().getAttribute("totalRow");
		String currentPages = (String)request.getSession().getAttribute("currentPage");
		List<Shipinpingjia> list=(List<Shipinpingjia>)request.getSession().getAttribute("list");
		//总记录数
		int totalRows=Integer.parseInt(totalRow);
		//当前页
		int currentPage=Integer.parseInt(currentPages);
		//显示几条记录
		int PageSize=3;
		int flag=1;
		//有几页
		int length=totalRows%3==0?(totalRows/3):(totalRows/3)+1;
		%>

<div id="box">
	<div id="banner">欢迎查看我们的视频评论</div>
	<div id="back"><a href="http://localhost:8080/youzhuan1/back/operation/index.jsp">返回后台主页</a></div>
	<div id="viewBox">
	<%
	for(Shipinpingjia s:list){
		%>
		<table id="info" border="1">
			<tr class="user">
				<td>评价人:<%=s.getYuangong().getYuangongming() %> </td>
			</tr>
			<tr class="videoname">
				<td>视频名称: <%=s.getShipin().getShipinbiaoti() %></td>
			</tr>
			<tr class="content">
				<td>
					<%=s.getPingjiaxinxi() %>
				</td>
			</tr>
			<tr class="time">
				<td>评价时间: <%=s.getPingjiashijian() %></td>
			</tr>
		</table>
		<% 
	}
	%>
	</div>
	<div id="pageInfo">
		<div id="pageup"><a href="http://localhost:8080/youzhuan1/ViewCl?currentPage=<%=currentPage==1 ? length : currentPage-1 %>">	&lt;	&lt; 上一页 </a></div>
		<ul id="menu">
			<%
			for(int i=1;i<=length;i++){
				%>
				<li><a href="http://localhost:8080/youzhuan1/ViewCl?currentPage=<%=i%>" title=<%=i%>> <%=i %></a></li>
				<%
			}
			%>
			<li class="page">[<%=currentPage %>/<%=length %>] 页</li>
		</ul>
		<div id="pagedown"><a href="http://localhost:8080/youzhuan1/ViewCl?currentPage=<%=currentPage==length ? 1 : currentPage+1 %>">下一页 	&gt;	&gt;</a></div>
	</div>
</div>



<script type="text/javascript">
</script>
</body>
</html>