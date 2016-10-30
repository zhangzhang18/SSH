package com.org.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.org.dao.DepartmentDao;
import com.org.entity.Department;
import com.org.entity.PageBean;
import com.org.service.DepartmentService;
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

	private DepartmentDao departmentDao;
	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}
	@Override
	public PageBean<Department> findByPage(Integer currPage) {
        PageBean<Department> pageBean=new PageBean<Department>();
        pageBean.setCurrPage(currPage);//封装当前页
        int pageSize=3;//每页显示记录数
        pageBean.setPageSize(pageSize);
        int totalCount=departmentDao.findCount();     
        pageBean.setTotalCount(totalCount);
        double tc=totalCount;//总记录数
        Double num=Math.ceil(tc/pageSize);
        pageBean.setTotalPage(num.intValue());
        int begin=(currPage-1)*pageSize;//每页显示记录数据
        List<Department> list = departmentDao.findByPage(begin,pageSize);
        pageBean.setList(list);
		return pageBean;
	}
	@Override
	public void save(Department department) {
		departmentDao.save(department);
	}
	@Override
	public Department findById(Integer did) {
		return 	departmentDao.findById(did);
		
	}
	@Override
	public void update(Department department) {
		departmentDao.update(department);
	}
	
	@Override
	public void delete(Department department) {
    departmentDao.delete(department);		
	}

}
