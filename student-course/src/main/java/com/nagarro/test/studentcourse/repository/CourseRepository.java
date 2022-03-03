package com.nagarro.test.studentcourse.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nagarro.test.studentcourse.dto.StudentDTO;
import com.nagarro.test.studentcourse.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

	@Query(value = "select s.student_id as studentId, s.first_name as firstName, s.last_name as lastName, s.age as age, s.email as email from student s inner join student_course_map scm  where s.student_id = scm.student_id and scm.course_id= :courseId", nativeQuery = true)
	List<StudentDTO> findStudentsByCourseId(@Param("courseId") Long courseId);
}