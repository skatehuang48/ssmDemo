package com.hsk.service;

import java.util.List;

import com.hsk.bean.DeptBean;

/**
 * service层接口，规范每个sevice接口有哪些方法
他是对外开放的，可以告诉用户我有哪些功能，但是具体功能实现不去关注，
由该接口的实现类去实现具体的service各个功能的逻辑处理
业务层：注入后由前端控制器中的cotroller来调用对应接口实现类完成相关业务逻辑操作
 * @author Administrator
 *
 */
public interface DeptService {

	// 查询部门
	public List<DeptBean> findAll();

	// 根据主键查找部门
	public DeptBean findDeptByCode(String deptCode);

	// 增加部门
	public void insertDept(DeptBean deptBean);

	// 根据主键删除部门
	public void deleteDeptByCode(String code);
	
}
