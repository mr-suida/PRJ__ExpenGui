
package com.exp;
import java.util.ArrayList;

public class Categorie {
    public String name;
    private final ArrayList<Expense> expenses = new ArrayList<>();
    private int lastAcesseExpense = 0;
    
    public Categorie(String name) { 
        this.name = name; 
    }
    
    public boolean addExpense(Expense expense) { 
        return this.expenses.add(expense);
    }
   
    public boolean delExpense(String uuid) {
        if (this.expenses.isEmpty() == false ) {
            for (Expense x : this.expenses ) {
                if (x.getUuid().equals(uuid)) {this.expenses.remove(x); return true;}
            }
        }
        return false;
    }
    
    public ArrayList<String[]> getExpenseFiltered(String month) {
        
        if (this.expenses.isEmpty() == false ) {
           if (month.equals("all")) {
                ArrayList<String[]> output = new ArrayList<>();
                
                for (Expense x : this.expenses ) 
                    output.add(x.toStrArray(this.name));
                
                return output;
                
            }else {
                ArrayList<String[]> output = new ArrayList<>();
                int monthId = Months.getNumber(month);
                
                
                for (Expense x : this.expenses ) {
                    if (x.getMonth() ==  monthId ){output.add(x.toStrArray(this.name));}
                }
                
                return output;
            }
        }
        return null;
    }
    
    public Expense getExpense(String uuid) {
        if (this.expenses.isEmpty() == false ) {
            for ( Expense x : this.expenses ) {
                if ( x.getUuid().equals(uuid) ) {return x;}
            }
        }
        return null;
    }
}