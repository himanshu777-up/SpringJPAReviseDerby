package com.himanshu.database.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.himanshu.database.objects.Course;
import com.himanshu.database.repo.CourseRepo;

@Service
public class CourseService {

	@Autowired
	private CourseRepo courseRepo;

	public List<Course> getAllCourses(String topicId) {

		System.out.println("get  all courses for a specific topic method called");

		List<Course> courses = new ArrayList<>();
		courseRepo.findByTopicId(topicId).forEach(courses::add);

		return courses;
	}

	public Optional<Course> getCourseById(String id) {
		System.out.println("get course by id method called");

		return courseRepo.findById(id);
	}

	public void addCourse(Course course) {

		System.out.println("add course method called");
		courseRepo.save(course);

	}

	public void updateCourse(Course course, int id) {

		System.out.println("update course method called");
		courseRepo.save(course);

	}

	public void deleteCourse(String id) {

		System.out.println("delete course by id method called");
		courseRepo.deleteById(id);

	}

}
