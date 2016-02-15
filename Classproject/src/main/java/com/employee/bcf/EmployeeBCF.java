/**
 * 
 */
package com.employee.bcf;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.EmployeeSI;
import com.employee.bo.EmployeeBO;
import com.entities.EmployeeBE;
import com.to.EmployeeTO;

/**
 * @author Ashish
 * 
 */
@Service
public class EmployeeBCF implements EmployeeSI {

	private EmployeeBO employeeBO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.api.EmployeeSI#getEmployeeInfo(java.lang.String)
	 */
	public EmployeeTO getEmployeeInfo(String employeeId) {
		EmployeeBE employee = employeeBO.getEmployeeInfo(employeeId);
		return EntityTOConverter.convertStudentEntity(employee);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.api.EmployeeSI#getAllEmployees()
	 */
	public List<EmployeeTO> getAllEmployees() {
		List<EmployeeBE> employees = employeeBO.getAllEmployees();
		return EntityTOConverter.convertStudentEntities(employees);
	}

	public EmployeeTO enrollEmployee(EmployeeTO employeeInfo) {
		EmployeeBE employee = employeeBO.enrollEmployee(employeeInfo);
		return EntityTOConverter.convertStudentEntity(employee);
	}

}
