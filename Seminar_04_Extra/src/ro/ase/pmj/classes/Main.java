package ro.ase.pmj.classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] v = new int[10];
        v[0] = 0;
        v[1] = 1;
        Student[] students = new Student[2];
        Employee[] employees = new Employee[5];
        ArrayList<Student> studentList = new ArrayList<>();
        Student<Integer> stud = new Student("Calaurentiu", new float[]{10, 9.9f, 7});
        studentList.add(new Student("Balaurentiu", new float[]{10, 9.9f, 7}));
        studentList.add(new Student("Balaurentiu", new float[]{10, 9.9f, 7}));
        studentList.add(new Student("Balaurentiu", new float[]{10, 9.9f, 7}));
        studentList.add(new Student("Balaurentiu", new float[]{10, 9.9f, 7}));
        studentList.add(new Student("Balaurentiu", new float[]{10, 9.9f, 7}));
        studentList.add(stud);

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

       students = studentList.toArray(students);

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

        System.out.println("**********************");
        for(Iterator<Integer> i = listInt.iterator(); i.hasNext(); ){
            System.out.println(i.next());
        }


        studentList2.add(new String("abcd"));
        studentList2.add(3.14); // nu este ok


        List<Student> copyStudents = new LinkedList<>();
        copyStudents.add(new Student("Balaurentiu", new float[]{10, 9.9f, 7}));
        try{
            copyStudents.add((Student) stud.clone());
        } catch (Exception e){
            System.out.println("Nu am reusit adaugarea in lista a clonei lui stud.");
        }

        System.out.println("******************");

        System.out.println("studentList:");
        for(Student<Integer> s : studentList){
            System.out.println(s);
        }

        System.out.println("copyStudents:");
        for(Student<Integer> s : copyStudents){
            System.out.println(s);
        }

        System.out.println("modificam stud");

        stud.name = "Costel";
        stud.grades[0] = 0;

        System.out.println("studentList:");
        for(Student<Integer> s : studentList){
            System.out.println(s);
        }

        System.out.println("copyStudents:");
        for(Student<Integer> s : copyStudents){
            System.out.println(s);
        }



        String str = "abcd";
        str += "e";
        String strCopy = str;
        strCopy += "s";
        return;
    }
}
