package com.org.dao.impl;

import java.util.List;

import javax.enterprise.inject.New;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.org.dao.EmployeeDao;
import com.org.entity.Employee;

public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao {

	@Override
	public Employee findusernameAndPassword(Employee employee) {
	
		String hql ="from Employee where username= ? and password= ? ";
		String usernameString=employee.getUsername();
		String passwordString=employee.getPassword();
		List<Employee> list=this.getHibernateTemplate().find(hql,new String[]{usernameString,passwordString});
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}

}
