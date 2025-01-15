package org.example.course.objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.topic.objects.Topic;

@Data
@AllArgsConstructor
@Entity
public class Course {
    @Id
    private String courseId;
    private String name;
    @ManyToOne
    private Topic topic;

}
