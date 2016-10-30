package com.org.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.org.entity.Employee;
import com.org.service.EmployeeService;

public class EmployeeAction extends ActionSupport implements ModelDriven<Employee>{
     
	private Employee employee=new Employee();
	
	private EmployeeService employeeService;
	@Override
	public Employee getModel() {
		// TODO Auto-generated method stub
		return employee;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	private static final long serialVersionUID = 1L;

	public String login() {

		System.out.println("zhixing");
		Employee existemployee=employeeService.login(employee);
		if (existemployee==null) {
			this.addActionError("登录失败");
			return INPUT;	
		}else {
			ActionContext.getContext().getSession().put("existemployee", existemployee);
			return SUCCESS;
		}
	}

	
}
