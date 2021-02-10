package interfaceImplementation;

public class Client {

	public static void main(String[] args) {
		Bike bike = new Bike(); 
		bike.changeGear(2); 
		bike.speedUp(3); 
		bike.applyBrakes(1); 
          
        System.out.println("Bike present state :"); 
        bike.printStates(); 
          
        // creating instance of the Car. 
        Car car = new Car(); 
        car.changeGear(1); 
        car.speedUp(4); 
        car.applyBrakes(3); 
          
        System.out.println("Car present state :"); 
        car.printStates(); 
	}

}
