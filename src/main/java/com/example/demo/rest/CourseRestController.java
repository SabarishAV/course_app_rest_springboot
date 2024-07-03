package com.example.demo.rest;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Course;
import com.example.demo.service.CourseService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CourseRestController {
	
	@Autowired
	CourseService courseService;
	
	@GetMapping("/course")
	public ResponseEntity<List<Course>> getAllCourses() {
		List<Course> courseList = courseService.getAllCourse();
		return new ResponseEntity<>(courseList,HttpStatus.OK);
	}
	
	@GetMapping("/course/{id}")
	public ResponseEntity<Course> getCourse(@PathVariable Integer id){
		Course course = courseService.getCourseById(id);
		return new ResponseEntity<>(course,HttpStatus.OK);
	}
	
	@PostMapping("/course")
	public ResponseEntity<String> addNewCourse(@RequestBody Course course){
		String status = courseService.addCourse(course);
		return new ResponseEntity<>(status,HttpStatus.CREATED);
	}
	
	@PutMapping("/course/{id}")
	public ResponseEntity<String> updateCourse(@RequestBody Course course){
		String status = courseService.updateCourse(course);
		return new ResponseEntity<String>(status,HttpStatus.OK);
	}
	
	@DeleteMapping("/course/{id}")
	public ResponseEntity<String> deleteCourse(@PathVariable Integer id){
		String status = courseService.deleteCourse(id);
		return new ResponseEntity<String>(status,HttpStatus.OK);
	}
	

}
