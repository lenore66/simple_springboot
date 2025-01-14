package org.example.controller;

import org.example.objects.Topic;
import org.example.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RestController
public class Controller {
    @Autowired
    private TopicService topicService;

    @GetMapping("/topics")
    public List<Topic> getTopics(){
        return topicService.getTopicList();
    }
    @GetMapping("/topics/{id}")
    public Topic findById(@PathVariable String id){
        return topicService.getById(id);
    }
    @PostMapping("/addTopic")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }
    @PutMapping("/updateTopic")
    public void updateTopic(@RequestBody Topic topic){
        topicService.updateTopic(topic);
    }
    @DeleteMapping("/deleteTopic")
    public void deleteTopic(@RequestBody Topic topic){
        topicService.deleteTopic(topic);
    }
}
