package com.yc.controller;

import java.io.IOException;

import javax.jws.soap.SOAPBinding.Use;
import javax.management.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.ant.FindLeaksTask;
import org.apache.catalina.filters.AddDefaultCharsetFilter;

import com.alibaba.fastjson.JSON;
import com.sun.jmx.snmp.SnmpStringFixed;
import com.yc.bean.User;
import com.yc.biz.BizException;
import com.yc.biz.UserBiz;
import com.yc.dao.BeanUtils;

import jdk.nashorn.api.scripting.JSObject;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/user.s")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserBiz ubiz = new UserBiz();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op = request.getParameter("op");
		if("login".equals(op)) {
			login(request,response);
		}else if ("query".equals(op)) {
			query(request,response);
		}else if ("add".equals(op)) {
			add(request,response);
		}else if ("find".equals(op)) {
			find(request,response);
		}else if ("save".equals(op)) {
			save(request,response);
		}
	}
	
	
	private void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setCharacterEncoding("utf-8");
		User user = BeanUtils.asBean(request, User.class);
		String msg;
		try {
			ubiz.save(user);
			msg = "用户信息保存成功";
  		} catch (BizException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			msg = e.getMessage();
		}
		response.getWriter().append(msg);
	}


	private void find(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		User user = ubiz.findById(id);
		//将user返回给页面
		String userString = JSON.toJSONString(user);
		response.getWriter().append(userString);
	}


	private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		User user = BeanUtils.asBean(request, User.class);
		try {
			String repwd = request.getParameter("repwd");
			ubiz.add(user,repwd);
		} catch (BizException e) {
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
		}finally {
			query(request, response);
		}
		
	}


	private void query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = BeanUtils.asBean(request, User.class);
		request.setAttribute("userList", ubiz.find(user));
		request.getRequestDispatcher("manage-user.jsp").forward(request, response);
		
	}


	private void login(HttpServletRequest request,HttpServletResponse response)  throws ServletException, IOException{
		String username = request.getParameter("username");
		String userpwd = request.getParameter("userpwd");
		
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
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
