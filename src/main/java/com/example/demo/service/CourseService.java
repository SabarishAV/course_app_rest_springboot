package com.example.demo.service;

import java.util.List;

import com.example.demo.Course;

public interface CourseService {
	
	public List<Course> getAllCourse();
	
	public Course getCourseById(Integer id);
	
	public String addCourse(Course course);
	
	public String updateCourse(Course course);
	
	public String deleteCourse(Integer id);

}
