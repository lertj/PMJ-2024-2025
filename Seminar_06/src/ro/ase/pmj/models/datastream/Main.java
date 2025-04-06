package ro.ase.pmj.models.datastream;

import ro.ase.pmj.models.Student;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("resources/S06/testData.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeChar(100);
            dos.writeInt(97);
            dos.close();

            FileInputStream fis = new FileInputStream("resources/S06/testData.txt");
            DataInputStream dis = new DataInputStream(fis);

            char c = dis.readChar();
            int i = dis.readInt();
            System.out.print("caracter: ");
            System.out.println(c);

            System.out.print("int: ");
            System.out.println(i);
            dis.close();

            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("resources/S06/caracter.txt"));
            osw.write('ţ');
            osw.close();

            FileOutputStream fos2= new FileOutputStream("resources/S06/caracterByte.txt");
            fos2.write('ţ');
            fos2.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
