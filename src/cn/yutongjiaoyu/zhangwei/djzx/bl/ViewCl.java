package cn.yutongjiaoyu.zhangwei.djzx.bl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.yutongjiaoyu.zhangwei.djzx.model.Shipinpingjia;
import cn.yutongjiaoyu.zhangwei.djzx.model.ShipinpingjiaDAO;

public class ViewCl extends HttpServlet {

	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//׼���������ڲ���Ƶ����
		//��ǰҳ
		int currentPage=Integer.parseInt(request.getParameter("currentPage"));
	
		int pageSize=3;
		ShipinpingjiaDAO dao=new ShipinpingjiaDAO();
		//�ܼ�¼��
		int totalRow=dao.findAll().size();
		//����
		List<Shipinpingjia> list=dao.findPage(currentPage, pageSize);
		
		
		//����Ҫ�����ݷ���request��
		request.getSession().setAttribute("totalRow", totalRow+"");
		request.getSession().setAttribute("list", list);
		request.getSession().setAttribute("currentPage", currentPage+"");
		
		response.sendRedirect("http://localhost:8080/youzhuan1/back/operation/show.jsp");
		out.flush();
		out.close();
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.flush();
		out.close();
	}

}
