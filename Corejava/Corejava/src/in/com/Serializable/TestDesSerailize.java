package in.com.Serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDesSerailize {
	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\Rahul\\Serial.txt");
		
		ObjectInputStream object = new ObjectInputStream(file);
		
		Marksheet m = (Marksheet) object.readObject();
		
		System.out.println(m.name);
		System.out.println(m.maths);
		System.out.println(m.physics);
		System.out.println(m.chemistry);
		System.out.println(m.total);
				
		object.close();
		file.close();
				
	}
	

}
