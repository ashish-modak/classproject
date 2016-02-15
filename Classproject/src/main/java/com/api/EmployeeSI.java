/**
 * 
 */
package com.api;

import java.util.List;

import com.to.EmployeeTO;

/**
 * @author Ashish
 * 
 */
public interface EmployeeSI {

	public EmployeeTO getEmployeeInfo(String employeeId);

	public List<EmployeeTO> getAllEmployees();

	public EmployeeTO enrollEmployee(EmployeeTO employeeInfo);

}
