/**
 * 
 */
package com.api;

import com.common.BusinessResult;
import com.to.UserTO;

/**
 * @author amodak
 */
public interface UserSI {

    BusinessResult<UserTO> getUserInfo(String userId);

    void createUser(UserTO userTO);

    UserTO updateUserInfo(UserTO userTO);

    void deleteUser(UserTO userTO);

    BusinessResult<UserTO> getUserInfo(String userName, String password);

}
