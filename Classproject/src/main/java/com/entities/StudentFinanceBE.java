/**
 * 
 */
package com.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Ashish
 */
@Entity
@Table(name = "CCSD_STUDENTFINANCE")
public class StudentFinanceBE {

    private Long id;

    private long amount;

    private Date receivedDate;

    private String receivingName;

    private StudentBE student;

    /**
     * @return the id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SFTB_ID", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the amount
     */
    @Column(name = "SFTB_AMOUNT", nullable = false)
    public long getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(long amount) {
        this.amount = amount;
    }

    /**
     * @return the receivedDate
     */
    @Temporal(TemporalType.DATE)
    @Column(name = "SFTB_FRCEIVEDDATE", nullable = false)
    public Date getReceivedDate() {
        return receivedDate;
    }

    /**
     * @param receivedDate the receivedDate to set
     */
    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    @Column(name = "SFTB_RECEIVINGNAME", nullable = false)
    public String getReceivingName() {
		return receivingName;
	}

	public void setReceivingName(String receivingName) {
		this.receivingName = receivingName;
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
     * @param student the student to set
     */
    public void setStudent(StudentBE student) {
        this.student = student;
    }

}
