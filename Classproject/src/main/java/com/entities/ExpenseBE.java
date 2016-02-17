/**
 * 
 */
package com.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.common.ExpanseType;

/**
 * @author Ashish
 */
@Entity
@Table(name = "CCSD_EXPENSE")
public class ExpenseBE {

    private Long id;

    private ExpanseType expanseType;

    private long expenseAmount;

    private Date expenseDate;

    private String info;

    private UserBE user;

    /**
     * @return the id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EXTB_ID", unique = true, nullable = false)
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
     * @return the expanseType
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "EXTB_EXPENSETYPE", nullable = false)
    public ExpanseType getExpanseType() {
        return expanseType;
    }

    /**
     * @param expanseType the expanseType to set
     */
    public void setExpanseType(ExpanseType expanseType) {
        this.expanseType = expanseType;
    }

    /**
     * @return the expenseAmount
     */
    @Column(name = "EXTB_EXPENSEAMOUNT", nullable = false)
    public long getExpenseAmount() {
        return expenseAmount;
    }

    /**
     * @param expenseAmount the expenseAmount to set
     */
    public void setExpenseAmount(long expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    /**
     * @return the expenseDate
     */
    @Temporal(TemporalType.DATE)
    @Column(name = "EXTB_EXPENSEDATE", nullable = false)
    public Date getExpenseDate() {
        return expenseDate;
    }

    /**
     * @param expenseDate the expenseDate to set
     */
    public void setExpenseDate(Date expenseDate) {
        this.expenseDate = expenseDate;
    }

    /**
     * @return the info
     */
    @Column(name = "EXTB_EXPENSEINFO")
    public String getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * @return the user
     */
    @ManyToOne
    @JoinColumn(name = "SFTB_USERID_FK")
    public UserBE getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(UserBE user) {
        this.user = user;
    }

}
