package org.example.topic.service;

import org.example.topic.objects.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {
//
//     List<Topic> topics = new ArrayList<>( Arrays.asList(
//             new Topic("1234567", "Medieval History") ,
//            new Topic("73242424", "Byzantine Emperors"),
//            new Topic("1212121", "War of the Roses"),
//             new Topic("4567890123", "the Hapsburgs")));
     @Autowired
TopicRepository topicRepository;

    public List<Topic> getTopicList(){

        List<Topic> topicList = new ArrayList<>();
         topicRepository.findAll().forEach(topicList::add);
         return topicList;
    }
    public Topic getById(String id){
       return topicRepository.findById(id).get();
    }
    public void addTopic(Topic topic){
       topicRepository.save(topic);
    }
     public void updateTopic(Topic topic){

         topicRepository.save(topic);
    }
     public void deleteTopic(Topic topic){
      topicRepository.delete(topic);                                   } }

