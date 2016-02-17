/**
 * 
 */
package com.user.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.common.BusinessResult;
import com.common.MessageID;
import com.common.MessageTO;
import com.entities.UserBE;

/**
 * @author amodak
 */
@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    /*
     * (non-Javadoc)
     * @see com.user.dao.UserDAO#getUserInfo(java.lang.String)
     */
    @Transactional
    public BusinessResult<UserBE> getUserInfo(Long userId) {
        BusinessResult<UserBE> businessResult;
        final TypedQuery<UserBE> query =
                entityManager.createQuery("SELECT user from UserBE user where user.id=:userID", UserBE.class);
        query.setParameter("userID", userId);
        try {
            UserBE userBE = query.getSingleResult();
            businessResult = new BusinessResult<UserBE>(userBE);
        } catch (NoResultException e) {
            businessResult = new BusinessResult<UserBE>(null);
            businessResult.setValid(false);
            MessageTO ml = new MessageTO();
            ml.setMessageID(MessageID.M7);
            ml.setMessage("No User Found With Given UserID : " + userId);
            businessResult.addMessage(ml);
        }
        return businessResult;
    }

    /*
     * (non-Javadoc)
     * @see com.user.dao.UserDAO#createUser(com.entities.UserBE)
     */
    @Transactional
    public void createUser(UserBE userBe) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * @see com.user.dao.UserDAO#updateUserInfo(com.entities.UserBE)
     */
    @Transactional
    public UserBE updateUserInfo(UserBE userBe) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * @see com.user.dao.UserDAO#deleteUser(com.entities.UserBE)
     */
    @Transactional
    public void deleteUser(UserBE userBe) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * @see com.user.dao.UserDAO#getUserInfo(java.lang.String, java.lang.String)
     */
    @Transactional
    public BusinessResult<UserBE> getUserInfo(String userName, String password) {
        BusinessResult<UserBE> businessResult;
        final TypedQuery<UserBE> query =
                entityManager
                        .createQuery(
                                "SELECT user from UserBE user where user.userName=:userName and user.userPassword=:userPassword",
                                UserBE.class);
        query.setParameter("userName", userName);
        query.setParameter("userPassword", password);
        try {
            UserBE userBE = query.getSingleResult();
            businessResult = new BusinessResult<UserBE>(userBE);
        } catch (NoResultException e) {
            businessResult = new BusinessResult<UserBE>(null);
            businessResult.setValid(false);
            MessageTO ml = new MessageTO();
            ml.setMessageID(MessageID.M6);
            ml.setMessage("No User Found With Given Credentilas");
            businessResult.addMessage(ml);
        }
        return businessResult;
    }

}
