package Session1java;

public class Car {

	 String color;
	 String Transmission;
     int make;
     int tyres;
     int doors;
     Car()
     {
    	 tyres=4;
    	 doors=4;
     }
     
    public void displayCharacteristics() {
    	System.out.println("Color of the car:"+color);
    	System.out.println("Make of the car:"+ make);
    	System.out.println("no of doors on the car:"+ doors);
    	System.out.println("Transmission on the car:"+ Transmission);
    	System.out.println("no of tyres on the car:"+ tyres);
    	
    }
    public void accelerate() {
    	System.out.println("car is moving forward");
    }
    public void brake()
    {
    	System.out.println("Car is stopped");
    	
    }
}
