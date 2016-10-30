package com.org.service;

import com.org.entity.Department;
import com.org.entity.PageBean;

public interface DepartmentService {


	PageBean<Department> findByPage(Integer currPage);

	void save(Department department);

	Department findById(Integer did);

	void update(Department department);

	void delete(Department department);

}
