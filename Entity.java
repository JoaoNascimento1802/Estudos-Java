package entity;

public class Entity {
	private String Brand;
	private String Model;
	private int Year;
	private boolean On;
	
	
	public Entity (String Brand,String Model,int Year,boolean On,boolean Off) {
		this.Brand = Brand;
		this.Year = Year;
		this.Model = Model;
		this.On = On;
	}
	
	public Entity(String brand2, String model2, String year2, String on2) {
		// TODO Auto-generated constructor stub
	}

	public void On() {
		this.On = true;
		System.out.println(" The car is On ! ");
	}
	public void Off() {
		this.On = false;
		System.out.println("The car is Off ! ");
	}
	
	}
 	class CarInfo {
 		String Brand;
 		String Model;
 		int Year;
 	
 	public CarInfo(String brand, String model, int year) {
        this.Brand = brand;
        this.Model = model;
        this.Year = year;
 	}
 	
 	public CarInfo GetInfo() {
 		return new CarInfo(Brand, Model, Year);
 	}
 	}