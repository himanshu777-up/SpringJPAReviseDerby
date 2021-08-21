package com.himanshu.database.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.himanshu.database.objects.Course;

public interface CourseRepo extends CrudRepository<Course, String> {
	
	public List<Course> findByTopicId(String TopicId);

}
