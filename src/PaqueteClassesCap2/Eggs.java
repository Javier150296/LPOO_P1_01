package PaqueteClassesCap2;

import java.util.Scanner;
public class Eggs {

    public void ejecutar() {
        final float DOZEN=3.25f, INDIV=0.45f;
        Scanner entrada= new Scanner(System.in);
        Integer numEggs, res;
        System.out.print("Número de huevos: ");
        numEggs=entrada.nextInt();
        res=numEggs%12;
        if(res>0){
            System.out.println("Ordenaste "+numEggs+" huevos. Eso es "+(numEggs/12)+
                    " docena(s) a $3.25 por docena y "+res+" huevo(s) sobrantes a $0.45 cada uno");
            System.out.println(String.format("%s %.2f","Para un total de $",(((numEggs/12)*DOZEN))+(res*INDIV)));
        }else{
            System.out.println("Ordenaste "+numEggs+" huevos. Eso es "+(numEggs/12)+
                    " docena(s) a $3.25 por docena");
            System.out.println(String.format("%s %.2f", "Para un total de $",((numEggs/12)*DOZEN)));
        }
    } 
}