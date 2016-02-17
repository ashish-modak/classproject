/**
 * 
 */
package com.student.dao;

import java.util.List;

import com.common.BusinessResult;
import com.common.MessageResult;
import com.entities.StudentBE;

/**
 * @author Ashish
 */
public interface StudentDAO {

    public BusinessResult<StudentBE> getStudentInfo(Long studentId);

    public List<StudentBE> getStudentsInfo(String studentName);

    public BusinessResult<StudentBE> enrollStudent(StudentBE studentInfo) throws Exception;

    public MessageResult removeStudent(Long studentID);

}
