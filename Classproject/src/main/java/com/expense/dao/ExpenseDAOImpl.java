/**
 * 
 */
package com.expense.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.entities.ExpenseBE;

/**
 * @author amodak
 */
@Repository
public class ExpenseDAOImpl implements ExpenseDAO {

    @PersistenceContext
    EntityManager entityManager;

    /*
     * (non-Javadoc)
     * @see com.expense.dao.ExpenseDAO#getAllExpenses()
     */
    public List<ExpenseBE> getAllExpenses() {
        // TODO Auto-generated method stub
        return null;
    }

    public void createExpense(ExpenseBE expenseBE) {
        // TODO Auto-generated method stub

    }

}
