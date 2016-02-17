/**
 * 
 */
package com.to;

import java.util.Date;

/**
 * @author amodak
 */
public class AttendanceTO {

    private long id;

    private Date absentDate;

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the absentDate
     */
    public Date getAbsentDate() {
        return absentDate;
    }

    /**
     * @param absentDate the absentDate to set
     */
    public void setAbsentDate(Date absentDate) {
        this.absentDate = absentDate;
    }

}
