package com.hsk.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hsk.bean.UserBean;
import com.hsk.service.UserService;

/**
 * 具体的service实现类，实现用户管理的具体业务逻辑功能
 * @author Administrator
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService{

	public List<UserBean> findUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public void insertUser(UserBean userBean) {
		// TODO Auto-generated method stub
		
	}

	public void deleteUserByCode(String userCode) {
		// TODO Auto-generated method stub
		
	}

	public UserBean findUserByCode(String userCode) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserBean updateUser(UserBean userBean) {
		// TODO Auto-generated method stub
		return null;
	}

}
