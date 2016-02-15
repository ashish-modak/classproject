/**
 * 
 */
package com.student.bo;

import java.util.List;

import com.common.MessageTO;
import com.entities.StudentBE;
import com.to.StudentTO;

/**
 * @author Ashish
 *
 */
public interface StudentBO {
	
	public StudentBE getStudentInfo(String studentId);
	
	public List<StudentBE> getStudentsInfo(String studentName);
	
	public StudentBE enrollStudent(StudentTO studentInfo);
	
	public MessageTO removeStudent(String studentID); 
	
}
