package com.example.protocol;

import org.springframework.stereotype.Repository;

import java.util.Map;

//@Repository
public class CourseRepository {
    Map<Integer, BaeldungTraining.Course> courses;

    public CourseRepository (Map<Integer, BaeldungTraining.Course> courses) {
        this.courses = courses;
    }

    public BaeldungTraining.Course getCourse(int id) {
        return courses.get(id);
    }
}