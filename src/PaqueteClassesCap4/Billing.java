package PaqueteClassesCap4;

public class Billing {
    private Double price;
    private Integer cantidad;
    private Double cupon;
    
    public Billing(Double precio, Integer cantidad, Double descuento){
        this.price=precio;
        this.cantidad=cantidad;
        this.cupon=descuento;
    }
    
    public Double compureBill(Double price){
        return price*1.08;
    }
    public Double compureBill(Double price, Integer cantidad){
        return (price*cantidad)*1.08;
    }
    public Double compureBill(Double price, Integer cantidad, Double descuento){
        return ((price*cantidad)-descuento)*1.08;
    }
    public Double getPrecio(){return this.price;}
    public Double getCupon(){return this.cupon;}
    public Integer getCantidad(){return this.cantidad;}
    
    
    public static void ejecutar() {
        Billing compra=new Billing(35.5,2,15.5);
	Double onePhoto, photoBook, discount;
        onePhoto=compra.compureBill(compra.getPrecio());
        photoBook=compra.compureBill(compra.getPrecio(),compra.getCantidad());
        discount=compra.compureBill(compra.getPrecio(),compra.getCantidad(),compra.getCupon());
	
	System.out.println("Total\nPrimer cuenta: "+onePhoto+"\nSegunda cuenta: "+photoBook+"\nTercera cuenta: "+discount);
    }
}