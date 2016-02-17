/**
 * 
 */
package com.user.dao;

import com.common.BusinessResult;
import com.entities.UserBE;

/**
 * @author amodak
 */
public interface UserDAO {

    BusinessResult<UserBE> getUserInfo(Long userId);

    void createUser(UserBE userBe);

    UserBE updateUserInfo(UserBE userBe);

    void deleteUser(UserBE userBe);

    BusinessResult<UserBE> getUserInfo(String userName, String password);
}
