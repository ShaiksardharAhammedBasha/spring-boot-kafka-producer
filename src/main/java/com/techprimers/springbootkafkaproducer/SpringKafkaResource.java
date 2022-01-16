package com.techprimers.springbootkafkaproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="kafka/producer")
public class SpringKafkaResource {

    @Autowired
    private KafkaTemplate<String, Student> kafkaTemplate;

    private static final String TOPIC = "student_demo_topic";
    private static final String TOPIC2 = "student_kafka_listener";

    @GetMapping(value="/student/{id}/{message}/{city}")
    public String publishMessageToKafkaServer(@PathVariable("id") String id,
                                              @PathVariable("message") String message,
                                              @PathVariable("city") String city) {
        kafkaTemplate.send(TOPIC, new Student(id, message, city));
        System.out.println("Id is:"+id+" Message is:"+message);
        System.out.println(TOPIC.toLowerCase());
        System.out.println(TOPIC.startsWith("s"));
        return "Message Published Successfully to kafka server:";
    }

}
