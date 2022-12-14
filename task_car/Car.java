package task_car;

public class Car {
	public String brand;
	public String model;
	public int amountOfFuel;
	
	public void brake() {
		System.out.println("Car is breaking");
	}
	public int accelerate() {
		
		
		if (amountOfFuel>0){
	System.out.println("Car is accelerating");
	amountOfFuel = amountOfFuel - 1;
	return amountOfFuel;
		}
		
		return amountOfFuel;
	} 
	public void print_date() { 
		System.out.println("brand is "+brand);
		System.out.println("model is "+model);
		System.out.println("amountOfFuel is "+amountOfFuel);
	}
	public void refuel(int fuel) {
		amountOfFuel = amountOfFuel + fuel;
		System.out.println("Fuel on the tank after the refuel "+amountOfFuel);
		
	}
	public Car() {
		brand = "";
		model= "";
		amountOfFuel=0;
	}
	public Car(String brand,String model , int amountOfFuel) {
		this.brand = brand;
		this.model = model;
		this.amountOfFuel = amountOfFuel;
	}
	
}
