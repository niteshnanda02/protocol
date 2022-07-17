package com.example.protocol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;

@RestController
public class Controller {
    @GetMapping("/")
    public String hello(){
        return "Hello";
    }

    @Autowired
    CourseRepository courseRepo;

    @GetMapping("/courses/{id}")
    String customer(@PathVariable Integer id) {
        return courseRepo.getCourse(id).toString();
    }

//    private String convertProtobufMessageStreamToJsonString(InputStream protobufStream) throws IOException {
//        JsonFormat jsonFormat = new JsonFormat();
//        Course course = Course.parseFrom(protobufStream);
//        return jsonFormat.printToString(course);
//    }
}
