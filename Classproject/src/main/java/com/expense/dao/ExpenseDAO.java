/**
 * 
 */
package com.expense.dao;

import java.util.List;

import com.entities.ExpenseBE;

/**
 * @author amodak
 */
public interface ExpenseDAO {

    List<ExpenseBE> getAllExpenses();

    void createExpense(ExpenseBE expenseBE);
}
