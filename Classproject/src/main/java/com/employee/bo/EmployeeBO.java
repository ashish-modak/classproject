/**
 * 
 */
package com.employee.bo;

import java.util.List;

import com.entities.EmployeeBE;
import com.to.EmployeeTO;

/**
 * @author Ashish
 *
 */
public interface EmployeeBO {
	
	public EmployeeBE getEmployeeInfo(String employeeId);
	
	public List<EmployeeBE> getAllEmployees();
	
	public EmployeeBE enrollEmployee(EmployeeTO employeeInfo);

}
