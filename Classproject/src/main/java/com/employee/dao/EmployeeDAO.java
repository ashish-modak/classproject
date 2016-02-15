/**
 * 
 */
package com.employee.dao;

import java.util.List;

import com.entities.EmployeeBE;
import com.to.EmployeeTO;

/**
 * @author Ashish
 * 
 */
public interface EmployeeDAO {

	public EmployeeBE getEmployeeInfo(String employeeId);

	public List<EmployeeBE> getAllEmployees();

	public EmployeeBE enrollEmployee(EmployeeTO employeeInfo);

}
