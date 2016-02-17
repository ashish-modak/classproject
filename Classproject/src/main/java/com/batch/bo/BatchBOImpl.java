/**
 * 
 */
package com.batch.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.batch.dao.BatchDAO;
import com.common.BatchStream;
import com.common.MessageTO;
import com.entities.ClassBatchBE;

/**
 * @author amodak
 */
@Service
public class BatchBOImpl implements BatchBO {

    @Autowired
    BatchDAO batchDAO;

    /*
     * (non-Javadoc)
     * @see com.batch.bo.BatchBO#createNewBatch(com.entities.ClassBatchBE)
     */
    public MessageTO createNewBatch(ClassBatchBE batchTO) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * @see com.batch.bo.BatchBO#updateBatch(com.entities.ClassBatchBE)
     */
    public MessageTO updateBatch(ClassBatchBE batchTO) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * @see com.batch.bo.BatchBO#getAllBatches()
     */
    public List<ClassBatchBE> getAllBatches() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * @see com.batch.bo.BatchBO#getBatchInformation(java.lang.String, int, com.common.BatchStream)
     */
    public ClassBatchBE getBatchInformation(String batchName, int batchStandard, BatchStream stream) {
        // TODO Auto-generated method stub
        return null;
    }

    public ClassBatchBE getBatchStudentsInfo(Long batchID) {
        // TODO Auto-generated method stub
        return null;
    }

}
