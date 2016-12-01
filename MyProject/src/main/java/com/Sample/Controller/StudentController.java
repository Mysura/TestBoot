package com.Sample.Controller;

import java.util.*;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Sample.model.*;


@RestController
public class StudentController {
	
	private static int id;
	
	private static Map<Integer,Student> smap;
	
	@RequestMapping(value="Student/Students", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Student>> getStudents(){
		return null;
		
		
		
		
		
	}
	

}
