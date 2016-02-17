/**
 * 
 */
package com.employee.bcf;

import java.util.ArrayList;
import java.util.List;

import com.entities.EmployeeBE;
import com.to.EmployeeCTO;
import com.to.EmployeeTO;

/**
 * @author Ashish
 */
public class EntityTOConverter {

    public static EmployeeTO convertEmployeeEntity(EmployeeBE employee) {
        EmployeeTO employeeTO = new EmployeeTO();
        employeeTO.setId(employee.getId());
        employeeTO.setName(employee.getName());
        employeeTO.setContactNumber(employee.getContactNumber());
        employeeTO.setAddress(employee.getAddress());
        employeeTO.setJoiningDate(employee.getJoiningDate());
        employeeTO.setSalary(employee.getSalary());
        return employeeTO;
    }

    public static List<EmployeeTO> convertEmployeeEntities(List<EmployeeBE> employees) {
        List<EmployeeTO> employeeTOs = new ArrayList<EmployeeTO>();
        for (EmployeeBE employee : employees) {
            employeeTOs.add(convertEmployeeEntity(employee));
        }
        return employeeTOs;
    }

    public static EmployeeBE convertEmployeeTO(EmployeeTO employeeTO) {
        EmployeeBE employeeBE = new EmployeeBE();
        employeeBE.setAddress(employeeTO.getAddress());
        employeeBE.setContactNumber(employeeTO.getAddress());
        employeeBE.setSalary(employeeTO.getSalary());
        employeeBE.setJoiningDate(employeeTO.getJoiningDate());
        employeeBE.setName(employeeTO.getName());
        return employeeBE;
    }

    public static EmployeeCTO convertTOEmployeeCTO(EmployeeBE employeeBE) {
        EmployeeCTO employeeCTO = new EmployeeCTO();
        employeeCTO.setEmployeeTO(convertEmployeeEntity(employeeBE));
        // employeeCTO.setEmployeeFinanceTOs(employeeFinanceTOs)
        employeeCTO.setUserTO(com.user.bcf.EntityTOConverter.convertUserEntity(employeeBE.getUser()));
        return employeeCTO;
    }
}
