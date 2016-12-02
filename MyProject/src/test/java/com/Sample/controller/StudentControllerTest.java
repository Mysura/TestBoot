package com.Sample.controller;


import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.Sample.AbstractControllerTest;
import com.Sample.Controller.StudentController;
import com.Sample.service.StudentService;

@org.springframework.transaction.annotation.Transactional
public class StudentControllerTest extends AbstractControllerTest{
	
	@Mock
	public StudentService studentService;
	
	@InjectMocks
	
	public StudentController studentController;
	
	@Before
	public void setUp(){
		
		mockMvc = MockMvcBuilders.standaloneSetup(studentController).build();
		
		
	}
	
	
	
	
	

}
