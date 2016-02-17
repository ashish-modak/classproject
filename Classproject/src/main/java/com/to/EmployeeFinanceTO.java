/**
 * 
 */
package com.to;

import java.util.Date;

/**
 * @author Ashish
 */
public class EmployeeFinanceTO {

    private Long id;

    private long amountPaid;

    private Date receivedDate;

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
     * @return the amountPaid
     */
    public long getAmountPaid() {
        return amountPaid;
    }

    /**
     * @param amountPaid the amountPaid to set
     */
    public void setAmountPaid(long amountPaid) {
        this.amountPaid = amountPaid;
    }

    /**
     * @return the receivedDate
     */
    public Date getReceivedDate() {
        return receivedDate;
    }

    /**
     * @param receivedDate the receivedDate to set
     */
    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

}
