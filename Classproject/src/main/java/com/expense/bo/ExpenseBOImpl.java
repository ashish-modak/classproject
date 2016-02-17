/**
 * 
 */
package com.expense.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.ExpenseBE;
import com.expense.dao.ExpenseDAO;

/**
 * @author amodak
 */
@Service
public class ExpenseBOImpl implements ExpenseBO {

    @Autowired
    ExpenseDAO expenseDAO;

    /*
     * (non-Javadoc)
     * @see com.expense.bo.ExpenseBO#getAllExpenses()
     */
    public List<ExpenseBE> getAllExpenses() {
        // TODO Auto-generated method stub
        return null;
    }

    public void createExpense(ExpenseBE expenseBE) {
        // TODO Auto-generated method stub

    }

}
