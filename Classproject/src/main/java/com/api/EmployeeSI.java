/**
 * 
 */
package com.api;

import java.util.List;

import com.common.BusinessResult;
import com.to.EmployeeCTO;
import com.to.EmployeeTO;

/**
 * @author Ashish
 */
public interface EmployeeSI {

    BusinessResult<EmployeeTO> getEmployeeInfo(String employeeId);

    List<EmployeeTO> getAllEmployees();

    BusinessResult<EmployeeTO> enrollEmployee(EmployeeTO employeeInfo, String userName, String password);

    EmployeeCTO getAllEmployeeInfo(String employeeId);

}
