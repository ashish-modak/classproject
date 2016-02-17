/**
 * 
 */
package com.to;

import java.util.List;

/**
 * @author amodak
 */
public class StudentFinanceCTO {

    private StudentTO studentTO;

    private List<StudentFinanceTO> studentFinanceTOs;

    /**
     * @return the studentTO
     */
    public StudentTO getStudentTO() {
        return studentTO;
    }

    /**
     * @param studentTO the studentTO to set
     */
    public void setStudentTO(StudentTO studentTO) {
        this.studentTO = studentTO;
    }

    /**
     * @return the studentFinanceTOs
     */
    public List<StudentFinanceTO> getStudentFinanceTOs() {
        return studentFinanceTOs;
    }

    /**
     * @param studentFinanceTOs the studentFinanceTOs to set
     */
    public void setStudentFinanceTOs(List<StudentFinanceTO> studentFinanceTOs) {
        this.studentFinanceTOs = studentFinanceTOs;
    }

}
