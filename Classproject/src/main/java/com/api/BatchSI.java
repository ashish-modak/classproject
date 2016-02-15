/**
 * 
 */
package com.api;

import java.util.List;

import com.common.MessageTO;
import com.to.ClassBatchTO;

/**
 * @author Ashish
 *
 */
public interface BatchSI {
	
	public MessageTO createNewBatch(ClassBatchTO batchTO);
	
	public MessageTO updateBatch(ClassBatchTO batchTO);
	
	public List<ClassBatchTO> getAllBatches();

}
