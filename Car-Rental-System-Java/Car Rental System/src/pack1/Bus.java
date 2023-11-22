package pack1;

public class Bus extends Vehicle {

	private int numberOfSeats;
	private String driversNationality;
	
	public Bus(int vehicleNo, String make, String brand, String model, int modelYear, boolean available,
			double dailyRate, int numberOfSeats, String driversNationality) {
		super(vehicleNo, make, brand, model, modelYear, available, dailyRate);
		this.numberOfSeats = numberOfSeats;
		this.driversNationality = driversNationality;
	}
	

	@Override
	public String toString() {
		
		return super.toString() + String.format("|Bus|%d|%s|N/A|N/A|N/A|", numberOfSeats, driversNationality);
	}
	
}

