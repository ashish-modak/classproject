/**
 * 
 */
package com.user.bo;

import com.common.BusinessResult;
import com.entities.UserBE;

/**
 * @author amodak
 */
public interface UserBO {

    BusinessResult<UserBE> getUserInfo(String userId);

    void createUser(UserBE userBe);

    UserBE updateUserInfo(UserBE userBe);

    void deleteUser(UserBE userBe);

    BusinessResult<UserBE> getUserInfo(String userName, String password);
}
