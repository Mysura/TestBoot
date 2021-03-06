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


@RestController
@RequestMapping(value="/Rest/Students")
public class StudentControllerD {
	
	
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public Collection<Student> getStudents(){
		return studentService.getStudents();
			
	
	}
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") int id){
		return studentService.getStudentsById(id);
}
}