package PaqueteClassesCap4;

public class TestFormLetterWriter {
   
    public static void ejecutar() {
        FormLetterWriter p1=new FormLetterWriter("Javier","Le�n");
        p1.displaySalutation(p1.getApellido());
        p1.displaySalutation(p1.getName(),p1.getApellido());
    }
    
}