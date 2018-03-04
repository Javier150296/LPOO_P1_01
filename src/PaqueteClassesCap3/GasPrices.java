package PaqueteClassesCap3;

import java.util.Scanner;

public class GasPrices {
    
    public static void pricesPerGallon(Integer A){
        Double maxPrice, minPrice;
        maxPrice=A*0.04;
        minPrice=maxPrice-(A*0.005);
        System.out.println(String.format("%s %.2f %s %.2f","El precio por galón estará entre $",minPrice," y $",maxPrice));
    }
    
    public void ejecutar() {
        Integer pricePerBarrel;
        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Precio por barril >>");
        pricePerBarrel=entrada.nextInt();
        pricesPerGallon(pricePerBarrel);
    }
}