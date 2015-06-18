package main.java.samples;

public class Car {
	String make;
	String model;
	long year;
	
	public Car(String make, String model, long year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getYear() {
		return year;
	}

	public void setYear(long year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Make: " + make);
		sb.append(", Model: " + model);
		sb.append(", Year: " + year);
		return sb.toString();
	}
}
