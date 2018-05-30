<%@page import="java.util.List" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%@page import="cn.yutongjiaoyu.zhangwei.djzx.model.Shipin"%>
<%@page import="cn.yutongjiaoyu.zhangwei.djzx.model.Yuangong"%>
<%@page import="cn.yutongjiaoyu.zhangwei.djzx.model.ShipinDAO"%>
<%@page import="cn.yutongjiaoyu.zhangwei.djzx.model.YuangongDAO"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>index</title>
		<style type="text/css">
			*{margin: 0px;padding: 0px;text-decoration: none;position: relative;}
			#box{position: relative;}
			#banner{
				width: 100%;
				height: 100px;
				line-height: 100px;
				background-color: gray;
				font-size: 35px;
				color: white;
				text-align: center;
				}
			#boxView{width: 100%;}
			#tabView{
				width: 90%;
				height: 500px;
				margin: 0px auto;
				border-collapse: collapse;
			}
			textarea{
				width: 99.9%;
				height: 350px;
				font-size: 15px;
			}
			#video,#emp{
				width: 100%;
				height: 50px;
				font-size: 20px;
			}
			#time{
				width: 99.7%;
				height: 50px;
				font-size: 20px;
			}
			
			#submit{
				width: 100%;
				height: 50px;
				background-color: green;
				font-size: 20px;
				line-height: 50px;
			}
			.columnOne{text-align: center;}
		</style>
	</head>
	<body>
	
		<!-- 准备数据 -->
		<%
			ShipinDAO shipin_dao=new ShipinDAO();
			YuangongDAO yuangong_dao=new YuangongDAO();
			List<Shipin> shipin_list=shipin_dao.findAll(); 
			List<Yuangong> yuangong_list=yuangong_dao.findAll();
		%>
	
		<div id="box">
			<div id="banner">欢迎对我们的视频进行评论</div>
			<div id="boxView">
				<form action="http://localhost:8080/youzhuan1/ShipinpingjiaCl" method="get">
					<table id="tabView" border="1">
						<tr>
							<td class="columnOne">选择视频</td>
							<td>
								<select name="video" id="video">
									<option value="null">--请选择视频--</option>
									<%
									for(Shipin s:shipin_list){
										%>
										<option value=<%=s.getShipinid() %>><%=s.getShipinbiaoti() %></option>
										<% 
									}
									%>
								</select>
							</td>
						</tr>
						<tr>
							<td class="columnOne">选择员工</td>
							<td>
								<select name="emp" id="emp">
									<option value="null">--请选择员工--</option>
									<%
									for(Yuangong y:yuangong_list){
										%>
										<option value=<%=y.getYuangongid() %>><%=y.getYuangongming() %></option>
										<%
									}
									%>
								</select>
							</td>
						</tr>
						<tr>
							<td class="columnOne">评论内容</td>
							<td>
								<textarea name="content" id="content"></textarea>
							</td>
						</tr>
						<tr>
							<td class="columnOne">评论时间</td>
							<td>
								<input id="time" type="date" name="time" value="" />
							</td>
						</tr>
						<tr>
							<td colspan="2"><input id="submit" type="submit" onclick="return check()" value="提交评论"/></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
		
		
		<script type="text/javascript">
			function check(){
				var videoval=document.getElementById("video").value;
				var empval=document.getElementById("emp").value;
				var contentval=document.getElementById("content").value;
				var timeval=document.getElementById("time").value;
				//选择向项不能为空
				if(videoval=="null"||empval=="null"||content==""||timeval==""){
					alert("其中任意一项都不能为空......");
					return false;
				}
				//评价内容不能少于20字
				if(contentval.length<20&&contentval.length>200){
					alert("评价内容不能少于20字并且不能大于200字......");
					return false;
				}
				return true;
			}
		</script>
	</body>
</html>

