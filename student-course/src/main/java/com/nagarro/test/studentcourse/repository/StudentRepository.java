package com.nagarro.test.studentcourse.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nagarro.test.studentcourse.dto.CourseDTO;
import com.nagarro.test.studentcourse.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	@Query(value = "select c.course_id as courseId, c.title as title from course c inner join student_course_map scm  where c.course_id = scm.course_id and scm.student_id= :studentId", nativeQuery = true)
	List<CourseDTO> getStudentCourses(@Param("studentId") Long studentId);

}
