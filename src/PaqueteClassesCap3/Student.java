public class Student {
	private Integer numberID;
	private Integer creditHours;
	private Integer points;
	private Double pointAvg;

	public Student(){
		this.numberID=9999;
		this.creditHours=3;
		this.points=12;
	}

	public  void setID(Integer id){
		this.numberID=id;
	}
	public  void setHours(Integer horas){
		this.creditHours=horas;
	}
	public  void setPoints(Integer puntos){
		this.points=puntos;
	}
	public void setPointsAvg(Integer hrs, Integer ptos){
		this.pointAvg=(double)ptos/hrs;
	}
	public Integer getID(){return this.numberID;}
	public Integer getHours(){return this.creditHours;}
	public Integer getPoints(){return this.points;}
	public Double getPointsAvg(){return this.pointAvg;}
}