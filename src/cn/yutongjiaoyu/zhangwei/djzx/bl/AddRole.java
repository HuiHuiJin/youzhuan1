package cn.yutongjiaoyu.zhangwei.djzx.bl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.yutongjiaoyu.zhangwei.djzx.model.Juese;
import cn.yutongjiaoyu.zhangwei.djzx.model.JueseDAO;
import cn.yutongjiaoyu.zhangwei.djzx.model.Juesequanxian;
import cn.yutongjiaoyu.zhangwei.djzx.model.JuesequanxianDAO;

public class AddRole extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public AddRole() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			//获取添加角色模块传递过来的各项数据
			String name = request.getParameter("roleName");
			String introduction = request.getParameter("roleIntroduction");
			String premisson = request.getParameter("values");
			String premissionLevel = request.getParameter("premissionLevel");
			
			//新建角色对象，将值传入其中
			Juese juese = new Juese();
			juese.setJueseming(name);
			juese.setJuesejieshao(introduction);
			JueseDAO juesedao = new JueseDAO();
			juesedao.save(juese);
			
			//新建角色权限对象，将值传入其中
			Juesequanxian jsqx = new Juesequanxian();
			jsqx.setCaozuobiao(premisson);
			jsqx.setQuanxian(premissionLevel);
			jsqx.setJuese(juese);
			JuesequanxianDAO jsqxdao = new JuesequanxianDAO();
			jsqxdao.save(jsqx);
		
			System.out.println(juesedao.findById(1));
			
			response.sendRedirect("./back/operation/admin-role.jsp");
			
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
