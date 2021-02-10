package interfaceImplementation;

public class Client {

	public static void main(String[] args) {
		Bike bike = new Bike(); 
		bike.changeGear(2); 
		bike.speedUp(3); 
		bike.applyBrakes(1); 
          
        System.out.println("Bike present state :"); 
        bike.printStates(); 
          
        // creating instance of the Car and accessing its methods.
        Car car = new Car(); 
        car.changeGear(1); 
        car.speedUp(4); 
        car.applyBrakes(3); 
          
        System.out.println("Car present state :"); 
        car.printStates(); 
        
        // When we try to create a reference of an Interface, we can only access the methods of the interface and not the Derived classes.
        Vehicular io = VehicleHelper.getVehicle("car");
        io.speedUp(2);
        io.applyBrakes(1);
        // printStates() is not accessible as it is a method of Rectangle class and not the interface.
        // io.printStates()
        
	}

}
