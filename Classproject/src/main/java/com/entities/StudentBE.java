/**
 * 
 */
package com.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author Ashish
 */
@Entity
@Table(name = "CCSD_STUDENT", uniqueConstraints = @UniqueConstraint(columnNames = {
        "SDTB_NAME",
        "SDTB_STUDENTUSERNAME"}))
public class StudentBE {

    private Long id;

    private String name;

    private int age;

    private String address;

    private String schoolName;

    private Long contactNumber;

    private String parentName;

    private Long contactNumberParent;

    private Long consesation;

    private String otherInfo;

    private String studentUserName;

    private ClassBatchBE classBatch;

    private Collection<StudentFinanceBE> studentsFinances;

    private Collection<AttendanceBE> studentsAttendances;

    /**
     * @return the id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SDTB_ID", unique = true, nullable = false)
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
     * @return the name
     */
    @Column(name = "SDTB_NAME", nullable = false)
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    @Column(name = "SDTB_AGE", nullable = false)
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the address
     */
    @Column(name = "SDTB_ADDRESS")
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the schoolName
     */
    @Column(name = "SDTB_SCHOOLNAME")
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * @param schoolName the schoolName to set
     */
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    /**
     * @return the contactNumber
     */
    @Column(name = "SDTB_CONNUMBER", nullable = false)
    public Long getContactNumber() {
        return contactNumber;
    }

    /**
     * @param contactNumber the contactNumber to set
     */
    public void setContactNumber(Long contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * @return the parentName
     */
    @Column(name = "SDTB_PARENTNAME", nullable = false)
    public String getParentName() {
        return parentName;
    }

    /**
     * @param parentName the parentName to set
     */
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    /**
     * @return the contactNumberParent
     */
    @Column(name = "SDTB_CONPNUMBER", nullable = false)
    public Long getContactNumberParent() {
        return contactNumberParent;
    }

    /**
     * @param contactNumberParent the contactNumberParent to set
     */
    public void setContactNumberParent(Long contactNumberParent) {
        this.contactNumberParent = contactNumberParent;
    }

    /**
     * @return the consesation
     */
    @Column(name = "SDTB_CONSESATION")
    public Long getConsesation() {
        return consesation;
    }

    /**
     * @param consesation the consesation to set
     */
    public void setConsesation(Long consesation) {
        this.consesation = consesation;
    }

    /**
     * @return the otherInfo
     */
    @Column(name = "SDTB_OTHERINFO")
    public String getOtherInfo() {
        return otherInfo;
    }

    /**
     * @param otherInfo the otherInfo to set
     */
    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    /**
     * @return the studentUserName
     */
    @Column(name = "SDTB_STUDENTUSERNAME", nullable = false)
    public String getStudentUserName() {
        return studentUserName;
    }

    /**
     * @param studentUserName the studentUserName to set
     */
    public void setStudentUserName(String studentUserName) {
        this.studentUserName = studentUserName;
    }

    /**
     * @return the classBatch
     */
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "SDTB_CLASSBATCH_FK")
    public ClassBatchBE getClassBatch() {
        return classBatch;
    }

    /**
     * @param classBatch the classBatch to set
     */
    public void setClassBatch(ClassBatchBE classBatch) {
        this.classBatch = classBatch;
    }

    /**
     * @return the studentsFinances
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    public Collection<StudentFinanceBE> getStudentsFinances() {
        return studentsFinances;
    }

    /**
     * @param studentsFinances the studentsFinances to set
     */
    public void setStudentsFinances(Collection<StudentFinanceBE> studentsFinances) {
        this.studentsFinances = studentsFinances;
    }

    /**
     * @return the studentsAttendances
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student", fetch = FetchType.EAGER)
    public Collection<AttendanceBE> getStudentsAttendances() {
        return studentsAttendances;
    }

    /**
     * @param studentsAttendances the studentsAttendances to set
     */
    public void setStudentsAttendances(Collection<AttendanceBE> studentsAttendances) {
        this.studentsAttendances = studentsAttendances;
    }

}
