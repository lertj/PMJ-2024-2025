package ro.ase.pmj.classes;

import java.util.Objects;

public class Student implements Cloneable, Comparable<Student> {
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
    protected Object clone() throws CloneNotSupportedException {
        Student copy = (Student) super.clone();
        copy.grades = new float[this.grades.length];

        for(int i=0; i<this.grades.length; i++){
            copy.grades[i] = this.grades[i];
        }

        return copy;
    }

//    @Override
//    public int compareTo(Student o) {
//        float average=0;
//        for(int i=0; i< this.grades.length;i++){
//            average+=grades[i];
//        }
//        average/=grades.length;
//
//
//        float average2 = 0;
//        for(int i=0; i< o.grades.length;i++){
//            average2+=o.grades[i];
//        }
//        average2/=o.grades.length;
//
////        return Float.compare(average, average2);
//
//        if(average< average2){
//            return -1;
//        } else if (average > average2){
//            return 1;
//        } else {
//            return 0;
//        }
//    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student){
            if (this == o) return true;
            Student student = (Student) o;
            return this.name.equals(student.name);
        } else{
            return false;
        }

    }

    @Override
    public int hashCode() {
        int hashCode = 0;
        for(int i=0;i<name.length();i++){
            hashCode =(int)( 31 * hashCode + name.charAt(i) + this.grades[0]);
        }
        return name.hashCode();
    }
}
