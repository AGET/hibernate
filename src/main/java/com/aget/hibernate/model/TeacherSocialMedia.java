package com.aget.hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "teacher_social_media")
public class TeacherSocialMedia implements Serializable{
	
	@Id
	@Column(name = "id_teacher_social_media")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTeacherSocialMedia;
	
	@Column(name="nickname")
	private String nickName;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_teacher")
	private	 Teacher teacher;
	
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_social_media")
	private SocialMedia SocialMedia;
	
	
	
	public TeacherSocialMedia() {
		super();
	}
	
	
	public TeacherSocialMedia(Teacher teacher, com.aget.hibernate.model.SocialMedia socialMedia, String nickName) {
		super();
		this.teacher = teacher;
		SocialMedia = socialMedia;
		this.nickName = nickName;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public SocialMedia getSocialMedia() {
		return SocialMedia;
	}
	public void setSocialMedia(SocialMedia socialMedia) {
		SocialMedia = socialMedia;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
}
