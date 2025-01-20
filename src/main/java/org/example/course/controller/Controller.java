package org.example.course.controller;

import org.example.course.objects.Course;
import org.example.course.service.CourseService;
import org.example.topic.objects.Topic;
import org.example.topic.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//
//@RestController
//public class Controller {
//    @Autowired
//    private CourseService courseService;
//
//    @GetMapping("/topic/{topicId}/courses")
//    public List<Course> getAllCourses(@PathVariable String topicId){
//        return courseService.getCourseAllList(topicId);
//    }
//    @GetMapping("/topic/{topicId}/courses/{coursesId}")
//    public Course findById(@PathVariable String coursesId, @PathVariable String topicId){
//
//        return courseService.getById(coursesId);
//    }
//    @PostMapping("/topic/{id}/courses/{coursesId}")
//    public void addCourse(@RequestBody Course course, @PathVariable String topicId){
//        course.setTopic( new Topic(topicId, "") );
//        courseService.addCourse(course);
//    }
//    @PutMapping("/topic/{id}/courses/{coursesId}")
//    public void updateCourse(@RequestBody Course course, @PathVariable String topicId){
//        course.setTopic( new Topic(topicId, "") );
//        courseService.updateCourse(course);
//    }
//    @DeleteMapping("/topic/{id}/courses/{coursesId}")
//    public void deleteCourse(@PathVariable Course course, @PathVariable String topicId){
//        course.setTopic( new Topic(topicId, "") );
//        courseService.deleteCourse(course);
//    }
//}
