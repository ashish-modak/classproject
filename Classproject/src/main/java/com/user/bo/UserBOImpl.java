/**
 * 
 */
package com.user.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.BusinessResult;
import com.entities.UserBE;
import com.user.dao.UserDAO;

/**
 * @author amodak
 */
@Service
public class UserBOImpl implements UserBO {

    @Autowired
    private UserDAO userDAO;

    /*
     * (non-Javadoc)
     * @see com.user.bo.UserBO#getUserInfo(java.lang.String)
     */
    public BusinessResult<UserBE> getUserInfo(String userId) {
        Long id = Long.parseLong(userId);
        return userDAO.getUserInfo(id);
    }

    /*
     * (non-Javadoc)
     * @see com.user.bo.UserBO#createUser(com.entities.UserBE)
     */
    public void createUser(UserBE userBe) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * @see com.user.bo.UserBO#updateUserInfo(com.entities.UserBE)
     */
    public UserBE updateUserInfo(UserBE userBe) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * @see com.user.bo.UserBO#deleteUser(com.entities.UserBE)
     */
    public void deleteUser(UserBE userBe) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * @see com.user.bo.UserBO#getUserInfo(java.lang.String, java.lang.String)
     */
    public BusinessResult<UserBE> getUserInfo(String userName, String password) {
        return userDAO.getUserInfo(userName, password);
    }

}
