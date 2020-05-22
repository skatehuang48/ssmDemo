package com.hsk.bean;

import org.springframework.stereotype.Component;

/**
 *实体bean即为业务对象
 * 使用@component将userbean注入spring 的ioc容器
 * @author Administrator
 *
 */
//@Component("userBean")
public class UserBean {

	private String userCode;
	private String userName;
	private String deptCode;
	
	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("用户为：");
		sb.append(userCode);
		sb.append("/");
		sb.append(userName);
		sb.append("/");
		sb.append(deptCode);
		return sb.toString();
	}
}
