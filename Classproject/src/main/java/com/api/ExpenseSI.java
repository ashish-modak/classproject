/**
 * 
 */
package com.api;

import java.util.List;

import com.to.ExpenseTO;

/**
 * @author Ashish
 */
public interface ExpenseSI {

    List<ExpenseTO> getAllExpenses();

    void createExpense(ExpenseTO expenseTO);

}
