package com.hsk.service;

import java.util.List;

import com.hsk.bean.UserBean;
/**
  * service层接口，规范每个sevice接口有哪些方法
	他是对外开放的，可以告诉用户我有哪些功能，但是具体功能实现不去关注，
	由该接口的实现类去实现具体的service各个功能的逻辑处理
 * @author Administrator
 *
 */
public interface UserService {

	// 查找用户
	public List<UserBean> findUsers();

	// 增加用户
	public void insertUser(UserBean userBean);

	// 删除用户
	public void deleteUserByCode(String userCode);

	// 单个查找
	public UserBean findUserByCode(String userCode);

	// 更新用户信息
	public UserBean updateUser(UserBean userBean);
}
