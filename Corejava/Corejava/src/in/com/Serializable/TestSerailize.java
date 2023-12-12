package in.com.Serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerailize {
	public static void main(String[] args) throws Exception {
	
		FileOutputStream file = new FileOutputStream("C:\\Users\\ASUS\\Desktop\\Rahul\\Serial.txt");
		
		ObjectOutputStream object = new ObjectOutputStream(file);
		
		Marksheet m = new Marksheet();		
		m.name = "Ram";
		m.maths = 10;
		m.physics = 20;
		m.chemistry = 30;
		m.total = m.maths+m.physics+m.chemistry;
		
		object.writeObject(m);    //object Write 
		file.close();
		object.close();
		
		
		
	}

}
