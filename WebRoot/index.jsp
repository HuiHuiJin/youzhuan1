<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>铜仁幼儿师范高等专科学校--电教中心主页</title>
<link href="jquery-mobile/jquery.mobile.theme-1.0.min.css" rel="stylesheet" type="text/css" />
<link href="jquery-mobile/jquery.mobile.structure-1.0.min.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/SpryMenuBarHorizontal.css" rel="stylesheet" type="text/css" />
<script src="jquery-mobile/jquery-1.6.4.min.js" type="text/javascript"></script>
<script src="jquery-mobile/jquery.mobile-1.0.min.js" type="text/javascript"></script>
<script src="SpryAssets/SpryMenuBar.js" type="text/javascript"></script>
</head>

<body>
<div data-role="page" id="page">
  <div data-role="header">
    <h1>铜仁幼儿师范高等专科学校 ---电教中心</h1>
  </div>
    <div data-role="content">
    	<div style="width:100%; max-width:1024px; margin:0px auto">
     		<img src="imgs/banner.jpg" style="width:100%;" />   	
        </div>
    
    </div>
    <div data-role="content">
    	<div id="caidanlan" style="width:100%;   margin:0px auto; z-index:3; position:absolute ">
        <div style="margin:0px auto; width:1024px; ">
              <ul id="MenuBar1" class="MenuBarHorizontal" style=" width:100%;">
                    <li><a href="#">成员信息</a></li>
                    <li><a href="#">故障申报</a></li>
                    <li><a class="MenuBarItemSubmenu" href="#">学校视频</a>
                      <ul>
                    
                        <li><a href="#">学习视频</a></li>
                        <li><a href="#">学校活动</a></li>
                         <li><a class="MenuBarItemSubmenu" href="#">视频类</a>
                          <ul>
                            <li><a href="#">视频小类</a></li>
                            <li><a href="#">视频小类</a></li>
                        </ul>
                      </li>
                    </ul>
                  </li>
                       <li><a class="MenuBarItemSubmenu" href="#">电教中心</a>
                      <ul>
                        <li><a href="#">中心新闻</a></li>
                        <li><a href="#">编写通讯</a></li>
                        <li><a href="#">值班日志</a></li>
                    </ul>
                  </li>
                    
              </ul>
            </div>
    	</div>
    </div>
    <div data-role="content">
    	<div style="width:100%; max-width:1024px; margin:0px auto; height:300px;">
     		   	
        </div>
    
    </div>
  <div style="width:100%; max-width:1024px; margin:0px auto;  " >  
      <div data-role="content">
        <div data-role="collapsible-set">
          <div data-role="collapsible">
            <h3>标题</h3>
            <p>内容</p>
          </div>
          <div data-role="collapsible" data-collapsed="true">
            <h3>标题</h3>
            <p>内容</p>
          </div>
          <div data-role="collapsible" data-collapsed="true">
            <h3>标题</h3>
            <p>内容</p>
          </div>
        </div>
        
      </div>

      <div data-role="content">
        <div class="ui-grid-a">
          <div class="ui-block-a">区块 1,1</div>
          <div class="ui-block-b">区块 1,2</div>
          <div class="ui-block-a">区块 2,1</div>
          <div class="ui-block-b">区块 2,2</div>
          <div class="ui-block-a">区块 3,1</div>
          <div class="ui-block-b">区块 3,2</div>
        </div>
      </div>
  
  </div>
  <div data-role="footer">
    <h4>脚注</h4>
  </div>
</div>
<script type="text/javascript">
var MenuBar1 = new Spry.Widget.MenuBar("MenuBar1", {imgDown:"SpryAssets/SpryMenuBarDownHover.gif", imgRight:"SpryAssets/SpryMenuBarRightHover.gif"});

window.onload=function(){
	
	w=document.getElementById("candanlan").width;
	alert(w);
	}
</script>
</body>
</html>
