package PaqueteClassesCap3;

import java.util.Scanner;

public class Salary {
   
    public void ejecutar() {
        Integer regularHr, extraHr;
        Double payment;
        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Tarifa de pago por hora >>");
        payment=entrada.nextDouble();
        System.out.print("Horas a la semana (regulares) >>");
        regularHr=entrada.nextInt();     
        System.out.print("Horas extra a la semana >>");
        extraHr=entrada.nextInt();   
        System.out.println("El salario semanal del empleado es $"+totalSalary(payment,regularHr,extraHr));
    }
    
    public static Double totalSalary(Double pay, Integer regular, Integer overtime){
        return (regular*pay)+(overtime*(1.5*pay));
    }
}