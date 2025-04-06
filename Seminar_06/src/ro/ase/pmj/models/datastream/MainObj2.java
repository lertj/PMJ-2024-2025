package ro.ase.pmj.models.datastream;

import ro.ase.pmj.models.Student;

import java.io.*;
import java.util.Arrays;

public class MainObj2 {
    public static void main(String[] args) {
        try {
           Student stud = new Student("Gigi123", 3);

           FileOutputStream fosObj = new FileOutputStream("resources/S06/student2.txt");
           OutputStreamWriter oswObj = new OutputStreamWriter(fosObj);

           oswObj.write(stud.name);
           oswObj.write(stud.noGrades);

           oswObj.close();

           FileInputStream fisObj = new FileInputStream("resources/S06/student2.txt");
           InputStreamReader isrObj = new InputStreamReader(fisObj);

           char[] buffer = new char[7];
           isrObj.read(buffer);
           char[] bufferInt = new char[1];
           isrObj.read(bufferInt);
           int noGrades = bufferInt[0] ;
           Student deserialized = new Student(new String(buffer), noGrades);
           System.out.println(deserialized);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
