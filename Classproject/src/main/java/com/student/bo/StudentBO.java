/**
 * 
 */
package com.student.bo;

import java.util.List;

import com.common.BatchStream;
import com.common.BusinessResult;
import com.common.MessageResult;
import com.entities.StudentBE;

/**
 * @author Ashish
 */
public interface StudentBO {

    public BusinessResult<StudentBE> getStudentInfo(String studentId);

    public List<StudentBE> getStudentsInfo(String studentName);

    public BusinessResult<StudentBE> enrollStudent(StudentBE studentInfo, String batchName, int batchStandard,
            BatchStream batchStream);

    public MessageResult removeStudent(String studentID);

}
