import java.util.Scanner;
import entity.Entity;

public class  Main {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.print("Insert the brand of the car :");
	String Brand = scn.next();
	
	System.out.print("Insert the Model of the car :");
	String Model = scn.next();
	
	System.out.print("Insert the Year of the car :");
	String Year = scn.next();
	
	System.out.print("Insert if the car is On or Off :");
	String On = scn.next();
	
	Entity entity = new Entity(Brand,Model,Year,On);
		 
	 System.out.println("Car Information :");
     System.out.println("Marca: " + Brand );
     System.out.println("Modelo: " + Model);
     System.out.println("Ano: " + Year);
     System.out.println("Ligado: " + On);

	 
}
}
