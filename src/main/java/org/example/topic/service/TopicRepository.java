package org.example.topic.service;

import org.example.topic.objects.Topic;
import org.springframework.data.repository.CrudRepository;


public interface TopicRepository extends CrudRepository<Topic, String> {

}
