package PaqueteClassesCap3;

public class ShowStudent2{
   
    public void ejecutar() {
	Student juana= new Student();
	juana.setPointsAvg(juana.getHours(),juana.getPoints());
	System.out.println("El objeto creado de la clase Student contiene:\nID: "+juana.getID()+"\nHoras de Cr�dito: "+
		juana.getHours()+"\nPuntos acumulados: "+juana.getPoints()+"\nPromedio de puntos: "+juana.getPointsAvg());
	}
}