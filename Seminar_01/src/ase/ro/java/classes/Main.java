package ase.ro.java.classes;
import ase.ro.java.classes.Car;

public class Main {

	public static void main(String[] args) {
		int x = 10;
		System.out.println("Java!");
		System.out.println(x);
		
		Car c = new Car(100,"Toyota");
		System.out.println(c.getModel());
		
		int[] dimensions = {100,200,300};
		Car carD = new Car(100,"Toyota", dimensions);
		for(int i=0;i<carD.dimensions.length;i++) {
			System.out.println(carD.dimensions[i]);
		}
		
		
	}

}
