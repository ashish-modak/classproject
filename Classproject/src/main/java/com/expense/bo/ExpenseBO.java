/**
 * 
 */
package com.expense.bo;

import java.util.List;

import com.entities.ExpenseBE;

/**
 * @author amodak
 */
public interface ExpenseBO {

    List<ExpenseBE> getAllExpenses();

    void createExpense(ExpenseBE expenseBE);
}
