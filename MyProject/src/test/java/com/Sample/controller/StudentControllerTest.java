package com.Sample.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.Sample.AbstractControllerTest;
import com.Sample.Controller.StudentController;
import com.Sample.service.StudentService;
import org.springframework.http.MediaType;

import com.Sample.model.*;

public class StudentControllerTest extends AbstractControllerTest {

	@Mock
	public StudentService studentservice;

	@InjectMocks
	public StudentController studentController;

	@Before
	public void setUp() {

		mockMvc = MockMvcBuilders.standaloneSetup(studentController).build();

	}

	@Test
	public void testGetStudents() throws Exception {
		Mockito.when(studentservice.findAll()).thenReturn(new ArrayList<Student>());
		mockMvc.perform(get("/Rest/Students")).andExpect(status().isOk())
				.andExpect(content().contentType("application/json;charset=UTF-8"));

	}

	public void testGetStudentById() throws Exception {
		Mockito.when(studentservice.findOne(Matchers.anyInt())).thenReturn(new Student());
		mockMvc.perform(get("/Rest/Students/7")).andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE));
	}
	@Test
	public void testGetEmpWithoutData() throws Exception {
		Mockito.when(studentservice.findOne(Matchers.anyInt())).thenReturn(null);
		mockMvc.perform(get("/Rest/Students/7")).andExpect(status().is(400));
	}
}
