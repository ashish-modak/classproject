/**
 * 
 */
package com.employee.bcf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.EmployeeSI;
import com.common.BusinessResult;
import com.employee.bo.EmployeeBO;
import com.entities.EmployeeBE;
import com.to.EmployeeCTO;
import com.to.EmployeeTO;

/**
 * @author Ashish
 */
@Service
public class EmployeeBCF implements EmployeeSI {

    @Autowired
    EmployeeBO employeeBO;

    /*
     * (non-Javadoc)
     * @see com.api.EmployeeSI#getEmployeeInfo(java.lang.String)
     */
    public BusinessResult<EmployeeTO> getEmployeeInfo(String employeeId) {
        BusinessResult<EmployeeTO> businessResult;
        BusinessResult<EmployeeBE> employeeResult = employeeBO.getEmployeeInfo(employeeId);
        if (employeeResult.isValid()) {
            businessResult =
                    new BusinessResult<EmployeeTO>(EntityTOConverter.convertEmployeeEntity(employeeResult
                            .getResult()));
        } else {
            businessResult = new BusinessResult<EmployeeTO>(null);
            businessResult.setValid(false);
            businessResult.addMessages(employeeResult.getMessages());
        }
        return businessResult;
    }

    /*
     * (non-Javadoc)
     * @see com.api.EmployeeSI#getAllEmployees()
     */
    public List<EmployeeTO> getAllEmployees() {
        List<EmployeeBE> employees = employeeBO.getAllEmployees();
        return EntityTOConverter.convertEmployeeEntities(employees);
    }

    public BusinessResult<EmployeeTO> enrollEmployee(EmployeeTO employeeInfo, String userName, String password) {
        BusinessResult<EmployeeTO> businessResult;
        BusinessResult<EmployeeBE> employeeResult =
                employeeBO.enrollEmployee(EntityTOConverter.convertEmployeeTO(employeeInfo), userName, password);
        if (employeeResult.isValid()) {
            businessResult =
                    new BusinessResult<EmployeeTO>(EntityTOConverter.convertEmployeeEntity(employeeResult
                            .getResult()));
        } else {
            businessResult = new BusinessResult<EmployeeTO>(null);
            businessResult.setValid(false);
            businessResult.setMessages(employeeResult.getMessages());
        }
        return businessResult;
    }

    public EmployeeCTO getAllEmployeeInfo(String employeeId) {
        EmployeeBE employee = employeeBO.getAllEmployeeInfo(employeeId);
        return EntityTOConverter.convertTOEmployeeCTO(employee);
    }

}
