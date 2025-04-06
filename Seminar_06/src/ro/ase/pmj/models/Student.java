package ro.ase.pmj.models;

public class Student {
    public String name;
    public int noGrades;

    public Student(String name, int noGrades) {
        this.name = name;
        this.noGrades = noGrades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", noGrades=" + noGrades +
                '}';
    }
}
