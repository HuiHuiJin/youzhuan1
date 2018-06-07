package cn.yutongjiaoyu.zhangwei.djzx.bl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.yutongjiaoyu.zhangwei.djzx.model.Juese;
import cn.yutongjiaoyu.zhangwei.djzx.model.JueseDAO;

public class SearchRole extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public SearchRole() {
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
			//获取角色名
			String name =request.getParameter("name");
			
			JueseDAO  juesedao = new JueseDAO();
			
			//根据角色名来搜索相关的角色
			List<Juese> resultList = juesedao.findByProperty("jueseming", name);
			
			if(resultList.size()!=0){
				//如果搜索结果不为空，往Session中添加搜索结果，并代值跳转到搜索结果页面
				request.getSession().setAttribute("resultList",resultList);
				request.getRequestDispatcher("./back/operation/SearchResult.jsp").forward(request, response);
			}
			else {
				//如果搜索结果为空，跳转到错误提示页面
				response.sendRedirect("./back/operation/searchErrorAlert.jsp");
			}
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
		this.doGet(request, response);
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
