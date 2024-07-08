


package com.exp;
import java.util.UUID;



public class Expense {
    private String name;
    private String desc;
    private String date;
    private final int month;
    private final String uuid;
    private double balence;  //money
    private boolean itsAnExpense;   
    
    
    
    public Expense(String name, String desc, String date, double balence, boolean itsAnExpense) {
        this.name = name;
        this.desc = desc;
        this.date = date;
        this.balence = balence;
        this.itsAnExpense  = itsAnExpense;
        this.uuid  = UUID.randomUUID().toString().substring(0,7);
        this.month = Integer.parseInt(this.date.substring(3, 5))-1;
    }
    
    public void setName(String name){this.name = name;}
    public void setDate(String date){this.date = date;}
    public void setDesc(String desc){this.desc = desc;}
    public void setBalence(double balence){this.balence = balence;}
    public void setBtype(boolean itsAnExpense){this.itsAnExpense = itsAnExpense;}

    public String  getName(){return this.name;}
    public String  getDate(){return this.date;}
    public String  getDesc(){return this.desc;}
    public String  getUuid(){return this.uuid;}
    public int     getMonth(){return this.month;}

  
    public String[] toStrArray(String prefix) {
        String cash, tipe;
        cash=(this.itsAnExpense) ? String.format("%.2f R$ ⮝",this.balence) : String.format("%.2f R$ ⮟",this.balence);
        tipe=(this.itsAnExpense) ? "yes" : "not";
        
        return new String[] {
            prefix,this.uuid,
            this.name,this.desc,
            this.date,cash,tipe
        };
    }

    public double  getBalence(){return this.balence;}
    public boolean getBtype(){return this.itsAnExpense;}
  
}
