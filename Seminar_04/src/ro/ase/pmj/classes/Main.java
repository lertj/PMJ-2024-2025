package ro.ase.pmj.classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] v = new int[10];
        v[0] = 0;
        v[1] = 1;
        Student[] students = new Student[2];
        Employee[] employees = new Employee[5];
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Balaurentiu", new float[]{10, 9.9f, 7}));
        studentList.add(new Student("Balaurentiu", new float[]{10, 9.9f, 7}));
        studentList.add(new Student("Balaurentiu", new float[]{10, 9.9f, 7}));
        studentList.add(1, new Student("Balaurentiu17", new float[]{10, 9.9f, 7}));
        ArrayList studentList2 = new ArrayList();
        studentList2.addAll(studentList);

        System.out.println(studentList.get(0));
        System.out.println(studentList.get(1));
        System.out.println("\n\n");
        if (studentList.contains(new Student("Balaurentiu", new float[]{10, 9.9f, 7}))) {
            System.out.println("L-am gasit");
        } else {
            System.out.println("Nu l-am gasit");
        }

        System.out.println(studentList.indexOf(new Student("Balaurentiu", new float[]{10, 9.9f, 7})));
        studentList.remove(new Student("Balaurentiu", new float[]{10, 9.9f, 7}));
        studentList.remove(0);
        studentList.set(0, new Student("Virgil", new float[]{11, 9.9f, 7}));

        students = studentList.toArray(students); // TODO Seminar 05

        System.out.println(((Student)studentList.get(1)).name);
        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);

        for(Integer i : listInt){
            System.out.println(i);
            int x = (int) i;
        }

        // Echivalent

        for(Iterator<Integer> i = listInt.iterator(); i.hasNext(); ){
            System.out.println(i.next());
        }

        return;
    }
}
