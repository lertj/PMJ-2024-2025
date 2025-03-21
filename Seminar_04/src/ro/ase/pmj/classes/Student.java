package ro.ase.pmj.classes;

public class Student {
    public String name;
    public float[] grades = new float[10];

    public Student(String name, float[] grades) {
        this.name = name;
        this.grades = grades;
    }

    @Override
    public String toString() {
        String stud = "Student name: " + this.name + " \n Student grades: ";
        for(int i=0; i<this.grades.length; i++){
            stud += this.grades[i] + " ";
        }
        return stud;
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
//        return (this.name.equals(((Student) obj).name));
        return (this.name.equals(s.name));
    }
}
