package PaqueteClassesCap3;

public class TestBankAccount {
   
    public void ejecutar() {
        BankAccount c1=new BankAccount();
        BankAccount c2=new BankAccount();
        BankAccount c3=new BankAccount();
        BankAccount c4=new BankAccount();
        
        c1.getData();
        c2.getData();
        c3.getData();
        
        c1.showValues();
        c2.showValues();
        c3.showValues();
        c4.showValues();
        
        c1.deductMonthlyFee();
        c2.deductMonthlyFee();
        c3.deductMonthlyFee();
        c4.deductMonthlyFee();
        
        c1.showValues();
        c2.showValues();
        c3.showValues();
        c4.showValues();
        
    }
    
}