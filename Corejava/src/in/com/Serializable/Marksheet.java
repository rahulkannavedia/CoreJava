package in.com.Serializable;

import java.io.Serializable;

public class Marksheet implements Serializable{
	
	public String name = null;
	public int maths = 0;
	public int physics = 0;
	public int chemistry = 0;
     transient int total = 0;
	
}
