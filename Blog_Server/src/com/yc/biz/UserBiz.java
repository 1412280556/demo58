package com.yc.biz;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbcp.DbcpException;
import org.omg.CORBA.PUBLIC_MEMBER;

import com.mysql.fabric.xmlrpc.base.Array;
import com.sun.media.jfxmedia.events.NewFrameEvent;
import com.sun.swing.internal.plaf.metal.resources.metal_zh_TW;
import com.yc.bean.User;
import com.yc.dao.DBHelper;

import sun.nio.cs.ext.ISCII91;

public class UserBiz {
	public User login(String username,String userpwd) throws BizException{
		if (username == null || username.trim().isEmpty()) {
			throw new BizException("请填写用户名！");
		}
		
		if (userpwd == null || userpwd.trim().isEmpty()) {
			throw new BizException("请填写密码！");
		}
		
		/*DBHelper dbHelper = new DBHelper();
		List<Object> params = new ArrayList<Object>();
		params.add(username);
		params.add(userpwd);
		String sql = "select * from user where account = ? and pwd =?";
		Map<String, String> user = dbHelper.findMap(sql, params);
		return user;*/
		String sql = "select * from user where account = ? and pwd =?";
		return DBHelper.unique(sql, User.class,username,userpwd);
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return DBHelper.select("select * from user", User.class);
	}

	public void add(User user, String repwd) throws BizException{
		if (user.getName() == null || user.getName().trim().isEmpty()) {
			throw new BizException("请填写用户名!");
		}
		String sql = "insert into user(name,account,tel,pwd) values(?,?,?,?)";
		DBHelper.insert(sql, user.getName(),user.getAccount(),user.getTel(),user.getPwd());
		
	}
	
	public User findById(String id) {
		return DBHelper.unique("select * from user where id = ?", User.class,id);
	}

	public Object find(User user) {
		String sql = "select * from user where 1=1";
		ArrayList<Object> params = new ArrayList<Object>();
		if (user.getAccount() != null && user.getAccount().trim().isEmpty()) {
			sql += "and name like ?";
			params.add("%"+user.getAccount()+"%");
		}
		if (user.getName() != null && user.getName().trim().isEmpty()) {
			sql += "and name like ?";
			params.add("%"+user.getName()+"%");
		}
		if (user.getTel() != null && user.getTel().trim().isEmpty()) {
			sql += "and name like ?";
			params.add("%"+user.getTel()+"%");
		}
		return DBHelper.select(sql, params);
	}

	public void save(User user) throws BizException {
		if (user.getAccount() == null || user.getAccount().trim().isEmpty()) {
			throw new BizException("请填写用户名！");
		}
		if (user.getName() == null || user.getName().trim().isEmpty()) {
			throw new BizException("请填写姓名！");
		}
		DBHelper.update("update user set name = ?,account = ?, tel = ? where id = ?", 
				user.getName(),user.getAccount(),user.getTel(),user.getId());
	}
}
