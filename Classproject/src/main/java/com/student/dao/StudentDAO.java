/**
 * 
 */
package com.student.dao;

import java.util.List;

import com.common.MessageTO;
import com.entities.StudentBE;
import com.to.StudentTO;

/**
 * @author Ashish
 *
 */
public interface StudentDAO {
	
	public StudentBE getStudentInfo(String studentId);
	
	public List<StudentBE> getStudentsInfo(String studentName);
	
	public StudentBE enrollStudent(StudentTO studentInfo);
	
	public MessageTO removeStudent(Long studentID); 
	
}
