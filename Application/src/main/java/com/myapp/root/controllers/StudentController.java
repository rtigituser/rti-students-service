package com.myapp.root.controllers;



import com.myapp.root.Student;
import com.myapp.root.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class StudentController {

    static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
    
    @Autowired
    private StudentRepository studentRepository;


    @GetMapping(path = "/students", produces = { MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Student>> findAll() {
        LOGGER.info("StudentController.getStudents ");
        LOGGER.info("StudentController.getStudents "+ studentRepository);
        Iterable<Student> students = studentRepository.findAll();

        List<Student> users = new ArrayList<>();
        for (Student student : students) {
            users.add(student);
        }
        return  new ResponseEntity<List<Student>>(users, HttpStatus.OK);
    }

    @GetMapping(path="/student/{id}", produces = { MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Student> findByStateId(@PathVariable String id)  {
        LOGGER.info("StudentController.findByStateId");
        LOGGER.info("StudentController.findByStateId");
        LOGGER.info("StudentController.findByStateId  "+id);
        Student student = studentRepository.findByStateId(id);
        LOGGER.info("StudentController.findByStateId  "+student);
        return new ResponseEntity<Student>(student, HttpStatus.OK);
    }

}
