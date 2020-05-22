package com.hsk.bean;

import org.springframework.stereotype.Component;
/**
 * 使用@component将deptBean注入spring 的ioc容器
 * @author Administrator
 *
 */
//@Component("deptBean")
public class DeptBean {

	private String deptCode;
	private String deptName;
	private String deptPcode;
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptPcode() {
		return deptPcode;
	}
	public void setDeptPcode(String deptPcode) {
		this.deptPcode = deptPcode;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer("部门信息为：");
		buffer.append(deptCode);
		buffer.append("/");
		buffer.append(deptName);
		buffer.append("/");
		buffer.append(deptPcode);
		return buffer.toString();
	}
}
