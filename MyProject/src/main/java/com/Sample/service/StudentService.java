package com.Sample.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sample.dao.StudentRepository;
import com.Sample.model.Student;

@Service
public interface StudentService {
	
	public  Collection<Student> findAll();
	public Student findOne(int id);
	public Student save(Student student);
	public void delete(int id);
}
