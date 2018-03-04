package PaqueteClassesCap4;

public class FormLetterWriter {
    private String nombre;
    private String apellido;
    
    public FormLetterWriter(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }
    public String getName(){return this.nombre;}
    public String getApellido(){return this.apellido;}
    public void displaySalutation(String apellido){
        System.out.println("Dear Mr. or Mrs. "+apellido);
    }
    public void displaySalutation(String nombre, String apellido){
        System.out.println("Dear "+nombre+" "+apellido);
    }
}