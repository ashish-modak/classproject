/**
 * 
 */
package com.to;

import java.util.List;

/**
 * @author amodak
 */
public class ClassBatchCTO {

    private ClassBatchTO classBatchTO;

    private List<StudentTO> students;

    /**
     * @return the classBatchTO
     */
    public ClassBatchTO getClassBatchTO() {
        return classBatchTO;
    }

    /**
     * @param classBatchTO the classBatchTO to set
     */
    public void setClassBatchTO(ClassBatchTO classBatchTO) {
        this.classBatchTO = classBatchTO;
    }

    /**
     * @return the students
     */
    public List<StudentTO> getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(List<StudentTO> students) {
        this.students = students;
    }

}
