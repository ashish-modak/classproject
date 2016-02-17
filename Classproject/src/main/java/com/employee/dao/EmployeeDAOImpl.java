package com.employee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.common.BusinessResult;
import com.common.MessageID;
import com.common.MessageTO;
import com.entities.EmployeeBE;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @PersistenceContext
    EntityManager entityManager;

    /*
     * (non-Javadoc)
     * @see com.employee.dao.EmployeeDAO#getEmployeeInfo(java.lang.String)
     */
    @Transactional
    public BusinessResult<EmployeeBE> getEmployeeInfo(Long employeeId) {
        BusinessResult<EmployeeBE> businessResult;
        final TypedQuery<EmployeeBE> query =
                entityManager.createQuery("SELECT emp from EmployeeBE emp where emp.id=:empID", EmployeeBE.class);
        query.setParameter("empID", employeeId);
        try {
            EmployeeBE employeeBE = query.getSingleResult();
            businessResult = new BusinessResult<EmployeeBE>(employeeBE);
        } catch (NoResultException e) {
            businessResult = new BusinessResult<EmployeeBE>(null);
            businessResult.setValid(false);
            MessageTO ml = new MessageTO();
            ml.setMessageID(MessageID.M4);
            ml.setMessage("No Result Found For Employee With EmployeeID : " + employeeId);
            businessResult.addMessage(ml);
        }
        return businessResult;
    }

    /*
     * (non-Javadoc)
     * @see com.employee.dao.EmployeeDAO#getAllEmployees()
     */
    @Transactional
    public List<EmployeeBE> getAllEmployees() {
        final TypedQuery<EmployeeBE> query =
                entityManager.createQuery("SELECT emp from EmployeeBE emp", EmployeeBE.class);
        return query.getResultList();
    }

    @Transactional
    public BusinessResult<EmployeeBE> enrollEmployee(EmployeeBE employeeInfo) throws Exception {
        BusinessResult<EmployeeBE> businessResult;
        entityManager.persist(employeeInfo);
        businessResult = new BusinessResult<EmployeeBE>(employeeInfo);
        return businessResult;
    }

    public EmployeeBE getAllEmployeeInfo(Long employeeId) {
        final TypedQuery<EmployeeBE> query =
                entityManager.createQuery(
                        "SELECT emp from EmployeeBE emp join fetch emp.employeeFinances where emp.id=:empID",
                        EmployeeBE.class);
        query.setParameter("empID", employeeId);
        return query.getSingleResult();
    }

}
