/**
 * 
 */
package com.to;

import java.util.Date;

import com.common.ExpanseType;

/**
 * @author Ashish
 */
public class ExpenseTO {

    private Long id;

    private ExpanseType expanseType;

    private long expenseAmount;

    private Date expenseDate;

    private String info;

    /**
     * @return the id
     */
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
    public String getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(String info) {
        this.info = info;
    }

}
