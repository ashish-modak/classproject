/**
 * 
 */
package com.batch.bo;

import java.util.List;

import com.common.BatchStream;
import com.common.MessageTO;
import com.entities.ClassBatchBE;

/**
 * @author amodak
 */
public interface BatchBO {

    MessageTO createNewBatch(ClassBatchBE batchTO);

    MessageTO updateBatch(ClassBatchBE batchTO);

    List<ClassBatchBE> getAllBatches();

    ClassBatchBE getBatchInformation(String batchName, int batchStandard, BatchStream stream);

    ClassBatchBE getBatchStudentsInfo(Long batchID);

}
