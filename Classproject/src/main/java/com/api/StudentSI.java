/**
 * 
 */
package com.api;

import java.util.List;

import com.common.BatchStream;
import com.common.BusinessResult;
import com.common.MessageResult;
import com.to.StudentTO;

/**
 * @author Ashish
 */
public interface StudentSI {

    /**
     * Get Student Information for given StudentId.
     * 
     * @param studentId
     * @return {@link StudentTO}
     */
    public BusinessResult<StudentTO> getStudentInfo(String studentId);

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
    public BusinessResult<StudentTO> enrollStudent(StudentTO studentInfo, String batchName, int batchStandard,
            BatchStream batchStream);

    public MessageResult removeStudent(String studentID);

}
