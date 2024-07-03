package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Course;
import com.example.demo.repository.CourseRepository;

@Service
public class CourseImpl implements CourseService{
	
	@Autowired
	CourseRepository courseRepository;

	@Override
	public List<Course> getAllCourse() {
		List<Course> courseList = courseRepository.findAll();
		return courseList;
	}

	@Override
	public Course getCourseById(Integer id) {
		Optional<Course> course = courseRepository.findById(id);
		if(course.isPresent()) {
			return course.get();
		}
		return null;
	}

	@Override
	public String addCourse(Course course) {
		courseRepository.save(course);
		return course.getName() + " course added successfully...";
	}

	@Override
	public String updateCourse(Course course) {
		courseRepository.save(course);
		return course.getName() + " course updated successfully...";
	}

	@Override
	public String deleteCourse(Integer id) {
		courseRepository.deleteById(id);
		return "Course deleted successfully...";
	}

}
