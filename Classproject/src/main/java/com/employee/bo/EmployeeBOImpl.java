/**
 * 
 */
package com.employee.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.BusinessResult;
import com.common.MessageID;
import com.common.MessageTO;
import com.employee.dao.EmployeeDAO;
import com.entities.EmployeeBE;
import com.entities.UserBE;
import com.user.dao.UserDAO;

/**
 * @author Ashish
 */
@Service
public class EmployeeBOImpl implements EmployeeBO {

    @Autowired
    EmployeeDAO employeeDAO;

    @Autowired
    UserDAO userDAO;

    /*
     * (non-Javadoc)
     * @see com.employee.bo.EmployeeBO#getEmployeeInfo(java.lang.String)
     */
    public BusinessResult<EmployeeBE> getEmployeeInfo(String employeeId) {
        Long id = Long.parseLong(employeeId);
        return employeeDAO.getEmployeeInfo(id);
    }

    /*
     * (non-Javadoc)
     * @see com.employee.bo.EmployeeBO#getAllEmployees()
     */
    public List<EmployeeBE> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    public BusinessResult<EmployeeBE> enrollEmployee(EmployeeBE employeeInfo, String userName, String password) {
        BusinessResult<EmployeeBE> businessResult;
        BusinessResult<UserBE> userBEResult = userDAO.getUserInfo(userName, password);
        if (userBEResult.isValid()) {
            employeeInfo.setUser(userBEResult.getResult());
            try {
                businessResult = employeeDAO.enrollEmployee(employeeInfo);
            } catch (Exception e) {
                businessResult = new BusinessResult<EmployeeBE>(null);
                businessResult.setValid(false);
                MessageTO ml = new MessageTO();
                ml.setMessageID(MessageID.M5);
                ml.setMessage("Exception Durring Insert Of Employee");
                businessResult.addMessage(ml);
            }
        } else {
            businessResult = new BusinessResult<EmployeeBE>(null);
            businessResult.setValid(false);
            businessResult.setMessages(userBEResult.getMessages());
        }

        return businessResult;
    }

    public EmployeeBE getAllEmployeeInfo(String employeeId) {
        Long id = Long.parseLong(employeeId);
        return employeeDAO.getAllEmployeeInfo(id);
    }

}
