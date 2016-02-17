/**
 * 
 */
package com.to;

import java.util.List;

/**
 * @author amodak
 */
public class EmployeeFinanceCTO {

    private EmployeeTO employeeTO;

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
