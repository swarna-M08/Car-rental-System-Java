package pack1;

public class Car extends Vehicle {

	private String bodyType;
	private String gearType;
	private String engineSize;
	
	public Car(int vehicleNo, String make, String brand, String model, int modelYear, boolean available,
			double dailyRate, String bodyType, String gearType, String engineSize) {
		super(vehicleNo, make, brand, model, modelYear, available, dailyRate);
		this.bodyType = bodyType;
		this.gearType = gearType;
		this.engineSize = engineSize;
	}
	

	@Override
	public String toString() {
	
		return super.toString() + String.format("|N/A|N/A|%s|%s|%s|", bodyType, gearType, engineSize);
	}
}

