package com.hsk.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hsk.bean.DeptBean;
import com.hsk.service.DeptService;

/**
 * 具体的service实现接口，实现部门相关的业务逻辑
 * @author Administrator
 *
 */
@Service("deptService")
public class DeptServiceImpl implements DeptService{

	public List<DeptBean> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public DeptBean findDeptByCode(String deptCode) {
		// TODO Auto-generated method stub
		return null;
	}

	public void insertDept(DeptBean deptBean) {
		// TODO Auto-generated method stub
		
	}

	public void deleteDeptByCode(String code) {
		// TODO Auto-generated method stub
		
	}

}
