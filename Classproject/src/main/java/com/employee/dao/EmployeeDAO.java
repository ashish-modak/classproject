/**
 * 
 */
package com.employee.dao;

import java.util.List;

import com.common.BusinessResult;
import com.entities.EmployeeBE;

/**
 * @author Ashish
 */
public interface EmployeeDAO {

    BusinessResult<EmployeeBE> getEmployeeInfo(Long employeeId);

    List<EmployeeBE> getAllEmployees();

    BusinessResult<EmployeeBE> enrollEmployee(EmployeeBE employeeInfo) throws Exception;

    EmployeeBE getAllEmployeeInfo(Long employeeId);

}
