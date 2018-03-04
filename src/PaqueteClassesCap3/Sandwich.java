package PaqueteClassesCap3;

public class Sandwich{
	private String mainIngredient;
	private String breadType;
	private Double price;
	
	public  void setIngrediente(String ingrediente){
		this.mainIngredient=ingrediente;
	}
	public  void setTipoPan(String pan){
		this.breadType=pan;
	}
	public  void setPrecio(Double precio){
		this.price=precio;
	}
	public String getIngrediente(){return this.mainIngredient;}
	public String getTipoPan(){return this.breadType;}
	public Double getPrecio(){return this.price;}
}
	