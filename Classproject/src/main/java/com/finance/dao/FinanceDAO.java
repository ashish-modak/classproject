/**
 * 
 */
package com.finance.dao;

import java.util.List;

import com.entities.EmployeeBE;
import com.entities.StudentBE;
import com.entities.StudentFinanceBE;

/**
 * @author amodak
 */
public interface FinanceDAO {

    EmployeeBE getEmployeeFinanceInfo(String employeeID);

    List<StudentFinanceBE> getStudentFinanceInfo(Long studentID);

    List<EmployeeBE> getAllEmployeeFinanceInfo();

    List<StudentBE> getAllStudentFinanceInfo();

    List<StudentBE> getBatchFinanceInfo(String batchID);

}
