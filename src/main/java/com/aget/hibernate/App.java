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

		/**
		 * Método usando el patron DAO
		 */
	
		TeacherDaoImpl teacherDaoImpl = new TeacherDaoImpl();
		
	/*Teacher teacher = new Teacher("Aldin", "su imagen");
		teacherDaoImpl.saveTeacher(teacher);

		List<Teacher> teachers = teacherDaoImpl.findAllTeachers();

		for (Teacher t : teachers)
			System.out.println("Nombre: " + t.getName());*/

		// update
		Teacher teacher1 = teacherDaoImpl.findById(4L);
		teacher1.setName("Update");
		teacherDaoImpl.updateTeacher(teacher1);

		/**
		 * Método normal de consultas
		 */

		/*
		 * SessionFactory sessionFactory; Configuration configuration = new
		 * Configuration(); configuration.configure(); sessionFactory=
		 * configuration.buildSessionFactory(); Session session =
		 * sessionFactory.openSession();
		 */

		/*
		 * Teacher teacher = new Teacher("Aldo","imagen"); session.beginTransaction();
		 * session.save(teacher); session.getTransaction().commit(); session.close();
		 */

		/*
		 * Course course= new Course("Android","Fundamentos", "Actividades");
		 * session.beginTransaction(); session.save(course);
		 * session.getTransaction().commit(); session.close();
		 */

	}
}
