# NagarroTest
This repository two items

1. Student-course project.
   This is a simple springboot project which have two entities
   a)Student
   b)Course
	There is many to many relationship between two entities.

There are two REST api expesed
  i) http://localhost:8080/students/1/courses  >> This API will return the list of courses for which the student with given id is enrolled
  ii)http://localhost:8080/courses/1/students  >> This API will return the list of student enrolled for course with given id
  
Note: This is basic prjoject and lots of enhancement can be done.

2. Write a program to given problem:
There are two inputs
  i)There is a map having key as integer and value as List of list.
	e.g map<Integer, List<List<Integer>>
  ii)given a number n
  
  We have to write a program to find the sum of all element available in 2D Array i.e List<List<Integer>>
  
  Add the sum of 2D arrays available on particular key in hashmap into a list. We have to add the sum only those 2D arrays in the list for which the hasmap key is greater than given number n.
  
  Refer NagarroTest.java file in the repository.
	
	
  
  



