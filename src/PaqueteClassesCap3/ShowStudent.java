package PaqueteClassesCap3;

public class ShowStudent{
   
    public void ejecutar() {
	Student juan= new Student();
	juan.setID(4875);
	juan.setHours(6);
	juan.setPoints(20);
	juan.setPointsAvg(juan.getHours(),juan.getPoints());
	System.out.println("El objeto creado de la clase Student contiene:\nID: "+juan.getID()+"\nHoras de Cr�dito: "+
		juan.getHours()+"\nPuntos acumulados: "+juan.getPoints()+"\nPromedio de puntos: "+juan.getPointsAvg());
    }    
}