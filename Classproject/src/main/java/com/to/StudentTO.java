/**
 * 
 */
package com.to;

import java.util.Collection;

/**
 * @author Ashish
 */
public class StudentTO {

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

    private ClassBatchTO classBatchTO;

    private Collection<AttendanceTO> attendanceTOs;

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
     * @return the name
     */
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
     * @return the classBatchTO
     */
    public ClassBatchTO getClassBatchTO() {
        return classBatchTO;
    }

    /**
     * @param classBatchTO the classBatchTO to set
     */
    public void setClassBatchTO(ClassBatchTO classBatchTO) {
        this.classBatchTO = classBatchTO;
    }

    /**
     * @return the attendanceTOs
     */
    public Collection<AttendanceTO> getAttendanceTOs() {
        return attendanceTOs;
    }

    /**
     * @param attendanceTOs the attendanceTOs to set
     */
    public void setAttendanceTOs(Collection<AttendanceTO> attendanceTOs) {
        this.attendanceTOs = attendanceTOs;
    }

}
