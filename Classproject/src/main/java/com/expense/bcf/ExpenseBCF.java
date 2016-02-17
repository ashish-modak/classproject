/**
 * 
 */
package com.expense.bcf;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.ExpenseSI;
import com.to.ExpenseTO;

/**
 * @author amodak
 */
@Service
public class ExpenseBCF implements ExpenseSI {

    /*
     * (non-Javadoc)
     * @see com.api.ExpenseSI#getAllExpenses()
     */
    public List<ExpenseTO> getAllExpenses() {
        // TODO Auto-generated method stub
        return null;
    }

    public void createExpense(ExpenseTO expenseTO) {
        // TODO Auto-generated method stub

    }

}
