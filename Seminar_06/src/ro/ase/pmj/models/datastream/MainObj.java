package ro.ase.pmj.models.datastream;

import ro.ase.pmj.models.Student;

import java.io.*;

public class MainObj {
    public static void main(String[] args) {
        try {


           Student stud = new Student("Gigi123", 3);

           FileOutputStream fosObj = new FileOutputStream("resources/S06/student1.txt");
           DataOutputStream dosObj = new DataOutputStream(fosObj);

           dosObj.writeUTF(stud.name);
           dosObj.writeInt(stud.noGrades);
           dosObj.close();

           FileInputStream fisObj = new FileInputStream("resources/S06/student1.txt");
           DataInputStream disObj = new DataInputStream(fisObj);
           String name = disObj.readUTF();
           int noGrades = disObj.readInt();
           disObj.close();

           Student deserialized = new Student(name, noGrades);
           System.out.println(deserialized);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
