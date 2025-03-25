package ro.ase.pmj.classes;

public class Student<T> implements Cloneable {
    public String name;
    public float[] grades = new float[10];
    public T attribute;

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

    public T getAttribute() {
        return attribute;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student<Integer> copy = (Student<Integer>) super.clone();
        copy.grades = new float[this.grades.length];

        for(int i=0; i<this.grades.length; i++){
            copy.grades[i] = this.grades[i];
        }

        return copy;
    }
}
