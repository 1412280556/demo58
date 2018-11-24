package com.yc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yc.bean.User;
import com.yc.biz.UserBiz;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.s")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//接收参数
		String username = request.getParameter("username");
		String userpwd = request.getParameter("userpwd");
		
		UserBiz ubiz = new UserBiz();
		//Map<String,String>user = null;
		User user = null;
		
		try {
		    user = ubiz.login(username, userpwd);
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			//失败
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}
		
		if (user==null) {
			request.setAttribute("msg", "用户名或密码错误");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else {
			//将用户信息保存到会话中
			request.getSession().setAttribute("loginedUser", user);
			//成功
			response.sendRedirect("index.jsp");
		}
		
		
	/*	
	    DBHelper dbhelper = new DBHelper();
		List<Object> params = new ArrayList<Object>();
		params.add(username);
		params.add(userpwd);
		List<Map<String,String>>  ret = dbhelper.find("select * from user where account = ? and pwd =?", params);
		PrintWriter out= response.getWriter();  //获取PrintWriter对象，便于向web写数据
		

		if(ret == null || ret.isEmpty()) {
			
			response.sendRedirect("login.jsp?error=yes");
			request.setAttribute("msg", "用户名或密码错误");
			//失败
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else {
			//将用户信息保存到会话中
			request.getSession().setAttribute("logineUser", ret.get(0));
			response.sendRedirect("index.jsp");
		}
		
		*/
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
