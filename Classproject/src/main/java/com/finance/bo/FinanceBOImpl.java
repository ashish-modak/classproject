/**
 * 
 */
package com.finance.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.EmployeeBE;
import com.entities.StudentBE;
import com.entities.StudentFinanceBE;
import com.finance.dao.FinanceDAO;

/**
 * @author amodak
 */
@Service
public class FinanceBOImpl implements FinanceBO {

    @Autowired
    FinanceDAO finenceDAO;

    /*
     * (non-Javadoc)
     * @see com.finence.bo.FinenceBO#getEmployeeFinanceInfo(java.lang.String)
     */
    public EmployeeBE getEmployeeFinanceInfo(String employeeID) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * @see com.finence.bo.FinenceBO#getStudentFinanceInfo(java.lang.String)
     */
    public List<StudentFinanceBE> getStudentFinanceInfo(String studentID) {
        Long id = Long.parseLong(studentID);
        return finenceDAO.getStudentFinanceInfo(id);
    }

    /*
     * (non-Javadoc)
     * @see com.finence.bo.FinenceBO#getAllEmployeeFinanceInfo()
     */
    public List<EmployeeBE> getAllEmployeeFinanceInfo() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * @see com.finence.bo.FinenceBO#getAllStudentFinanceInfo()
     */
    public List<StudentBE> getAllStudentFinanceInfo() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * @see com.finence.bo.FinenceBO#getBatchFinanceInfo(java.lang.String)
     */
    public List<StudentBE> getBatchFinanceInfo(String batchID) {
        // TODO Auto-generated method stub
        return null;
    }

}
