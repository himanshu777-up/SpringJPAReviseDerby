package com.himanshu.database.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.himanshu.database.objects.Topic;
import com.himanshu.database.repo.TopicRepo;

@Service
public class TopicService {

//	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("1", "abc", "abcde"), new Topic("2", "bcd", "bcdfudif"),
//			new Topic("3", "pero", "jdhfihdfhd"), new Topic("4", "okjg", "wnfoe"), new Topic("5", "wdsfd", "mnfijbdufbgs")));

	@Autowired
	private TopicRepo topicRepo;
	
	public List<Topic> getAllTopics() {
		
		System.out.println("get  all topics method called");
		
		List<Topic> topics = new ArrayList<>();
		topicRepo.findAll().forEach(topics::add);
		
		return topics;	
		//return topics;
	}

	public Optional<Topic> getTopicById(String id) {
		System.out.println("get topic by id method called");
//		return topics.get(id - 1);
		
		return topicRepo.findById(id);
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		System.out.println("add topic method called");
//		topics.add(topic);
		topicRepo.save(topic);
		
	}

	public void updateTopic(Topic topic, int id) {
		// TODO Auto-generated method stub
		System.out.println("update topic method called");
//		topics.set(id, topic);
		
		topicRepo.save(topic);
		
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		System.out.println("delete topic by id method called");
//		topics.remove(id-1);
		
		topicRepo.deleteById(id);
		
	}

}
