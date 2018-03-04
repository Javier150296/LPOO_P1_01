package PaqueteClassesCap3;

import java.util.Scanner;
public class BankAccount {
    private Integer numeroCuenta;
    private String name;
    private Double balance;
    Scanner entrada=new Scanner(System.in);
    
    public BankAccount(){
        this.numeroCuenta=10001;
        this.name="Cliente X";
        this.balance=2500.0;
    }
    public Integer getCuenta(){return this.numeroCuenta;}
    public String getNombre(){return this.name;}
    public Double getSaldo(){return this.balance;}
    public void getData(){
        System.out.print("Numero de cuenta >>");
        setCuenta(entrada.nextInt());
        entrada.nextLine();
        System.out.print("Nombre >>");
        setNombre(entrada.nextLine());
        System.out.print("Saldo >>");
        setSaldo(entrada.nextDouble());
    }
    public void showValues(){
        System.out.println("Cuenta "+getCuenta()+" de "+getNombre()+" con saldo $"+getSaldo());
        explainAccountPolicy();
    }
    public void setCuenta(Integer cuenta){this.numeroCuenta=cuenta;}
    public void setNombre(String nombre){this.name=nombre;}
    public void setSaldo(Double saldo){this.balance=saldo;}
    public void deductMonthlyFee(){
        this.balance-=4.0;
    }
    public static void explainAccountPolicy(){
        System.out.println("El servicio de cuota de $4 sera deducida cada mes\n");
    }
}