package com.aget.hibernate.dao;

import java.util.List;

import com.aget.hibernate.model.Teacher;

public class TeacherDaoImpl extends MySession implements TeacherDao {

	private MySession mySession;
	
	public TeacherDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
		mySession = new MySession();
	}

	public void saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		mySession.getSession().persist(teacher);
		mySession.getSession().getTransaction().commit();
	}

	public void deleteTeacherById(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	public List<Teacher> findAllTeachers() {
		// TODO Auto-generated method stub
		return mySession.getSession().createQuery("from Teacher").list();
	}

	public Teacher findById(Long idTeacher) {
		// TODO Auto-generated method stub
		return null;
	}

	public Teacher findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
