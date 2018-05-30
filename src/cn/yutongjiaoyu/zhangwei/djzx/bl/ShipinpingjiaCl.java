package cn.yutongjiaoyu.zhangwei.djzx.bl;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.yutongjiaoyu.zhangwei.djzx.model.*;

public class ShipinpingjiaCl extends HttpServlet {
	
	private static final long serialVersionUID = 1L;


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//接收数据
		//视频id
		String videoval=request.getParameter("video");
		//评价人id
		String empval=request.getParameter("emp");
		//评价内容
		String contentval=request.getParameter("content");
		System.out.println(contentval);
		//评价时间
		Timestamp time = new Timestamp(System.currentTimeMillis()); 
		
		
		//创建视频对象和员工对象
		Shipin shipin=new Shipin();
		shipin.setShipinid(Integer.parseInt(videoval));
		Yuangong yuangong=new Yuangong();
		yuangong.setYuangongid(Integer.parseInt(empval));
		//创建视频评价对象
		Shipinpingjia shipinpingjia=new Shipinpingjia();
		shipinpingjia.setShipin(shipin);
		shipinpingjia.setYuangong(yuangong);
		shipinpingjia.setPingjiaxinxi(contentval);
		shipinpingjia.setPingjiashijian(time);
		
		//调用服务层
		ShipinpingjiaClServer.save(shipinpingjia);
		//跳转到查看评论页面
		response.sendRedirect("http://localhost:8080/youzhuan1/back/operation/show.jsp");
		
		out.flush();
		out.close();
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.flush();
		out.close();
	}

}
