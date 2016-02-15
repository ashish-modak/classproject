/**
 * 
 */
package com.api;

import java.util.List;

import com.to.EmployeeFinanceTO;
import com.to.StudentFinanceTO;

/**
 * @author Ashish
 *
 */
public interface Finence {
	
	public List<EmployeeFinanceTO> getEmployeeFinanceInfo(String employeeID);
	
	public List<StudentFinanceTO> getStudentFinanceInfo(String studentID);
	
	public List<EmployeeFinanceTO> getAllEmployeeFinanceInfo();
	
	public List<StudentFinanceTO> getAllStudentFinanceInfo();
	
	public List<StudentFinanceTO> getBatchFinanceInfo(String batchID);

}
