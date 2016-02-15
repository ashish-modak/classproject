/**
 * 
 */
package com.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.common.BatchStream;

/**
 * @author Ashish
 * 
 */
@Entity
@Table(name = "CCSD_CLASSBATCH")
public class ClassBatchBE {

	private long id;

	private String batchName;

	private int batchStandard;

	private BatchStream batchStream;

	private BatchFinanceBE batchFinance;

	private Collection<StudentBE> students;

	/**
	 * @return the id
	 */
	@Id
	@SequenceGenerator(name = "CBTBSEQ", sequenceName = "CCSD_CBATCH_SEQ", allocationSize = 50, initialValue = 5000)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CBTBSEQ")
	@Column(name = "CBTB_ID", unique = true, nullable = false)
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
	 * @return the batchName
	 */
	@Column(name = "CBTB_BATCHNAME")
	public String getBatchName() {
		return batchName;
	}

	/**
	 * @param batchName
	 *            the batchName to set
	 */
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	/**
	 * @return the batchStandard
	 */
	@Column(name = "CBTB_BATCHSTD")
	public int getBatchStandard() {
		return batchStandard;
	}

	/**
	 * @param batchStandard
	 *            the batchStandard to set
	 */
	public void setBatchStandard(int batchStandard) {
		this.batchStandard = batchStandard;
	}

	/**
	 * @return the batchStream
	 */
	@Column(name = "CBTB_BATCHSTREAM")
	@Enumerated(EnumType.STRING)
	public BatchStream getBatchStream() {
		return batchStream;
	}

	/**
	 * @param batchStream
	 *            the batchStream to set
	 */
	public void setBatchStream(BatchStream batchStream) {
		this.batchStream = batchStream;
	}

	/**
	 * @return the batchFinance
	 */

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "classBatch")
	public BatchFinanceBE getBatchFinance() {
		return batchFinance;
	}

	/**
	 * @param batchFinance
	 *            the batchFinance to set
	 */
	public void setBatchFinance(BatchFinanceBE batchFinance) {
		this.batchFinance = batchFinance;
	}

	/**
	 * @return the students
	 */
	@OneToMany(mappedBy = "classBatch")
	public Collection<StudentBE> getStudents() {
		return students;
	}

	/**
	 * @param students
	 *            the students to set
	 */
	public void setStudents(Collection<StudentBE> students) {
		this.students = students;
	}

}
