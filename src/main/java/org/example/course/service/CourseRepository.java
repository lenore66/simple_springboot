package org.example.course.service;

import org.example.course.objects.Course;
import org.example.topic.objects.Topic;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface CourseRepository extends CrudRepository<Course, String> {
    public List<Course> findByTopicTopicId(String topicId);
}
