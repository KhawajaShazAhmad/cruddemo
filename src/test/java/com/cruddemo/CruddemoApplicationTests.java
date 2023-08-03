package com.cruddemo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cruddemo.Repository.StudentRepository;
import com.cruddemo.entity.Student;

@SpringBootTest
class CruddemoApplicationTests {

	@Autowired
	private StudentRepository studentRepo;

	@Test
	void saveStudent() {
		Student s = new Student();
		s.setName("Bruce");
		s.setCourse("Dev");
		s.setFee(9000);

		studentRepo.save(s);
	}

	@Test
	void deleteStudent() {
		studentRepo.deleteById(14L);
	}

	@Test
	void findStudent() {
		Optional<Student> findById = studentRepo.findById(1L);
		Student student = findById.get();

		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getCourse());
		System.out.println(student.getFee());
	}

	@Test
	void updateStudent() {
		Student s = new Student();
		s.setId(1L);
		s.setName("stallin");
		s.setCourse("Testing");
		s.setFee(15000);

		studentRepo.save(s);
	}

	@Test
	void existStudent() {

		boolean val = studentRepo.existsById(10L);
		System.out.println(val);
	}

	@Test
	void allStudent() {

		Iterable<Student> findAll = studentRepo.findAll();
		for (Student student : findAll) {
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getCourse());
			System.out.println(student.getFee());
		}
	}

}
