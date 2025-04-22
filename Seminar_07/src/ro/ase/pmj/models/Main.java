package ro.ase.pmj.models;

import ro.ase.pmj.interfaces.TaskStudable;
import ro.ase.pmj.interfaces.TaskStudable2;

public class Main {

	public static void main(String[] args) {
		Student s = new Student(1,"Diana", 4);
		s.writeObject();
		
		Student s1 = Student.readObject();
		System.out.println(s1);
		
		// ______________________________
		
		TaskStud ts = new TaskStud();
		System.out.println(ts.startTask(1,3));
		
		TaskStudable studable = (x, y) -> {
			int z = x-y;
			return z;
			};
			
		System.out.println(studable.startTask(5, 3));
		
		new Student("Avram", 5);
		
		TaskStudable studCiudat = new TaskStudable() {
			@Override
			public int startTask(int x, int y) {
				return x*y;
			}
		};
		
		System.out.println(studCiudat.startTask(2, 5));
		
		TaskStudable2 ts2 = x -> x*2;
		
		System.out.println(Integer.BYTES);
		System.out.println(Character.BYTES);
		System.out.println(Float.BYTES);
		System.out.println(Byte.BYTES);
		

	}

}
