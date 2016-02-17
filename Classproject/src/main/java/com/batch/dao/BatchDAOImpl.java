/**
 * 
 */
package com.batch.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.common.BatchStream;
import com.common.MessageTO;
import com.entities.ClassBatchBE;

/**
 * @author amodak
 */
@Repository
public class BatchDAOImpl implements BatchDAO {

    @PersistenceContext
    EntityManager entityManager;

    /*
     * (non-Javadoc)
     * @see com.batch.dao.BatchDAO#createNewBatch(com.entities.ClassBatchBE)
     */
    public MessageTO createNewBatch(ClassBatchBE batchTO) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * @see com.batch.dao.BatchDAO#updateBatch(com.entities.ClassBatchBE)
     */
    public MessageTO updateBatch(ClassBatchBE batchTO) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * @see com.batch.dao.BatchDAO#getAllBatches()
     */
    public List<ClassBatchBE> getAllBatches() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * @see com.batch.dao.BatchDAO#getBatchInformation(java.lang.String, int, com.common.BatchStream)
     */
    public ClassBatchBE getBatchInformation(String batchName, int batchStandard, BatchStream stream) {
        final TypedQuery<ClassBatchBE> query =
                entityManager
                        .createQuery(
                                "select c from ClassBatchBE c where c.batchName=:batchName and c.batchStandard=:batchStandard and c.batchStream=:batchStream",
                                ClassBatchBE.class);
        query.setParameter("batchName", batchName);
        query.setParameter("batchStandard", batchStandard);
        query.setParameter("batchStream", stream);
        return query.getSingleResult();
    }

    public ClassBatchBE getBatchStudentsInfo(Long batchID) {
        // TODO Auto-generated method stub
        return null;
    }

}
