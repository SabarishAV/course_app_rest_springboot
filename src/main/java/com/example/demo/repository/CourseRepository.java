package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{
}
