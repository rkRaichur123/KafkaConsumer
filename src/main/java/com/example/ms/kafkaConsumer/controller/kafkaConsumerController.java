package com.example.ms.kafkaConsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ms.kafkaConsumer.service.KafkaConsumerServiceImpl;

@RestController
@RequestMapping(value ="/api/kafkaConsumer")
public class kafkaConsumerController {
	
	@Autowired
	KafkaConsumerServiceImpl kafkaConsumer;
	
	@GetMapping(value = "/healthCheck")
	public String healthCheck() {
		return "Kafka Consumer is up and Running";
	}
	
	

}
