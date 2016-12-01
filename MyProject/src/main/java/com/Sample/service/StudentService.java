package com.Sample.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sample.dao.StudentDao;
import com.Sample.model.Student;

@Service
public class StudentService {
    @Autowired
	private StudentDao sdao;
public Collection<Student> getStudents(){
		
		
		return sdao.getStudents();
	}
	
	
	
}
