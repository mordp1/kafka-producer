package com.redhat.springbootdmnkafkasample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redhat.springbootdmnkafkasample.producer.TopicProducer;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
	
    private final TopicProducer topicProducer;
    @GetMapping(value = "/send")
    public void send(){
    	String message = "Teste envio mensagem tópico";
    	
        topicProducer.send(message);
    }
    
    @PostMapping(value = "/send")
    public void sendPost(@RequestBody String dmn){
    	topicProducer.send(dmn);
    }
}