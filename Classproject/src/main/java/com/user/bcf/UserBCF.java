/**
 * 
 */
package com.user.bcf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.UserSI;
import com.common.BusinessResult;
import com.entities.UserBE;
import com.to.UserTO;
import com.user.bo.UserBO;

/**
 * @author amodak
 */
@Service
public class UserBCF implements UserSI {

    @Autowired
    private UserBO userBO;

    /*
     * (non-Javadoc)
     * @see com.api.UserSI#getUserInfo(java.lang.String)
     */
    public BusinessResult<UserTO> getUserInfo(String userId) {
        BusinessResult<UserTO> businessResult;
        BusinessResult<UserBE> userResult = userBO.getUserInfo(userId);
        if (userResult.isValid()) {
            businessResult =
                    new BusinessResult<UserTO>(EntityTOConverter.convertUserEntity(userResult.getResult()));
        } else {
            businessResult = new BusinessResult<UserTO>(null);
            businessResult.setValid(false);
            businessResult.setMessages(userResult.getMessages());
        }
        return businessResult;

    }

    /*
     * (non-Javadoc)
     * @see com.api.UserSI#createUser(com.to.UserTO)
     */
    public void createUser(UserTO userTO) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * @see com.api.UserSI#updateUserInfo(com.to.UserTO)
     */
    public UserTO updateUserInfo(UserTO userTO) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * @see com.api.UserSI#deleteUser(com.to.UserTO)
     */
    public void deleteUser(UserTO userTO) {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * @see com.api.UserSI#getUserInfo(java.lang.String, java.lang.String)
     */
    public BusinessResult<UserTO> getUserInfo(String userName, String password) {
        BusinessResult<UserTO> businessResult;
        BusinessResult<UserBE> userResult = userBO.getUserInfo(userName, password);
        if (userResult.isValid()) {
            businessResult =
                    new BusinessResult<UserTO>(EntityTOConverter.convertUserEntity(userResult.getResult()));
        } else {
            businessResult = new BusinessResult<UserTO>(null);
            businessResult.setValid(false);
            businessResult.setMessages(userResult.getMessages());
        }
        return businessResult;
    }

}
