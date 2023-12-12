package in.com.rays.basic;

public class Factorial {
public static void main(String[] args) {
	
	int a=5;
	int b=1;

//	   two ways to find factorial number.
//     for (int i = a; i >=1; i--) {
//		b=b*i;
//	}	
//     System.out.println(b);
	
	
    	for (int i = 1; i <= a; i++) {
	
        b=b*i;
	
}
	  System.out.println(b);
	
}
}
