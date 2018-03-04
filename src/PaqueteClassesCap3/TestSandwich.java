package PaqueteClassesCap3;

public class TestSandwich{
   
    public void ejecutar() {
	Sandwich deJamon= new Sandwich();
	deJamon.setIngrediente("Jamon de Pavo");
	deJamon.setTipoPan("Pan Blanco Bimbo");
	deJamon.setPrecio(14.5);
	System.out.println("El objeto creado de la clase Sandwich contiene:\n"+deJamon.getIngrediente()+"\n"+
		deJamon.getTipoPan()+"\nCon precio de $"+deJamon.getPrecio());
    }    
}