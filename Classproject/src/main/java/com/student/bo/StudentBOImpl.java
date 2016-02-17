/**
 * 
 */
package com.student.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.batch.dao.BatchDAO;
import com.common.BatchStream;
import com.common.BusinessResult;
import com.common.MessageID;
import com.common.MessageResult;
import com.common.MessageTO;
import com.entities.ClassBatchBE;
import com.entities.StudentBE;
import com.student.dao.StudentDAO;

/**
 * @author Ashish
 */
@Component
public class StudentBOImpl implements StudentBO {

    @Autowired
    private StudentDAO studentDAO;

    @Autowired
    private BatchDAO batchDAO;

    /*
     * (non-Javadoc)
     * @see com.student.bo.StudentBO#getStudentInfo(java.lang.String)
     */
    public BusinessResult<StudentBE> getStudentInfo(String studentId) {
        Long id = Long.parseLong(studentId);
        return studentDAO.getStudentInfo(id);
    }

    /*
     * (non-Javadoc)
     * @see com.student.bo.StudentBO#getStudentsInfo(java.lang.String)
     */
    public List<StudentBE> getStudentsInfo(String studentName) {
        return studentDAO.getStudentsInfo(studentName);
    }

    /*
     * (non-Javadoc)
     * @see com.student.bo.StudentBO#enrollStudent(com.to.StudentTO)
     */
    public BusinessResult<StudentBE> enrollStudent(StudentBE studentInfo, String batchName, int batchStandard,
            BatchStream batchStream) {
        BusinessResult<StudentBE> businessResult;
        ClassBatchBE classBatchBE = batchDAO.getBatchInformation(batchName, batchStandard, batchStream);
        studentInfo.setClassBatch(classBatchBE);
        try {
            businessResult = studentDAO.enrollStudent(studentInfo);
        } catch (Exception e) {
            businessResult = new BusinessResult<StudentBE>(null);
            MessageTO ml = new MessageTO();
            ml.setMessageID(MessageID.M3);
            ml.setMessage(e.getCause().getMessage());
            businessResult.setValid(false);
            businessResult.addMessage(ml);
        }
        return businessResult;
    }

    public MessageResult removeStudent(String studentID) {
        Long id = Long.parseLong(studentID);
        return studentDAO.removeStudent(id);
    }

}
