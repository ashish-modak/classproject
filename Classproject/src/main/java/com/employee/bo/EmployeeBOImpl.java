/**
 * 
 */
package com.employee.bo;

import java.util.List;

import com.employee.dao.EmployeeDAO;
import com.entities.EmployeeBE;
import com.to.EmployeeTO;

/**
 * @author Ashish
 * 
 */
public class EmployeeBOImpl implements EmployeeBO {

	private EmployeeDAO employeeDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.employee.bo.EmployeeBO#getEmployeeInfo(java.lang.String)
	 */
	public EmployeeBE getEmployeeInfo(String employeeId) {
		return employeeDAO.getEmployeeInfo(employeeId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.employee.bo.EmployeeBO#getAllEmployees()
	 */
	public List<EmployeeBE> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}

	public EmployeeBE enrollEmployee(EmployeeTO employeeInfo) {
		return employeeDAO.enrollEmployee(employeeInfo);
	}

}
