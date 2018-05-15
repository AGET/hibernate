package com.aget.hibernate.dao;

import com.aget.hibernate.model.Teacher;

import java.util.List;

import com.aget.hibernate.model.Course;
import com.aget.hibernate.model.SocialMedia;
import com.aget.hibernate.model.TeacherSocialMedia;

public interface TeacherDao {
	
	void saveTeacher(Teacher teacher);

	void deleteTeacherById(Long id);

	void updateTeacher(Teacher teacher);

	List<Teacher> findAllTeachers();

	Teacher findById(Long idTeacher);

	Teacher findByName(String name);
}
