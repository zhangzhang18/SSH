package com.org.action;

import org.apache.poi.hssf.record.formula.functions.T;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.org.entity.Department;
import com.org.entity.PageBean;
import com.org.service.DepartmentService;

public class DepartmentAction extends ActionSupport implements
		ModelDriven<Department> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Department department = new Department();

	Integer currPage = 1;

	public Integer getCurrPage() {
		return currPage;
	}

	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	private DepartmentService departmentservice;

	@Override
	public Department getModel() {
		// TODO Auto-generated method stub
		return department;
	}

	public void setDepartmentservice(DepartmentService departmentservice) {
		this.departmentservice = departmentservice;
	}

	public String findAll() {
		PageBean<Department> pageBean = departmentservice.findByPage(currPage);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}

	public String save() {

		departmentservice.save(department);

		return "saveSuccess";
	}

	public String edit() {

		department = departmentservice.findById(department.getDid());

		return "editSuccess";
	}

	public String update() {

		departmentservice.update(department);

		return "updateSuccess";
	}
	public String delete() {
		department = departmentservice.findById(department.getDid());

		departmentservice.delete(department);

		return "deleteSuccess";
	}
}
