/**
 * 
 */
package com.finance.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.entities.EmployeeBE;
import com.entities.StudentBE;
import com.entities.StudentFinanceBE;

/**
 * @author amodak
 */
@Repository
public class FinanceDAOImpl implements FinanceDAO {

    @PersistenceContext
    EntityManager entityManager;

    /*
     * (non-Javadoc)
     * @see com.finence.dao.FinenceDAO#getEmployeeFinanceInfo(java.lang.String)
     */
    public EmployeeBE getEmployeeFinanceInfo(String employeeID) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * @see com.finence.dao.FinenceDAO#getStudentFinanceInfo(java.lang.String)
     */
    public List<StudentFinanceBE> getStudentFinanceInfo(Long studentID) {
        final TypedQuery<StudentFinanceBE> query =
                entityManager.createQuery(
                        "select sf from StudentFinanceBE sf where sf.student.id=:studentID",
                        StudentFinanceBE.class);
        query.setParameter("studentID", studentID);
        return query.getResultList();
    }

    /*
     * (non-Javadoc)
     * @see com.finence.dao.FinenceDAO#getAllEmployeeFinanceInfo()
     */
    public List<EmployeeBE> getAllEmployeeFinanceInfo() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * @see com.finence.dao.FinenceDAO#getAllStudentFinanceInfo()
     */
    public List<StudentBE> getAllStudentFinanceInfo() {

        return null;
    }

    /*
     * (non-Javadoc)
     * @see com.finence.dao.FinenceDAO#getBatchFinanceInfo(java.lang.String)
     */
    public List<StudentBE> getBatchFinanceInfo(String batchID) {
        // TODO Auto-generated method stub
        return null;
    }

}
