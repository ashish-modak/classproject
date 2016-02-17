/**
 * 
 */
package com.student.bcf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.StudentSI;
import com.common.BatchStream;
import com.common.BusinessResult;
import com.common.MessageResult;
import com.entities.StudentBE;
import com.student.bo.StudentBO;
import com.to.StudentTO;

/**
 * @author Ashish
 */
@Service
public class StudentBCF implements StudentSI {

    @Autowired
    private StudentBO studentBo;

    /*
     * (non-Javadoc)
     * @see com.api.StudentSI#getStudentInfo(java.lang.String)
     */
    public BusinessResult<StudentTO> getStudentInfo(String studentId) {
        BusinessResult<StudentTO> businessResult;
        BusinessResult<StudentBE> studentResult = studentBo.getStudentInfo(studentId);
        if (studentResult.isValid()) {
            StudentTO studentTO = EntityTOConverter.convertStudentEntity(studentResult.getResult());
            businessResult = new BusinessResult<StudentTO>(studentTO);
        } else {
            businessResult = new BusinessResult<StudentTO>(null);
            businessResult.setValid(false);
            businessResult.addMessages(studentResult.getMessages());
        }
        return businessResult;
    }

    /*
     * (non-Javadoc)
     * @see com.api.StudentSI#getStudentsInfo(java.lang.String)
     */
    public List<StudentTO> getStudentsInfo(String studentName) {
        List<StudentBE> students = studentBo.getStudentsInfo(studentName);
        List<StudentTO> studentTOs = EntityTOConverter.convertStudentEntities(students);
        return studentTOs;
    }

    /*
     * (non-Javadoc)
     * @see com.api.StudentSI#enrollStudent(com.to.StudentTO)
     */
    public BusinessResult<StudentTO> enrollStudent(StudentTO studentInfo, String batchName, int batchStandard,
            BatchStream batchStream) {
        BusinessResult<StudentTO> businessResult;
        StudentBE student = EntityTOConverter.convertStudentTO(studentInfo);
        BusinessResult<StudentBE> studentResult =
                studentBo.enrollStudent(student, batchName, batchStandard, batchStream);
        if (studentResult.isValid()) {
            StudentTO studentTO = EntityTOConverter.convertStudentEntity(student);
            businessResult = new BusinessResult<StudentTO>(studentTO);
        } else {
            businessResult = new BusinessResult<StudentTO>(null);
            businessResult.setValid(false);
            businessResult.addMessages(studentResult.getMessages());
        }
        return businessResult;
    }

    public MessageResult removeStudent(String studentID) {
        return studentBo.removeStudent(studentID);
    }

}
