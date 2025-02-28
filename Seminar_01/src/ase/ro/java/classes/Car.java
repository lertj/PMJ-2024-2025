package ase.ro.java.classes;

public class Car {

	int speed;
	String model;
	int[] dimensions;
	
	public Car(){
		
	}

	public Car(int speed, String model){
		super();
		this.speed = speed;
		this.model = model;
	}
	
	

	public Car(int speed, String model, int[] dimensions) {
		this.speed = speed;
		this.model = model;
		this.dimensions = dimensions;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int[] getDimensions() {
		return dimensions;
	}

	public void setDimensions(int[] dimensions) {
		this.dimensions = dimensions;
	}
	
	
	
	
}
