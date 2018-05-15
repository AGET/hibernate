package com.aget.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aget.hibernate.dao.TeacherDao;
import com.aget.hibernate.dao.TeacherDaoImpl;
import com.aget.hibernate.model.Course;
import com.aget.hibernate.model.Teacher;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Teacher teacher = new Teacher("Omar", "avatar");
		TeacherDaoImpl teacherDaoImpl = new TeacherDaoImpl();
		teacherDaoImpl.saveTeacher(teacher);

		Teacher teacher2 = new Teacher("Tavo", "avatar");
		TeacherDaoImpl teacherDaoImpl2 = new TeacherDaoImpl();
		teacherDaoImpl2.saveTeacher(teacher2);
		// Course course = new Course("JEE", "Tema 1", "REST API");

		List<Teacher> teachers = teacherDaoImpl.findAllTeachers();
		
		for (Teacher t : teachers)
			System.out.println("Nombre: "+ t.getName());
	}
}
