package in.com.rays.practice;

public class TestAverage {
public static void main(String[] args) {
		
      int num = 10;
      int sum = 0;
      int count = 0;
      int avg;
      
      for (int i = 1; i <= num; i++) {
		
    	if (i%2==0) {
			
    		sum=sum+i;
    		count++;
    		
    		
		}  
    	  
	}
		
		avg=sum/count;
		System.out.println(avg);
		
	}

}
