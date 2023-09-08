package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entity.Course;
@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseDao cd;
	//List<Course> list;
	
	//constructor
	public CourseServiceImpl() {
		/*
		 * list=new ArrayList<>(); list.add(new Course(123,"java","b")); list.add(new
		 * Course(123,"spring boot","n"));
		 */
	}
	
	
	
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return cd.findAll();
	}
	
	
	
	
	
	
	@Override
	//get single course
	public Course getCourse(int courseId) {
//		Course c=null;
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
		return cd.getOne((long) courseId);
	}
	
	
	
	@Override
	public Course addCourse(Course course) {
	   // list.add(course);
		cd.save(course);
		return course;
	}
	
	
	public Course updateCourse(Course course) {
		
		cd.save(course);
		return course;
		
	}
	
	
	public void deleteCourse(long parselong) {
		Course entity=cd.getOne(parselong);//load the entity
		cd.delete(entity);
	}

}
