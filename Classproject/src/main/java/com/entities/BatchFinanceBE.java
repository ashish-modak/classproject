/**
 * 
 */
package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Ashish
 * 
 */
@Entity
@Table(name = "CCSD_BATCHFINANCE")
public class BatchFinanceBE {

	private long id;

	private long batchFee;

	private ClassBatchBE classBatch;

	/**
	 * @return the id
	 */
	@Id
	@SequenceGenerator(name = "BFTBSEQ", sequenceName = "CCSD_BATCHFINANCE_SEQ", 	allocationSize = 50, initialValue = 5000)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BFTBSEQ")
	@Column(name = "BFTB_ID", unique = true, nullable = false)
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
	 * @return the batchFee
	 */
	@Column(name = "BFTB_BATCHFEE", nullable = false)
	public long getBatchFee() {
		return batchFee;
	}

	/**
	 * @param batchFee
	 *            the batchFee to set
	 */
	public void setBatchFee(long batchFee) {
		this.batchFee = batchFee;
	}

	/**
	 * @return the classBatch
	 */
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name="BFTB_CLASSBATCH_FK")
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

}
