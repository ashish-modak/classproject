/**
 * 
 */
package com.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Ashish
 * 
 */
@Entity
@Table(name = "CCSD_EMPLOYEE")
public class EmployeeBE {

	private long id;

	private String name;

	private String address;

	private String contactNumber;

	private Date joiningDate;

	private long salary;

	private UserBE user;

	private Collection<EmployeeFinanceBE> employeeFinances;

	/**
	 * @return the id
	 */
	@Id
	@SequenceGenerator(name = "EMTBSEQ", sequenceName = "CCSD_EMPLOYEE_SEQ", allocationSize = 50, initialValue = 5000)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMTBSEQ")
	@Column(name = "EMTB_ID", unique = true, nullable = false)
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
	 * @return the name
	 */
	@Column(name = "EMTB_NAME")
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	@Column(name = "EMTB_ADDRESS")
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the contactNumber
	 */
	@Column(name = "EMTB_CONTACTNUMBER")
	public String getContactNumber() {
		return contactNumber;
	}

	/**
	 * @param contactNumber
	 *            the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	/**
	 * @return the joiningDate
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "EMTB_JOININGDATE")
	public Date getJoiningDate() {
		return joiningDate;
	}

	/**
	 * @param joiningDate
	 *            the joiningDate to set
	 */
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	/**
	 * @return the salary
	 */
	@Column(name = "EMTB_SALARY")
	public long getSalary() {
		return salary;
	}

	/**
	 * @param salary
	 *            the salary to set
	 */
	public void setSalary(long salary) {
		this.salary = salary;
	}

	/**
	 * @return the user
	 */
	@OneToOne(fetch = FetchType.EAGER)
	@PrimaryKeyJoinColumn(name = "EMTB_USERID")
	public UserBE getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(UserBE user) {
		this.user = user;
	}

	/**
	 * @return the employeeFinances
	 */
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
	public Collection<EmployeeFinanceBE> getEmployeeFinances() {
		return employeeFinances;
	}

	/**
	 * @param employeeFinances
	 *            the employeeFinances to set
	 */
	public void setEmployeeFinances(Collection<EmployeeFinanceBE> employeeFinances) {
		this.employeeFinances = employeeFinances;
	}

}
