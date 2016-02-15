package com.employee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.entities.EmployeeBE;
import com.to.EmployeeTO;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@PersistenceContext
	EntityManager entityManager; 

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.employee.dao.EmployeeDAO#getEmployeeInfo(java.lang.String)
	 */
	public EmployeeBE getEmployeeInfo(String employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.employee.dao.EmployeeDAO#getAllEmployees()
	 */
	public List<EmployeeBE> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	public EmployeeBE enrollEmployee(EmployeeTO employeeInfo) {
		entityManager.persist(new EmployeeBE());
		return null;
	}

}
