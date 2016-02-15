/**
 * 
 */
package com.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Ashish
 * 
 */
@Entity
@Table(name = "CCSD_STUDENTFINANCE")
public class StudentFinanceBE {

	private long id;

	private long amount;

	private Date receivedDate;

	private long userId;

	private StudentBE student;

	/**
	 * @return the id
	 */
	@Id
	@SequenceGenerator(name = "SFTBSEQ", sequenceName = "CCSD_STUDENTFINANCE_SEQ", allocationSize = 50, initialValue = 5000)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SFTBSEQ")
	@Column(name = "SFTB_ID", unique = true, nullable = false)
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
	 * @return the amount
	 */
	@Column(name = "SFTB_AMOUNT")
	public long getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(long amount) {
		this.amount = amount;
	}

	/**
	 * @return the receivedDate
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "SFTB_FRCEIVEDDATE")
	public Date getReceivedDate() {
		return receivedDate;
	}

	/**
	 * @param receivedDate
	 *            the receivedDate to set
	 */
	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	/**
	 * @return the userId
	 */
	@Column(name = "SFTB_USERID_FK")
	public long getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}

	/**
	 * @return the student
	 */
	@ManyToOne
	@JoinColumn(name = "SFTB_STUDENTID_FK")
	public StudentBE getStudent() {
		return student;
	}

	/**
	 * @param student
	 *            the student to set
	 */
	public void setStudent(StudentBE student) {
		this.student = student;
	}

}
