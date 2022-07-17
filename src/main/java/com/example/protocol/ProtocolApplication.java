package com.example.protocol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class ProtocolApplication {
	@Bean
	public CourseRepository createTestCourses() {
		Map<Integer, BaeldungTraining.Course> courses = new HashMap<>();
		BaeldungTraining.Course course1 = BaeldungTraining.Course.newBuilder()
				.setId(1)
				.setCourseName("REST with Spring")
				.addAllStudent(createTestStudents())
				.build();
		BaeldungTraining.Course course2 = BaeldungTraining.Course.newBuilder()
				.setId(2)
				.setCourseName("Learn Spring Security")
				.addAllStudent(new ArrayList<BaeldungTraining.Student>())
				.build();
		courses.put(course1.getId(), course1);
		courses.put(course2.getId(), course2);
		return new CourseRepository(courses);
	}

	private Iterable<BaeldungTraining.Student> createTestStudents() {
		BaeldungTraining.Student student = BaeldungTraining.Student.newBuilder()
				.setFirstName("Vishnu")
				.setLastName("P")
				.build();

		return Collections.singleton(student);
	}

	public static void main(String[] args) {
		SpringApplication.run(ProtocolApplication.class, args);
	}

}
