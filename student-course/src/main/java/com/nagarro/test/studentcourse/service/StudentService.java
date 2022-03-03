package com.nagarro.test.studentcourse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.test.studentcourse.dto.CourseDTO;
import com.nagarro.test.studentcourse.repository.StudentRepository;
/**
 * This is service class to handle all the request for students.
 * @author User
 *
 */
@Service
public class StudentService {

	@Autowired
	StudentRepository repository;

	public List<CourseDTO> getStudentCourses(Long studentId) {
		return repository.getStudentCourses(studentId);
	}

}
