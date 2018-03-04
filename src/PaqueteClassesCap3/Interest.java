package PaqueteClassesCap3;

import java.util.Scanner;

public class Interest {
   
    public void ejecutar() {
        Double total;
        
        total=afterInvest(inicialAmount());
        System.out.println("La cantidad de dinero que tendr� dentro de un año será $"+total);
    }
    
    public static Double inicialAmount(){
        Scanner entrada=new Scanner(System.in);
        Double cant;
        System.out.print("Cantidad de dinero a invertir $ >>");
        cant=entrada.nextDouble();
        return cant;
    }
    public static Double afterInvest(Double inicio){
        return inicio*1.05;
    }
}