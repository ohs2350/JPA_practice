package com.example.JPA_practice;

import com.example.JPA_practice.DataAccess.SeminarRepository;
import com.example.JPA_practice.DataAccess.SingupRepository;
import com.example.JPA_practice.DataAccess.StudentRepository;
import com.example.JPA_practice.DataAccess.TeacherRepository;
import com.example.JPA_practice.entities.JpaSeminar;
import com.example.JPA_practice.entities.JpaSignup;
import com.example.JPA_practice.entities.JpaStudent;
import com.example.JPA_practice.entities.JpaTeacher;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaPracticeApplicationTests {

	@Autowired
	StudentRepository studentRepository;
	@Autowired
	TeacherRepository teacherRepository;
	@Autowired
	SeminarRepository seminarRepository;
	@Autowired
	SingupRepository singupRepository;

	@Test
	void contextLoads() {
	}

	@Test
	@DisplayName("양방향 일대다 연관관계 테스트")
	public void OneToMany() {
		JpaTeacher jpaTeacher = new JpaTeacher();
		jpaTeacher.setTeacher_NAME("김선생");
		teacherRepository.save(jpaTeacher);

		JpaStudent jpaStudent = new JpaStudent();
		jpaStudent.setStudent_NAME("김학생");
		jpaStudent.setJpaTeacher(jpaTeacher);
		studentRepository.save(jpaStudent);
	}

	@Test
	@DisplayName("양방향 다대다 연관관계 테스트")
	public void ManyToMany() {
		JpaTeacher jpaTeacher = new JpaTeacher();
		jpaTeacher.setTeacher_NAME("박선생");
		teacherRepository.save(jpaTeacher);

		JpaSeminar jpaSeminar = new JpaSeminar();
		jpaSeminar.setSeminar_NAME("세미나1");
		seminarRepository.save(jpaSeminar);

		JpaSignup jpaSignup = new JpaSignup();
		jpaSignup.setJpaTeacher(jpaTeacher);
		jpaSignup.setJpaSeminar(jpaSeminar);
		singupRepository.save(jpaSignup);
	}

}
