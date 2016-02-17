/**
 * 
 */
package com.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Ashish
 */
@Entity
@Table(name = "CCSD_EMPLOYEE")
public class EmployeeBE {

    private Long id;

    private String name;

    private String address;

    private String contactNumber;

    private Date joiningDate;

    private long salary;

    private UserBE user;

    private Collection<EmployeeFinanceBE> employeeFinances;

    /**
     * @return the id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMTB_ID", unique = true, nullable = false)
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
    @Column(name = "EMTB_NAME", nullable = false)
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
     * @return the address
     */
    @Column(name = "EMTB_ADDRESS")
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
     * @return the contactNumber
     */
    @Column(name = "EMTB_CONTACTNUMBER", nullable = false)
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * @param contactNumber the contactNumber to set
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * @return the joiningDate
     */
    @Temporal(TemporalType.DATE)
    @Column(name = "EMTB_JOININGDATE", nullable = false)
    public Date getJoiningDate() {
        return joiningDate;
    }

    /**
     * @param joiningDate the joiningDate to set
     */
    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    /**
     * @return the salary
     */
    @Column(name = "EMTB_SALARY", nullable = false)
    public long getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(long salary) {
        this.salary = salary;
    }

    /**
     * @return the user
     */
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "EMTB_USERID_FK", unique = true, nullable = false, updatable = false)
    public UserBE getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(UserBE user) {
        this.user = user;
    }

    /**
     * @return the employeeFinances
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    public Collection<EmployeeFinanceBE> getEmployeeFinances() {
        return employeeFinances;
    }

    /**
     * @param employeeFinances the employeeFinances to set
     */
    public void setEmployeeFinances(Collection<EmployeeFinanceBE> employeeFinances) {
        this.employeeFinances = employeeFinances;
    }

}
