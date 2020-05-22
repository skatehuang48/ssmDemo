package com.hsk.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hsk.bean.DeptBean;

/**
 * 部门的数据库操作接口
 * 只写接口通过mybatis的动态代理自动
 * 根据接口里的方法名称去mapper里获取同名的sql语句执行
 * 注意mapper的命名空间需与扩展类的限定名称一致
 * 面向接口编程
 * 此类用于持久层操作
 * @Repository只是用来规范 写法，写不写无所谓，
 * 不写的话会通过对应的mapper.xml文件生成代理对象
 * @author Administrator
 *
 */
@Repository
public interface DeptDao {

	//查询部门
	public List<DeptBean> findAll();
	//根据主键查找部门
	public DeptBean findDeptByCode(String deptCode);
	//增加部门
	public void insertDept(DeptBean deptBean);
	//根据主键删除部门
	public void deleteDeptByCode(String code);
}
