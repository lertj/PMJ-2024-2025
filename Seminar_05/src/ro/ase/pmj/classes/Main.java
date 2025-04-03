package ro.ase.pmj.classes;

import java.util.*;

public class Main {

    public static void add(int x, int y){
        x = x + y;
    }

    public static void add(Student x, Student y){
        x.name = x.name + y.name;
    }

    public static void main(String[] args) {
        Set<Student> studentSet = new TreeSet<>();

        Student stud1 = new Student("Laurentiu", new float[]{10, 9.5f});
        Student stud2 = new Student("George", new float[]{7, 10});
        Student stud3 = new Student("Ciprian", new float[]{10, 9.5f, 8});

        studentSet.add(stud1);
        studentSet.add(stud2);
        studentSet.add(stud3);
        studentSet.add(stud3);
        studentSet.add(new Student("Mihai", new float[]{10, 9.5f, 8}));

        for (Student s : studentSet){
            System.out.println(s);
        }

        System.out.println("\n\nHashSet:\n");

        Set<Student> hashSetStud = new HashSet<>();
        hashSetStud.add(stud1);
        hashSetStud.add(stud2);
        hashSetStud.add(stud3);
        hashSetStud.add(new Student("Ziprian", new float[]{10, 9.5f, 8}));
        hashSetStud.add(new Student("Jiprian", new float[]{10, 9.5f, 8}));
        hashSetStud.add(new Student("Aprian", new float[]{10, 9.5f, 8}));

        for (Student s : hashSetStud){
            System.out.println(s);
        }

        System.out.println("\n\n\nMap:");

        Map<Student, String> mapStudent = new TreeMap<>();
        mapStudent.put(stud1, "Premiul I");
        mapStudent.put(stud2, "Premiul II");
        mapStudent.put(stud3, "Mentiune");

        for(Student s: mapStudent.keySet()){
            System.out.println(s);
            System.out.println("Value: " + mapStudent.get(s));
        }
        System.out.println("\n");
        for(Map.Entry<Student, String> e: mapStudent.entrySet()){
            System.out.println(e.getValue());
            System.out.println(e.getKey());
            //System.out.println("Value: " + mapStudent.get(s));
        }

        System.out.println("\n\n");
        mapStudent = new HashMap<Student, String>();
        mapStudent.put(stud1, "Premiul I");
        mapStudent.put(stud2, "Premiul II");
        mapStudent.put(new Student("George", new float[]{7, 10,9}), "Premiul IIIII");
        for(Student s: mapStudent.keySet()){
            System.out.println(s);
            System.out.println("Value: " + mapStudent.get(s));
        }

        System.out.println("\n\n\n");
        int x = 5, y=3;
        add(x,y);
        System.out.println(x);
        System.out.println("\n\n\n");
        add(stud1, stud2);
        System.out.println(stud1);

    }
}
