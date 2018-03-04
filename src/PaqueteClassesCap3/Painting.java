package PaqueteClassesCap3;

import java.util.Scanner;
public class Painting {
    private String title;
    private String artist;
    private String medio;
    private Double price;
    private Double commission;
    Scanner entrada=new Scanner(System.in);
    
    public Painting(){
        this.title="La Gioconda";
        this.artist="Leonardo Da Vinci";
        this.medio="Oleo";
        this.price=2650000.0;
        this.commission=530000.0;
    }
    public String getTitulo(){return this.title;}
    public String getArtista(){return this.artist;}
    public String getMedio(){return this.medio;}
    public Double getPrecio(){return this.price;}
    public Double getComm(){return this.commission;}
    public void setData(){
        System.out.print("Titulo de la pintura >>");
        setTitulo(entrada.nextLine());
        System.out.print("Artista >>");
        setArtista(entrada.nextLine());
        System.out.print("Medio >>");
        setMedio(entrada.nextLine());
        System.out.print("Precio >>");
        setPrecio(entrada.nextDouble());
    }
    public void showValues(){
        System.out.println(getTitulo()+" del artista "+getArtista()+" echo en "+getMedio()+" con precio de $"+getPrecio()+"\tComision -> $"+getComm());
    }
    public void setTitulo(String titulo){this.title=titulo;}
    public void setArtista(String nombre){this.artist=nombre;}
    public void setMedio(String medio){this.medio=medio;}
    public void setPrecio(Double precio){this.price=precio;
        setComm();
    }
    public void setComm(){
        this.commission=getPrecio()*0.20;
    }
    
    public static void commRate(){
        System.out.println("*La comisión de la galería es del 20%\n");
    }
}