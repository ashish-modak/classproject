/**
 * 
 */
package com.api;

import java.util.List;

import com.common.MessageTO;
import com.to.StudentTO;

/**
 * @author Ashish
 * 
 */
public interface StudentSI {

	/**
	 * Get Student Information for given StudentId.
	 * 
	 * @param studentId
	 * @return {@link StudentTO}
	 */
	public StudentTO getStudentInfo(String studentId);

	/**
	 * Get Student Information for given Student Name.
	 * 
	 * @param studentName
	 * @return List<StudentTO>
	 */
	public List<StudentTO> getStudentsInfo(String studentName);

	/**
	 * Create New Student.
	 * 
	 * @param studentInfo
	 * @return
	 */
	public StudentTO enrollStudent(StudentTO studentInfo);
	
	public MessageTO removeStudent(String studentID); 

}
