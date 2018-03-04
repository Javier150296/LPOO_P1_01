package PaqueteClassesCap2;

import java.util.Scanner;
public class Dollars {

    public void ejecutar() {
        Integer dollar, divide=0, res=0;
        Scanner entrada= new Scanner(System.in);
        System.out.print("Dolares >> ");
        dollar=entrada.nextInt();
        divide=dollar/20;
        res=dollar%20;
        System.out.println("Equivale a\n"+divide+" de $20");
        divide=res/10;
        res=res%10;
        System.out.println(divide+" de $10");
        divide=res/5;
        res=res%5;
        System.out.println(divide+" de $5");
        divide=res/1;
        System.out.println(divide+" de $1");
    }
}
       