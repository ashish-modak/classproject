/**
 * 
 */
package com.student.bo;

import java.util.List;

import com.common.MessageTO;
import com.entities.StudentBE;
import com.student.dao.StudentDAO;
import com.to.StudentTO;

/**
 * @author Ashish
 * 
 */
public class StudentBOImpl implements StudentBO {

	private StudentDAO studentDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.student.bo.StudentBO#getStudentInfo(java.lang.String)
	 */
	public StudentBE getStudentInfo(String studentId) {
		return studentDAO.getStudentInfo(studentId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.student.bo.StudentBO#getStudentsInfo(java.lang.String)
	 */
	public List<StudentBE> getStudentsInfo(String studentName) {
		return studentDAO.getStudentsInfo(studentName);
	}

	/* (non-Javadoc)
	 * @see com.student.bo.StudentBO#enrollStudent(com.to.StudentTO)
	 */
	public StudentBE enrollStudent(StudentTO studentInfo) {
		return studentDAO.enrollStudent(studentInfo);
	}

	public MessageTO removeStudent(String studentID) {
		// TODO Auto-generated method stub
		return studentDAO.removeStudent(null);
	}

}
