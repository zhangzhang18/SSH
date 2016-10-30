package com.org.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.org.dao.DepartmentDao;
import com.org.entity.Department;

public class DepartmentDaoImpl extends HibernateDaoSupport implements DepartmentDao {

	@Override
	public int findCount() {
		String hql="select count(*)  from Department";
		List<Long> count=this.getHibernateTemplate().find(hql);
		if(count.size()>0){
			return count.get(0).intValue();
		}
		return 0;
	}

	@Override
	public List<Department> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria=DetachedCriteria.forClass(Department.class);
		List<Department> list=this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		
		return list;
	}

	@Override
	public void save(Department department) {
		this.getHibernateTemplate().save(department);
	}

	@Override
	public Department findById(Integer did) {

		return	(Department) this.getHibernateTemplate().get(Department.class, did);
		
	}

	@Override
	public void update(Department department) {
	  this.getHibernateTemplate().update(department);
	}

	@Override
	public void delete(Department department) {
this.getHibernateTemplate().delete(department);		
	}

}
