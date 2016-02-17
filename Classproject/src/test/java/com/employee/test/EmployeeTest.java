/**
 * 
 */
package com.employee.test;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.api.EmployeeSI;
import com.api.StudentSI;
import com.common.BatchStream;
import com.common.BusinessResult;
import com.to.EmployeeCTO;
import com.to.EmployeeTO;
import com.to.StudentTO;

/**
 * @author amodak
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-context.xml"})
public class EmployeeTest {

    @Autowired
    private EmployeeSI employeeSI;

    @Autowired
    private StudentSI studentSI;

    @Test
    public void getEmployeeTest() {
        EmployeeCTO employeeTO = employeeSI.getAllEmployeeInfo("1");
        Assert.assertNull(employeeTO);
    }

    @Test
    public void createEmployeeTest() {
        EmployeeTO employeeTO = new EmployeeTO();
        employeeTO.setAddress("Mumbai Central");
        employeeTO.setContactNumber("8879059991");
        employeeTO.setJoiningDate(new Date());
        employeeTO.setName("Pramod");
        employeeTO.setSalary(2000);

        BusinessResult<EmployeeTO> newTO = employeeSI.enrollEmployee(employeeTO, "Ashish", "Ashish");
        Assert.assertNull(newTO.getResult());
    }

    @Test
    public void enrollStudentTest() {
        StudentTO studentTO = new StudentTO();
        studentTO.setAddress("Test4");
        studentTO.setAge(24);
        studentTO.setConsesation(200L);
        studentTO.setContactNumber(1234567L);
        studentTO.setContactNumberParent(1234567L);
        studentTO.setName("Test4");
        studentTO.setOtherInfo("Test4");
        studentTO.setParentName("Test4");
        studentTO.setSchoolName("Test4");
        studentTO.setStudentUserName("Test4");
        BusinessResult<StudentTO> businessResult =
                studentSI.enrollStudent(studentTO, "10th Marathi", 10, BatchStream.Marathi);
        Assert.assertFalse(businessResult.isValid());
    }

}
