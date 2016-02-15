/**
 * 
 */
package com.employee.bcf;

import java.util.ArrayList;
import java.util.List;

import com.entities.EmployeeBE;
import com.to.EmployeeTO;

/**
 * @author Ashish
 * 
 */
public class EntityTOConverter {

	public static EmployeeTO convertStudentEntity(EmployeeBE employee) {

		return new EmployeeTO();
	}

	public static List<EmployeeTO> convertStudentEntities(
			List<EmployeeBE> employees) {
		List<EmployeeTO> employeeTOs = new ArrayList<EmployeeTO>();
		for (EmployeeBE employee : employees) {
			employeeTOs.add(convertStudentEntity(employee));
		}
		return employeeTOs;
	}
}
