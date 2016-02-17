/**
 * 
 */
package com.to;

import com.common.BatchStream;

/**
 * @author Ashish
 */
public class ClassBatchTO {

    private Long id;

    private String batchName;

    private int batchStandard;

    private long batchFee;

    private BatchStream batchStream;

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
     * @return the batchName
     */
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
    public BatchStream getBatchStream() {
        return batchStream;
    }

    /**
     * @param batchStream the batchStream to set
     */
    public void setBatchStream(BatchStream batchStream) {
        this.batchStream = batchStream;
    }

}
