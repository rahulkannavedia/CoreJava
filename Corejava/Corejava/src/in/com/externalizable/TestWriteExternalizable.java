package in.com.externalizable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestWriteExternalizable {
public static void main(String[] args) throws Exception {
	
	Person p = new Person();
	p.id = 10;
	p.name = "Rahul";
	p.address = "Indore";
	
	FileOutputStream file = new FileOutputStream("C:\\Users\\ASUS\\Desktop\\Rahul\\External.txt");
	
	ObjectOutputStream out = new ObjectOutputStream(file);
	
	out.writeObject(p);
	
	out.close();
	file.close();

	System.out.println("object write Successfully...!!!");
}
	

}
