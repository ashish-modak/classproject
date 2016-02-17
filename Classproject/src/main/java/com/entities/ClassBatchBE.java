/**
 * 
 */
package com.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.common.BatchStream;

/**
 * @author Ashish
 */
@Entity
@Table(name = "CCSD_CLASSBATCH", uniqueConstraints = @UniqueConstraint(columnNames = {
        "CBTB_BATCHNAME",
        "CBTB_BATCHSTD",
        "CBTB_BATCHSTREAM"}))
public class ClassBatchBE {

    private Long id;

    private String batchName;

    private int batchStandard;

    private BatchStream batchStream;

    private long batchFee;

    private Collection<StudentBE> students;

    /**
     * @return the id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CBTB_ID", unique = true, nullable = false)
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
     * @return the batchName
     */
    @Column(name = "CBTB_BATCHNAME", nullable = false)
    public String getBatchName() {
        return batchName;
    }

    /**
     * @param batchName the batchName to set
     */
    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    /**
     * @return the batchStandard
     */
    @Column(name = "CBTB_BATCHSTD", nullable = false)
    public int getBatchStandard() {
        return batchStandard;
    }

    /**
     * @param batchStandard the batchStandard to set
     */
    public void setBatchStandard(int batchStandard) {
        this.batchStandard = batchStandard;
    }

    /**
     * @return the batchFee
     */
    @Column(name = "CBTB_BATCHFEE", nullable = false)
    public long getBatchFee() {
        return batchFee;
    }

    /**
     * @param batchFee the batchFee to set
     */
    public void setBatchFee(long batchFee) {
        this.batchFee = batchFee;
    }

    /**
     * @return the batchStream
     */
    @Column(name = "CBTB_BATCHSTREAM", nullable = false)
    @Enumerated(EnumType.STRING)
    public BatchStream getBatchStream() {
        return batchStream;
    }

    /**
     * @param batchStream the batchStream to set
     */
    public void setBatchStream(BatchStream batchStream) {
        this.batchStream = batchStream;
    }

    /**
     * @return the students
     */
    @OneToMany(mappedBy = "classBatch")
    public Collection<StudentBE> getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(Collection<StudentBE> students) {
        this.students = students;
    }

}
