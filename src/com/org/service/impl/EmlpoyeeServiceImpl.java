package com.org.service.impl;

import com.org.dao.EmployeeDao;
import com.org.entity.Employee;
import com.org.service.EmployeeService;

public class EmlpoyeeServiceImpl implements EmployeeService {

	 private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public Employee login(Employee employee) {
		Employee existEmployee =employeeDao.findusernameAndPassword(employee);
		
		return existEmployee;
	}
	 
}
