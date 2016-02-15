/**
 * 
 */
package com.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.common.Role;

/**
 * @author Ashish
 * 
 */
@Entity
@Table(name = "CCSD_USER")
public class UserBE {

	private long id;

	private String userName;

	private String userPassword;

	private Role userRole;

	private EmployeeBE employee;
	
	private Collection<ExpenseBE> expenses;

	/**
	 * @return the id
	 */
	@Id
	@SequenceGenerator(name = "USTBSEQ", sequenceName = "CCSD_USER_SEQ", allocationSize = 50, initialValue = 5000)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USTBSEQ")
	@Column(name = "USTB_ID", unique = true, nullable = false)
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the userName
	 */
	@Column(name = "USTB_USERNAME")
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userPassword
	 */
	@Column(name = "USTB_USERPASSWORD")
	public String getUserPassword() {
		return userPassword;
	}

	/**
	 * @param userPassword
	 *            the userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	/**
	 * @return the userRole
	 */
	@Enumerated(EnumType.STRING)
	@Column(name = "USTB_USERROLE")
	public Role getUserRole() {
		return userRole;
	}

	/**
	 * @param userRole
	 *            the userRole to set
	 */
	public void setUserRole(Role userRole) {
		this.userRole = userRole;
	}

	/**
	 * @return the employee
	 */
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "user")
	public EmployeeBE getEmployee() {
		return employee;
	}

	/**
	 * @param employee
	 *            the employee to set
	 */
	public void setEmployee(EmployeeBE employee) {
		this.employee = employee;
	}

	/**
	 * @return the expenses
	 */
	@OneToMany(mappedBy = "user")
	public Collection<ExpenseBE> getExpenses() {
		return expenses;
	}

	/**
	 * @param expenses the expenses to set
	 */
	public void setExpenses(Collection<ExpenseBE> expenses) {
		this.expenses = expenses;
	}
	
	

}
