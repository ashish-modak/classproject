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
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Ashish
 * 
 */
@Entity
@Table(name = "CCSD_STUDENT")
public class StudentBE {


	private long id;

	private String name;

	private int age;

	private String address;

	private String schoolName;

	private int contactNumber;

	private String parentName;

	private int contactNumberParent;

	private Long consesation;

	private String otherInfo;

	private ClassBatchBE classBatch;

	private Collection<StudentFinanceBE> studentsFinances;

	/**
	 * @return the id
	 */
	@Id
	@SequenceGenerator(name = "SDTBSEQ", sequenceName = "CCSD_STUDENT_SEQ", allocationSize = 50, initialValue = 5000)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SDTBSEQ")
	@Column(name = "SDTB_ID", unique = true, nullable = false)
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	@Column(name = "SDTB_NAME")
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	@Column(name = "SDTB_AGE")
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
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
	 * @param address
	 *            the address to set
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
	 * @param schoolName
	 *            the schoolName to set
	 */
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	/**
	 * @return the contactNumber
	 */
	@Column(name = "SDTB_CONNUMBER")
	public int getContactNumber() {
		return contactNumber;
	}

	/**
	 * @param contactNumber
	 *            the contactNumber to set
	 */
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	/**
	 * @return the parentName
	 */
	@Column(name = "SDTB_PARENTNAME")
	public String getParentName() {
		return parentName;
	}

	/**
	 * @param parentName
	 *            the parentName to set
	 */
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	/**
	 * @return the contactNumberParent
	 */
	@Column(name = "SDTB_CONPNUMBER")
	public int getContactNumberParent() {
		return contactNumberParent;
	}

	/**
	 * @param contactNumberParent
	 *            the contactNumberParent to set
	 */
	public void setContactNumberParent(int contactNumberParent) {
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
	 * @param consesation
	 *            the consesation to set
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
	 * @param otherInfo
	 *            the otherInfo to set
	 */
	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
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
	 * @param classBatch
	 *            the classBatch to set
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
	 * @param studentsFinances
	 *            the studentsFinances to set
	 */
	public void setStudentsFinances(Collection<StudentFinanceBE> studentsFinances) {
		this.studentsFinances = studentsFinances;
	}

}
