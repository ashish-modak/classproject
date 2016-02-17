/**
 * 
 */
package com.batch.bcf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.BatchSI;
import com.batch.bo.BatchBO;
import com.common.BatchStream;
import com.common.MessageTO;
import com.to.ClassBatchCTO;
import com.to.ClassBatchTO;

/**
 * @author amodak
 */
@Service
public class BatchBCF implements BatchSI {

    @Autowired
    BatchBO batchBO;

    /*
     * (non-Javadoc)
     * @see com.api.BatchSI#createNewBatch(com.to.ClassBatchTO)
     */
    public MessageTO createNewBatch(ClassBatchTO batchTO) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * @see com.api.BatchSI#updateBatch(com.to.ClassBatchTO)
     */
    public MessageTO updateBatch(ClassBatchTO batchTO) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * @see com.api.BatchSI#getAllBatches()
     */
    public List<ClassBatchTO> getAllBatches() {
        // TODO Auto-generated method stub
        return null;
    }

    public ClassBatchTO getBatchInformation(String batchName, int batchStandard, BatchStream stream) {
        // TODO Auto-generated method stub
        return null;
    }

    public ClassBatchCTO getBatchStudentsInfo(String batchID) {
        // TODO Auto-generated method stub
        return null;
    }

}
