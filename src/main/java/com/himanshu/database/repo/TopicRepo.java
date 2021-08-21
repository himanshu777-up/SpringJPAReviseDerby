package com.himanshu.database.repo;

import org.springframework.data.repository.CrudRepository;

import com.himanshu.database.objects.Topic;

public interface TopicRepo extends CrudRepository <Topic, String> {

}
