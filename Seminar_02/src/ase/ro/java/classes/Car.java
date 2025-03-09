package ase.ro.java.classes;

public class Car extends Object {

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
		if(dimensions != null){
			this.dimensions = new int[dimensions.length];
			for (int i = 0; i < dimensions.length; i++) {
				this.dimensions[i] = dimensions[i];
			}
		}
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
		int[] clone = new int[this.dimensions.length];
		System.arraycopy(this.dimensions, 0, clone, 0, this.dimensions.length);

		return clone;
	}

	public void setDimensions(int[] dimensions) {
		this.dimensions = dimensions;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	protected Object clone() {
		Car clone = new Car(this.speed, this.model, this.dimensions);

		return clone;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
