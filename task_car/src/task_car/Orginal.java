package task_car;

public class Orginal {

	public static void main(String[] args) {
		Car car1 = new Car();
		//variable
		car1.brand = "Mercedesbenz";
		car1.model = "C200";
		car1.amountOfFuel = 10;
		//Using methods
//		car1.print_date();
//		car1.brake();
//		car1.accelerate();
//		car1.print_date();
//		car1.refuel(20);
		Car car2 = new Car("fiat","500",10);
		car2.print_date();

	}

}
