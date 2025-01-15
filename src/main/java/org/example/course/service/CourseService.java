package org.example.course.service;

import org.example.course.objects.Course;
import org.example.topic.objects.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

     @Autowired
CourseRepository courseRepository;

    public List<Course> getCourseAllList(String topicId){

        List<Course> courseList = new ArrayList<>();
         courseRepository.findByTopicTopicId(topicId).forEach(courseList::add);
         return courseList;
    }
    public Course getById(String id){
       return courseRepository.findById(id).get();
    }
    public void addCourse(Course course){
       courseRepository.save(course);
    }
     public void updateCourse(Course course){

         courseRepository.save(course);
    }
     public void deleteCourse(Course course){
      courseRepository.delete(course);                                   } }

