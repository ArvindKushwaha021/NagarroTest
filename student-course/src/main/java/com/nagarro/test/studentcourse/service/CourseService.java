package com.nagarro.test.studentcourse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.test.studentcourse.dto.StudentDTO;
import com.nagarro.test.studentcourse.repository.CourseRepository;
/**
 * This is service class for handling all the requests related to Course
 * @author Arvind Kumar
 *
 */
@Service
public class CourseService {

	@Autowired
	CourseRepository repository;

	public List<StudentDTO> getStudentsByCourse(Long courseId) {

		List<StudentDTO> findStudentsByCourseId = repository.findStudentsByCourseId(courseId);

		return findStudentsByCourseId;
	}

}
