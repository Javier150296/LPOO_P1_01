package PaqueteClassesCap4;

import java.util.*;
public class YearEnd {
   
    public static void ejecutar() {
        GregorianCalendar f1=new GregorianCalendar();
        Integer days;
        days= 366-f1.get(GregorianCalendar.DAY_OF_YEAR);
        System.out.println("Faltan "+days+" para terminar el año");
    }
}