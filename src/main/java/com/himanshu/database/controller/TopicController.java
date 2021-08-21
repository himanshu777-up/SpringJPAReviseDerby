package com.himanshu.database.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.himanshu.database.objects.Topic;
import com.himanshu.database.service.TopicService;
//import com.himanshu.database.service.Vehicle;


@RestController
public class TopicController {
	
//	@Autowired
//	@Qualifier("car")
//	private Vehicle vehicle;
//	
//	@RequestMapping("/hi")
//	public void showVehicles() {
//		
//		vehicle.vehicleName();
//	}
	
	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> showAllTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Optional<Topic> getTopicbyId(@PathVariable String id) {
		
		return topicService.getTopicById(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);	
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable int id) {
		topicService.updateTopic(topic, id);	
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void delTopic(@PathVariable String id) {
		topicService.deleteTopic(id);	
	}
	
}
