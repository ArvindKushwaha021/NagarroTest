package com.nagarro.test.studentcourse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.test.studentcourse.dto.CourseDTO;
import com.nagarro.test.studentcourse.service.StudentService;

/**
 * This is Controller class to handle Students requests.
 * 
 * @author Arvind Kumar
 *
 */
@RestController
public class StudentController {

	@Autowired
	StudentService service;

	@GetMapping("students/{studentId}/courses")
	public ResponseEntity<List<CourseDTO>> getStudentCourses(@PathVariable("studentId") Long studentId) {

		return new ResponseEntity<List<CourseDTO>>(service.getStudentCourses(studentId), HttpStatus.OK);
	}

}
