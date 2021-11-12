package com.myapp.root.controllers;


import com.myapp.root.Attendant;
import com.myapp.root.AttendantRepository;
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
public class AttendantController {

    static final Logger log = LoggerFactory.getLogger(AttendantController.class);


    @Autowired
    private AttendantRepository attendantRepository;


    @RequestMapping( value = "/attendants", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, method = RequestMethod.GET)
    public ResponseEntity<List<Attendant>> findAll() {
        log.info("AttendanceController.getStudents "+ attendantRepository);
        Iterable<Attendant> attendantIterable = attendantRepository.findAll();
        List<Attendant> attendants = new ArrayList<>();
        for (Attendant attendant : attendantIterable) {
            attendants.add(attendant);
        }
        return new ResponseEntity<List<Attendant>>(attendants, HttpStatus.OK);
    }

    @GetMapping(path="/attendants/student/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<List<Attendant>>  findByStudent(@PathVariable String id)  {
        log.info("AttendanceController.findByStateId  "+id);
        List<Attendant> attendants  = attendantRepository.findByStateId(id);
        log.info("AttendanceController.findByStateId  "+attendants);
        return new ResponseEntity<List<Attendant>>(attendants, HttpStatus.OK);
    }

    @GetMapping(path="/attendants/school/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<List<Attendant>> findBySchool(@PathVariable String id)  {
        log.info("AttendanceController.findBySchool  "+id);
        List<Attendant> attendants  = attendantRepository.findBySchoolId(id);
        log.info("AttendanceController.findBySchool  "+attendants);
        return new ResponseEntity<List<Attendant>>(attendants, HttpStatus.OK);
    }

}
