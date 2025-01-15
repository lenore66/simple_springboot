package org.example.topic.controller;

import org.example.topic.objects.Topic;
import org.example.topic.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
