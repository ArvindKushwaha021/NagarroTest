package com.nagarro.test.studentcourse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.test.studentcourse.dto.StudentDTO;
import com.nagarro.test.studentcourse.service.CourseService;
/**
 * This is Controller class for handle the course requests
 * @author Arvind Kumar
 *
 */
@RestController()
public class CourseController {

	@Autowired
	CourseService service;

	@GetMapping("courses/{courseId}/students")
	public ResponseEntity<List<StudentDTO>> getStudentsByCourse(@PathVariable("courseId") Long courseId) {
	
		return new ResponseEntity<List<StudentDTO>>(service.getStudentsByCourse(courseId), HttpStatus.OK);
	}

}
