/**
 * 
 */
package com.user.bcf;

import java.util.ArrayList;
import java.util.List;

import com.entities.UserBE;
import com.to.UserTO;

/**
 * @author Ashish
 */
public class EntityTOConverter {

    public static UserTO convertUserEntity(UserBE userBE) {
        UserTO userTO = new UserTO();
        userTO.setId(userBE.getId());
        userTO.setUserName(userBE.getUserName());
        userTO.setUserPassword(userBE.getUserPassword());
        userTO.setUserRole(userBE.getUserRole());
        return userTO;
    }

    public static List<UserTO> convertUserEntities(List<UserBE> users) {
        List<UserTO> usersTO = new ArrayList<UserTO>();
        for (UserBE user : users) {
            usersTO.add(convertUserEntity(user));
        }
        return usersTO;
    }

    public static UserBE convertEmployeeTO(UserTO userTO) {
        UserBE userBE = new UserBE();
        userBE.setUserName(userTO.getUserName());
        userBE.setUserPassword(userTO.getUserPassword());
        userBE.setUserRole(userTO.getUserRole());
        return userBE;
    }

}
