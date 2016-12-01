package com.Sample.dao;

import java.math.BigInteger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.Sample.model.Student;
@Repository
public class StudentDao {

private static Map<Integer, Student> smap;
	
	static{
		smap = new HashMap<Integer, Student>();
		smap.put(1,new Student(1,"A"));
		smap.put(2,new Student(2,"B"));
		smap.put(3,new Student(3,"C"));
		smap.put(4,new Student(4,"D"));
		
		
	}
	
	public Collection<Student> getStudents(){
		
		
		return this.smap.values();
	}
	
	
}
