package com.Sample.Controller;

import java.math.BigInteger;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Sample.model.*;
import com.Sample.service.StudentService;
import com.Sample.service.StudentServiceImpl;

@RestController
@RequestMapping(value = "/Rest/Students")
public class StudentController {
	@Autowired
	public StudentService studentservice;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<Collection<Student>> getStudents() {
		return new ResponseEntity<Collection<Student>>(studentservice.findAll(), HttpStatus.OK);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Student> getStudentById(@PathVariable("id") int id) {
		Student student = studentservice.findOne(id);
		if (student != null) {
			return new ResponseEntity<Student>(studentservice.findOne(id), HttpStatus.OK);

		} else {
			return new ResponseEntity<Student>(HttpStatus.BAD_REQUEST);
		}
	}
}