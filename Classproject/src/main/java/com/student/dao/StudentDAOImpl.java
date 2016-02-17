/**
 * 
 */
package com.student.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.common.BusinessResult;
import com.common.MessageID;
import com.common.MessageResult;
import com.common.MessageTO;
import com.entities.StudentBE;

/**
 * @author Ashish
 */
@Repository
public class StudentDAOImpl implements StudentDAO {

    @PersistenceContext
    private EntityManager entityManager;

    /*
     * (non-Javadoc)
     * @see com.student.dao.StudentDAO#getStudentInfo(java.lang.String)
     */
    @Transactional
    public BusinessResult<StudentBE> getStudentInfo(Long studentId) {
        BusinessResult<StudentBE> businessResult;
        TypedQuery<StudentBE> query =
                entityManager.createQuery(
                        "select s from StudentBE s join fetch s.classBatch sb where s.id=:studentId",
                        StudentBE.class);
        query.setParameter("studentId", studentId);
        try {
            StudentBE studentBE = query.getSingleResult();
            businessResult = new BusinessResult<StudentBE>(studentBE);
        } catch (NoResultException e) {
            businessResult = new BusinessResult<StudentBE>(null);
            businessResult.setValid(false);
            MessageTO ml = new MessageTO();
            ml.setMessageID(MessageID.M2);
            ml.setMessage(e.getMessage());
            businessResult.addMessage(ml);
        }
        return businessResult;
    }

    /*
     * (non-Javadoc)
     * @see com.student.dao.StudentDAO#getStudentsInfo(java.lang.String)
     */
    @Transactional
    public List<StudentBE> getStudentsInfo(String studentName) {
        TypedQuery<StudentBE> query =
                entityManager.createQuery("select s from StudentBE s where s.name=:studentName", StudentBE.class);
        query.setParameter("studentName", studentName);
        return query.getResultList();
    }

    /*
     * (non-Javadoc)
     * @see com.student.dao.StudentDAO#enrollStudent(com.to.StudentTO)
     */
    @Transactional(noRollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public BusinessResult<StudentBE> enrollStudent(StudentBE studentInfo) throws Exception {
        BusinessResult<StudentBE> businessResult;
        entityManager.persist(studentInfo);
        businessResult = new BusinessResult<StudentBE>(studentInfo);
        return businessResult;
    }

    @Transactional
    public MessageResult removeStudent(Long studentID) {
        MessageResult messageResult = new MessageResult();
        TypedQuery<StudentBE> query =
                entityManager.createQuery("select s from StudentBE s where s.id=:studentId", StudentBE.class);
        query.setParameter("studentId", studentID);
        try {
            StudentBE studentBE = query.getSingleResult();
            entityManager.remove(studentBE);
        } catch (NonUniqueResultException e) {
            MessageTO ml = new MessageTO();
            ml.setMessageID(MessageID.M1);
            ml.setMessage(e.getMessage());
            messageResult.setValid(false);
            messageResult.addMessage(ml);
        }
        return messageResult;
    }

}
