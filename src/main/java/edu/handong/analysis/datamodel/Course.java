package edu.handong.analysis.datamodel;

public class Course {

	private String courseName;	
	
	public Course (String studentCourses) {
		courseName=studentCourses;
	}

	public String getCourseName() {
		return courseName;
	}
	
}
