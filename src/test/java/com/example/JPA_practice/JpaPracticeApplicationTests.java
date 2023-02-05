package com.example.JPA_practice;

import com.example.JPA_practice.DataAccess.StudentRepository;
import com.example.JPA_practice.DataAccess.TeacherRepository;
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

}
