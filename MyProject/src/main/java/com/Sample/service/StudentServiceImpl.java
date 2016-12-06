package com.Sample.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.Sample.dao.StudentRepository;
import com.Sample.model.Student;
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class StudentServiceImpl implements StudentService {

	@Autowired
	public StudentRepository studentRepository;
	@Override
	public Collection<Student> findAll() {
		Collection<Student> students = studentRepository.findAll();
		return students;
	}

	@Override
	public Student findOne(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findOne(id);
	}

	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
