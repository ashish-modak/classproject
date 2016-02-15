/**
 * 
 */
package com.student.bcf;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.StudentSI;
import com.common.MessageTO;
import com.entities.StudentBE;
import com.student.bo.StudentBO;
import com.to.StudentTO;

/**
 * @author Ashish
 * 
 */
@Service
public class StudentBCF implements StudentSI {

	private StudentBO studentBo;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.api.StudentSI#getStudentInfo(java.lang.String)
	 */
	public StudentTO getStudentInfo(String studentId) {
		StudentBE student = studentBo.getStudentInfo(studentId);
		StudentTO studentTO = EntityTOConverter.convertStudentEntity(student);
		return studentTO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.api.StudentSI#getStudentsInfo(java.lang.String)
	 */
	public List<StudentTO> getStudentsInfo(String studentName) {
		List<StudentBE> students = studentBo.getStudentsInfo(studentName);
		List<StudentTO> studentTOs = EntityTOConverter
				.convertStudentEntities(students);
		return studentTOs;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.api.StudentSI#enrollStudent(com.to.StudentTO)
	 */
	public StudentTO enrollStudent(StudentTO studentInfo) {
		StudentBE student = studentBo.enrollStudent(studentInfo);
		StudentTO studentTO = EntityTOConverter.convertStudentEntity(student);
		return studentTO;
	}

	public MessageTO removeStudent(String studentID) {
		// TODO Auto-generated method stub
		return studentBo.removeStudent(studentID);
	}
}
