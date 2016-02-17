/**
 * 
 */
package com.employee.bo;

import java.util.List;

import com.common.BusinessResult;
import com.entities.EmployeeBE;

/**
 * @author Ashish
 */
public interface EmployeeBO {

    BusinessResult<EmployeeBE> getEmployeeInfo(String employeeId);

    List<EmployeeBE> getAllEmployees();

    BusinessResult<EmployeeBE> enrollEmployee(EmployeeBE employeeInfo, String userName, String password);

    EmployeeBE getAllEmployeeInfo(String employeeId);

}
