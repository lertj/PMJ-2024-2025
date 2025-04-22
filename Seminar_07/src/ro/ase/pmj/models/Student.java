package ro.ase.pmj.models;

import java.io.*;

public class Student extends Entity implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String name;
    public int noGrades;

    public Student(int id, String name, int noGrades) {
    	super(id);
        this.name = name;
        this.noGrades = noGrades;
    }
    
    public Student(String name, int noGrades) {
        this.name = name;
        this.noGrades = noGrades;
    }

    
    
    @Override
	public String toString() {
    	StringBuilder sb = new StringBuilder();
    	sb.append("Student [name=");
    	sb.append(name);
    	sb.append(", No grades= ");
    	sb.append(noGrades);
    	sb.append(", id= ");
    	sb.append(id);
    	
		return  sb.toString();
	}



	void writeObject() {
		
		
    	try(FileOutputStream fos = new FileOutputStream("object.txt");
    			ObjectOutputStream obj = new ObjectOutputStream(fos);) {
			 
			obj.writeObject(this);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
//			finally {
//			try {
//				obj.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
    	
    }
    
    public static Student readObject() {
    	Student s = null;
    	try {
			FileInputStream fis = new FileInputStream("object.txt");
			ObjectInputStream obj = new ObjectInputStream(fis);
			
			 s = (Student) obj.readObject();
			obj.close();
			
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return s;
    	
    }
}
