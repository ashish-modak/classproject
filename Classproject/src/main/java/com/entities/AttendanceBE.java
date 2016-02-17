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
import javax.persistence.UniqueConstraint;

/**
 * @author amodak
 */
@Entity
@Table(name = "CCSD_ATTENDANCE",uniqueConstraints = @UniqueConstraint(columnNames = {
        "STAT_ABSENTDATE",
        "STAT_STUDENTID_FK"}))
public class AttendanceBE {

    private Long id;

    private Date absentDate;

    private StudentBE student;

    /**
     * @return the id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STAT_ID", unique = true, nullable = false)
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
     * @return the absentDate
     */
    @Temporal(TemporalType.DATE)
    @Column(name = "STAT_ABSENTDATE", nullable = false)
    public Date getAbsentDate() {
        return absentDate;
    }

    /**
     * @param absentDate the absentDate to set
     */
    public void setAbsentDate(Date absentDate) {
        this.absentDate = absentDate;
    }

    /**
     * @return the student
     */
    @ManyToOne
    @JoinColumn(name = "STAT_STUDENTID_FK")
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
