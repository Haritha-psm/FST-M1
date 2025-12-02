package Activities;

public class Car {
	String color ;
	String transmission;
	int make ;
	int tyres ;
	int doors ;
	//Constructors creating with main method Car
	
	 Car (){
		 tyres = 4;
		 doors = 4;
		 
		 
	 }
	 public  void displayCharacteristic() {
		 System.out.println("Color of the Car: " + color);
		 System.out.println("Make of the car: " + make);
		 System.out.println("Transmission of  the car : " + transmission);
		 System.out.println("Doors the car : " + doors);
		 System.out.println("Ttres the car : " + tyres);
	 }
	 public void accelerate() {
			System.out.println("Car is moving forward.");
		    }
			
		    public void brake() {
			System.out.println("Car has stopped.");
		    }
		}
	
	


