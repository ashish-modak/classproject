/**
 * 
 */
package com.finance.bcf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.FinanceSI;
import com.entities.StudentFinanceBE;
import com.finance.bo.FinanceBO;
import com.to.EmployeeFinanceCTO;
import com.to.StudentFinanceCTO;

/**
 * @author amodak
 */
@Service
public class FinanceBCF implements FinanceSI {

    @Autowired
    FinanceBO finenceBO;

    /*
     * (non-Javadoc)
     * @see com.api.FinenceSI#getEmployeeFinanceInfo(java.lang.String)
     */
    public EmployeeFinanceCTO getEmployeeFinanceInfo(String employeeID) {
        return null;
    }

    /*
     * (non-Javadoc)
     * @see com.api.FinenceSI#getStudentFinanceInfo(java.lang.String)
     */
    public StudentFinanceCTO getStudentFinanceInfo(String studentID) {
    	List<StudentFinanceBE> studentFinanceBEs = finenceBO.getStudentFinanceInfo(studentID);
        return EntityTOConverter.converTOStudentFinanceCTO(studentFinanceBEs);
    }

    /*
     * (non-Javadoc)
     * @see com.api.FinenceSI#getAllEmployeeFinanceInfo()
     */
    public List<EmployeeFinanceCTO> getAllEmployeeFinanceInfo() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * @see com.api.FinenceSI#getAllStudentFinanceInfo()
     */
    public List<StudentFinanceCTO> getAllStudentFinanceInfo() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * @see com.api.FinenceSI#getBatchFinanceInfo(java.lang.String)
     */
    public List<StudentFinanceCTO> getBatchFinanceInfo(String batchID) {
        // TODO Auto-generated method stub
        return null;
    }

}
