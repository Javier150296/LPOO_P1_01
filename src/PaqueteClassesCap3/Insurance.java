package PaqueteClassesCap3;

import java.util.Scanner;

public class Insurance {
   
    public void ejecutar() {
        Integer currentYear, birthYear;
        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Año actual >>");
        currentYear=entrada.nextInt();
        System.out.print("Año de nacimiento >>");
        birthYear=entrada.nextInt();     
        System.out.println("El importe calculado a pagar es de $"+premAmount(currentYear,birthYear));
    }
    
    public static Integer premAmount(Integer anActual, Integer anNac){
        Integer yearsOld=anActual-anNac;
        return ((yearsOld/10)+15)*20;
    }
}