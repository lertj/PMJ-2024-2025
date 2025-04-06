package ro.ase.pmj.models.buffreader;

import ro.ase.pmj.models.Student;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("resources/S06/inputBuff.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader reader = new BufferedReader(isr);

            char[] buffer = new char[10];
            reader.read(buffer);
            System.out.print("buffer: ");
            System.out.println(buffer);

            String line = reader.readLine();
            System.out.println("Line: " + line);

            int number = Integer.parseInt(reader.readLine());
            System.out.println("Number: " + number);

            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
