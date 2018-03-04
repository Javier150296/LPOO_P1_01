package PaqueteClassesCap3;

public class Event{
	public final static Integer pricePerGuest=35, cutoffVal=50;
	private String eventNumber;
	private Integer guests;
	private Double price;

	public void setEventNumber(String number){
		this.eventNumber=number;
	}
	public void setGuests(Integer guests){
		this.guests=guests;
		this.price=(double)guests*pricePerGuest;
	}
	public String getEventNum(){
		return eventNumber;
	}
	public Integer getGuests(){
		return guests;
	}
	public Double getPrice(){
		return price;
	}

}
		