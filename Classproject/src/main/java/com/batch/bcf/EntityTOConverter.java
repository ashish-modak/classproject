/**
 * 
 */
package com.batch.bcf;

import java.util.ArrayList;
import java.util.List;

import com.entities.ClassBatchBE;
import com.to.ClassBatchCTO;
import com.to.ClassBatchTO;

/**
 * @author Ashish
 */
public class EntityTOConverter {

    public static ClassBatchTO convertClassBatchEntity(ClassBatchBE classBatchBE) {
        ClassBatchTO classBatchTO = new ClassBatchTO();
        classBatchTO.setBatchFee(classBatchBE.getBatchFee());
        classBatchTO.setBatchName(classBatchBE.getBatchName());
        classBatchTO.setBatchStandard(classBatchBE.getBatchStandard());
        classBatchTO.setBatchStream(classBatchBE.getBatchStream());
        classBatchTO.setId(classBatchBE.getId());
        return classBatchTO;
    }

    public static List<ClassBatchTO> convertEmployeeEntities(List<ClassBatchBE> classBatchBEs) {
        List<ClassBatchTO> classBatchTOs = new ArrayList<ClassBatchTO>();
        for (ClassBatchBE classBatch : classBatchBEs) {
            classBatchTOs.add(convertClassBatchEntity(classBatch));
        }
        return classBatchTOs;
    }

    public static ClassBatchCTO convertClassBatchCTO(ClassBatchBE classBatchBE) {
        ClassBatchCTO classBatchCTO = new ClassBatchCTO();
        classBatchCTO.setClassBatchTO(convertClassBatchEntity(classBatchBE));
        classBatchCTO.setStudents(com.student.bcf.EntityTOConverter.convertStudentEntities(classBatchBE
                .getStudents()));
        return classBatchCTO;
    }
}
