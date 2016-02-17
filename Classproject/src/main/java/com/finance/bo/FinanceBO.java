/**
 * 
 */
package com.finance.bo;

import java.util.List;

import com.entities.EmployeeBE;
import com.entities.StudentBE;
import com.entities.StudentFinanceBE;

/**
 * @author amodak
 */
public interface FinanceBO {

    EmployeeBE getEmployeeFinanceInfo(String employeeID);

    List<StudentFinanceBE> getStudentFinanceInfo(String studentID);

    List<EmployeeBE> getAllEmployeeFinanceInfo();

    List<StudentBE> getAllStudentFinanceInfo();

    List<StudentBE> getBatchFinanceInfo(String batchID);

}
