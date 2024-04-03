package com.Spring.ORM.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.Spring.ORM.entity.Student;
import org.springframework.transaction.annotation.Transactional;


	

public class StudentDao {
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(Student student) {
		
		
		int i =(Integer) this.hibernateTemplate.save(student);
		return i;
		
	}


	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
