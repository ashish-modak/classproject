/**
 * 
 */
package com.api;

import java.util.List;

import com.common.BatchStream;
import com.common.MessageTO;
import com.to.ClassBatchCTO;
import com.to.ClassBatchTO;

/**
 * @author Ashish
 */
public interface BatchSI {

    MessageTO createNewBatch(ClassBatchTO batchTO);

    MessageTO updateBatch(ClassBatchTO batchTO);

    List<ClassBatchTO> getAllBatches();

    ClassBatchTO getBatchInformation(String batchName, int batchStandard, BatchStream stream);

    ClassBatchCTO getBatchStudentsInfo(String batchID);

}
