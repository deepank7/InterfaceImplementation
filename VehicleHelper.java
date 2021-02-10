package interfaceImplementation;

public class VehicleHelper {

	public static Vehicular getVehicle(String vehicleType) {
		if (vehicleType == null) {
			return null;
		}
		if (vehicleType.equals("car")) {
			return new Car();

		} else if (vehicleType.equals("bike")) {
			return new Bike();
		}
		return null;

	}
}