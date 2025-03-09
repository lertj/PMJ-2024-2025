package ase.ro.java.classes;
import ase.ro.java.classes.Car;

public class Main {

	public static void main(String[] args) {

		int x = 10;
		System.out.println("Java!");
		System.out.println(x);

		Car car = new Car(100,"Toyota");
		Car clone = (Car) car.clone();
		System.out.println(car.getModel());

		int[] dimensions = new int[]{100,200,300};
		int[] newDimensions = new int[3];
		newDimensions[0] = 100;
		newDimensions[1] = 200;
		newDimensions[2] = 300;
		Car carDimensions = new Car(100,"Toyota", dimensions);
		Car cloneDimensions = (Car) carDimensions.clone();
//		for(int i=0;i<carDimensions.dimensions.length;i++) {
//			System.out.println(carDimensions.dimensions[i]);
//		}

		for(int i : carDimensions.dimensions){
			System.out.println(i);
		}

		System.out.println("Car model= " + car.model);
		System.out.println("Clone model= " + clone.model);
		car.model = "Dacia";
		System.out.println("Car model= " + car.model);
		System.out.println("Clone model= " + clone.model);

		Car newClone = new Car(carDimensions.getSpeed(), carDimensions.getModel(), carDimensions.getDimensions());
		int[] cloneV = newClone.getDimensions();
		cloneV[0] = 500;
 		for (int i : newClone.dimensions){
			System.out.println("Dimension: " + i);
		}
	}

}
