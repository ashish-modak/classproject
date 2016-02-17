/**
 * 
 */
package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.api.FinanceSI;
import com.api.StudentSI;
import com.common.BusinessResult;
import com.to.StudentFinanceCTO;
import com.to.StudentFinanceTO;
import com.to.StudentTO;

/**
 * @author amodak
 */
@Controller
public class StudentController {

    @Autowired
    FinanceSI financeSI;

    @Autowired
    StudentSI studentSI;

    @RequestMapping(value = "/studentPage.html")
    public ModelAndView studentPage() {
        return new ModelAndView("student-detail-info", "command", new StudentTO());
    }

    @RequestMapping(value = "/viewstudentinfo.html", method = RequestMethod.POST)
    public ModelAndView showstudentinfo(@RequestParam("id") String studentID,
            @ModelAttribute("command") StudentTO studentTO) {
        ModelAndView modelAndView = new ModelAndView("student-detail-info");
        BusinessResult<StudentTO> studentBusinessResult = studentSI.getStudentInfo(studentID);
        if (studentBusinessResult.isValid()) {
            modelAndView.addObject("studentTO", studentBusinessResult.getResult());
            StudentFinanceCTO studentFinanceCTO = financeSI.getStudentFinanceInfo(studentID);
            modelAndView.addObject("studentFinanceTOs", studentFinanceCTO.getStudentFinanceTOs());

            long total = studentBusinessResult.getResult().getClassBatchTO().getBatchFee();
            long paid = 0;
            for (StudentFinanceTO amount : studentFinanceCTO.getStudentFinanceTOs()) {
                paid = paid + amount.getAmount();
            }
            long remaining = total - paid;

            modelAndView.addObject("totalfee", total);
            modelAndView.addObject("paidfee", paid);
            modelAndView.addObject("remainingfee", remaining);

        }

        return modelAndView;
    }

}
