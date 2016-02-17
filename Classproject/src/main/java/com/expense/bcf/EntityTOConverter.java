/**
 * 
 */
package com.expense.bcf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.entities.ExpenseBE;
import com.to.ExpenseTO;

/**
 * @author Ashish
 */
public class EntityTOConverter {

    public static ExpenseTO convertExpenseEntity(ExpenseBE expenseBE) {

        return new ExpenseTO();
    }

    public static List<ExpenseTO> convertStudentEntities(Collection<ExpenseBE> expenses) {
        List<ExpenseTO> expenseTOs = new ArrayList<ExpenseTO>();
        for (ExpenseBE expense : expenses) {
            expenseTOs.add(convertExpenseEntity(expense));
        }
        return expenseTOs;
    }
}
