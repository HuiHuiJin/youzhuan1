package cn.yutongjiaoyu.zhangwei.djzx.bl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
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

public class deleteRole extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public deleteRole() {
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
			//获取角色ID
			String idString = request.getParameter("roleid");
			int idInt = Integer.parseInt(idString);
			//创建角色DAO来进行角色的删除
			JueseDAO deleteRole = new JueseDAO();
			Juese roleToDelete = deleteRole.findById(idInt);
			int jsqxid=0;
			//创建角色权限DAO，因为角色权限使用了角色ID作为外键，所以要先把对应的角色权限删除
			JuesequanxianDAO deletejsqx = new JuesequanxianDAO();
			Set<Juesequanxian> jsqx = roleToDelete.getJuesequanxians();
			Iterator iterator = jsqx.iterator();
			while(iterator.hasNext()){
				jsqxid=((Juesequanxian)iterator.next()).getDuiyingid();
			}
			//如果角色权限能够找到，先删除角色权限之后再删除角色
			if(jsqxid!=0){
				deletejsqx.delete(deletejsqx.findById(jsqxid));
				deleteRole.delete(roleToDelete);
			}
			//重定向至主页
			response.sendRedirect("./back/operation/deleteAlert.jsp");
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
