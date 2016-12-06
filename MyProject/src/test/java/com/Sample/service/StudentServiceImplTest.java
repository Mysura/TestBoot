package com.Sample.service;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.Sample.AbstractControllerTest;
import com.Sample.dao.StudentRepository;
import com.Sample.model.Student;


public class StudentServiceImplTest extends AbstractControllerTest{
	
	@Mock
	public StudentRepository studentRepository;
	
	@InjectMocks
	public StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testFindAll(){
		Mockito.when(studentServiceImpl.findAll()).thenReturn(new ArrayList<Student>());
		Collection<Student> empObjs = studentServiceImpl.findAll();
		Assert.assertEquals(empObjs.size(), 0);
	}
	
	
	
	
	
	
	
	
	
	
}