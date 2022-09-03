package com.example.ms.kafkaConsumer.component;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
@Component
public class KafkaConsumer {
	@KafkaListener(topics = "NewTopic",
            groupId = "group_id")
	
	
	public void consume(String message) {
		System.out.println("Message from Kafka Topic:::::  "+message);
	}
}
