package com.hsk.dao;

import java.util.List;

import com.hsk.bean.UserBean;
/**
 * dao层负责数据库的操作，
 * 根据mybatis动态代理
 * 只要mapper.xml文件中sql语句对应的id和方法名称一致就可以自动载入sql执行
 * @Repository只是用来规范 写法，写不写无所谓，
 * 不写的话会通过对应的mapper.xml文件生成代理对象
 * @author Administrator
 *
 */
public interface UserDao {

	//查找用户
	public List<UserBean> findUsers();
	//增加用户
	public void insertUser(UserBean userBean);
	//删除用户
	public void deleteUserByCode(String userCode);
	//单个查找
	public UserBean findUserByCode(String userCode);
	//更新用户信息
	public UserBean updateUser(UserBean userBean);
	
}
