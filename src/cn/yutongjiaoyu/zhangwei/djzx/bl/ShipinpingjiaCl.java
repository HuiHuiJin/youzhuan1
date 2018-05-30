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
		
		//��������
		//��Ƶid
		String videoval=request.getParameter("video");
		//������id
		String empval=request.getParameter("emp");
		//��������
		String contentval=request.getParameter("content");
		System.out.println(contentval);
		//����ʱ��
		Timestamp time = new Timestamp(System.currentTimeMillis()); 
		
		
		//������Ƶ�����Ա������
		Shipin shipin=new Shipin();
		shipin.setShipinid(Integer.parseInt(videoval));
		Yuangong yuangong=new Yuangong();
		yuangong.setYuangongid(Integer.parseInt(empval));
		//������Ƶ���۶���
		Shipinpingjia shipinpingjia=new Shipinpingjia();
		shipinpingjia.setShipin(shipin);
		shipinpingjia.setYuangong(yuangong);
		shipinpingjia.setPingjiaxinxi(contentval);
		shipinpingjia.setPingjiashijian(time);
		
		//���÷����
		ShipinpingjiaClServer.save(shipinpingjia);
		//��ת���鿴����ҳ��
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
