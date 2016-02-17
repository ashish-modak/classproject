/**
 * 
 */
package com.to;

import java.util.List;

/**
 * @author amodak
 */
public class EmployeeCTO {

    private EmployeeTO employeeTO;

    private UserTO userTO;

    private List<EmployeeFinanceTO> employeeFinanceTOs;

    /**
     * @return the employeeTO
     */
    public EmployeeTO getEmployeeTO() {
        return employeeTO;
    }

    /**
     * @param employeeTO the employeeTO to set
     */
    public void setEmployeeTO(EmployeeTO employeeTO) {
        this.employeeTO = employeeTO;
    }

    /**
     * @return the userTO
     */
    public UserTO getUserTO() {
        return userTO;
    }

    /**
     * @param userTO the userTO to set
     */
    public void setUserTO(UserTO userTO) {
        this.userTO = userTO;
    }

    /**
     * @return the employeeFinanceTOs
     */
    public List<EmployeeFinanceTO> getEmployeeFinanceTOs() {
        return employeeFinanceTOs;
    }

    /**
     * @param employeeFinanceTOs the employeeFinanceTOs to set
     */
    public void setEmployeeFinanceTOs(List<EmployeeFinanceTO> employeeFinanceTOs) {
        this.employeeFinanceTOs = employeeFinanceTOs;
    }

}
