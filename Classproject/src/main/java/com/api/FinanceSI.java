/**
 * 
 */
package com.api;

import java.util.List;

import com.to.EmployeeFinanceCTO;
import com.to.StudentFinanceCTO;

/**
 * @author Ashish
 */
public interface FinanceSI {

    EmployeeFinanceCTO getEmployeeFinanceInfo(String employeeID);

    StudentFinanceCTO getStudentFinanceInfo(String studentID);

    List<EmployeeFinanceCTO> getAllEmployeeFinanceInfo();

    List<StudentFinanceCTO> getAllStudentFinanceInfo();

    List<StudentFinanceCTO> getBatchFinanceInfo(String batchID);

}
