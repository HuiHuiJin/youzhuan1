package cn.yutongjiaoyu.zhangwei.djzx.bl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import cn.yutongjiaoyu.zhangwei.djzx.model.Juese;
import cn.yutongjiaoyu.zhangwei.djzx.model.JueseDAO;
import cn.yutongjiaoyu.zhangwei.djzx.model.Juesequanxian;
import cn.yutongjiaoyu.zhangwei.djzx.model.JuesequanxianDAO;

public class editRole extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public editRole() {
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
		//编辑角色分为两个步骤，第一个是点击之后跳转到新页面然后从数据库中将对应信息提取出来进行展示
		//第二个事对角色进行修改之后对提交到数据库并更新，此处分为两个方法，根据request传来的方法进行相应的判断
		
		String method = request.getParameter("method");
		if(method.equals("query")){
			query(request, response);
		}
		else if(method.equals("merge")){
			change(request, response);
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
		this.doPost(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}
	
	private void query(HttpServletRequest request, HttpServletResponse response){
		//获取角色ID
		String id =request.getParameter("id");
		int idInt = Integer.parseInt(id);
		
		//新建角色对象，用于存放从数据库中提取的数据
		Juese juese = new Juese();
		JueseDAO dao = new JueseDAO();
		juese = dao.findById(idInt);
		
		//获取角色名和角色介绍
		String jueseming = juese.getJueseming();
		String juesejieshao = juese.getJuesejieshao();
		
		//获取角色权限ID
		JuesequanxianDAO jsqxdao = new JuesequanxianDAO();
		Set<Juesequanxian> jsqx = juese.getJuesequanxians();
		int jsqxid=0;
		Iterator iterator = jsqx.iterator();
		if(iterator.hasNext()){
			jsqxid=((Juesequanxian)iterator.next()).getDuiyingid();
		}
		//获取角色权限操作表和角色权限等级
		String jsqxs = jsqxdao.findById(jsqxid).getCaozuobiao();
		String qxdj = jsqxdao.findById(jsqxid).getQuanxian();
		
		//将数据存入Session中，用于传递到展示页面
		request.getSession().setAttribute("jueseming", jueseming);
		request.getSession().setAttribute("juesejieshao", juesejieshao);
		request.getSession().setAttribute("jsqxs", jsqxs);
		request.getSession().setAttribute("qxdj",  qxdj);
		request.getSession().setAttribute("id", id);
		
		try {
			//页面传值跳转
			request.getRequestDispatcher("./back/operation/roleEdit.jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void change(HttpServletRequest request, HttpServletResponse response){

		//获取添加角色模块传递过来的各项数据
		String name = request.getParameter("roleName");
		String introduction = request.getParameter("roleIntroduction");
		String premisson = request.getParameter("values");
		String premissionLevel = request.getParameter("premissionLevel");
		String id = request.getParameter("id");
	
		//新建角色对象，将值更新
		JueseDAO juesedao = new JueseDAO();
		Juese juese = juesedao.findById(Integer.parseInt(id));
		juese.setJueseming(name);
		juese.setJuesejieshao(introduction);
		juesedao.merge(juese);
		//新建角色权限对象，将值更新
		Set<Juesequanxian> jsqxs =juese.getJuesequanxians();
		int jsqxid=0;
		Iterator iterator = jsqxs.iterator();
		while(iterator.hasNext()){
			jsqxid=((Juesequanxian)iterator.next()).getDuiyingid();
		}
		
		JuesequanxianDAO jsqxdao = new JuesequanxianDAO();
		Juesequanxian jsqx = jsqxdao.findById(jsqxid);
		
		jsqx.setCaozuobiao(premisson);
		jsqx.setQuanxian(premissionLevel);
		jsqx.setJuese(juese);
		jsqxdao.merge(jsqx);
		try {
			//页面重定向
			response.sendRedirect("./back/operation/admin-role.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
