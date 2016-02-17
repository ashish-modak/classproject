/**
 * 
 */
package com.finance.bcf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.entities.StudentFinanceBE;
import com.to.StudentFinanceCTO;
import com.to.StudentFinanceTO;

/**
 * @author Ashish
 */
public class EntityTOConverter {

    public static StudentFinanceCTO converTOStudentFinanceCTO(List<StudentFinanceBE> studentFinanceBEs) {
        StudentFinanceCTO financeCTO = new StudentFinanceCTO();
        financeCTO.setStudentFinanceTOs(convertTOsStudentFinanceTO(studentFinanceBEs));
        return financeCTO;
    }

    public static StudentFinanceTO convertTOStudentFinanceTO(StudentFinanceBE studentFinanceBE) {
        StudentFinanceTO studentFinanceTO = new StudentFinanceTO();
        studentFinanceTO.setId(studentFinanceBE.getId());
        studentFinanceTO.setAmount(studentFinanceBE.getAmount());
        studentFinanceTO.setReceivedDate(studentFinanceBE.getReceivedDate());
        studentFinanceTO.setReceivingName(studentFinanceBE.getReceivingName());
        return studentFinanceTO;
    }

    public static List<StudentFinanceTO>
            convertTOsStudentFinanceTO(Collection<StudentFinanceBE> studentFinanceBEs) {
        List<StudentFinanceTO> financeTOs = new ArrayList<StudentFinanceTO>();
        for (StudentFinanceBE studentFinanceBE : studentFinanceBEs) {
            financeTOs.add(convertTOStudentFinanceTO(studentFinanceBE));
        }
        return financeTOs;
    }

}
