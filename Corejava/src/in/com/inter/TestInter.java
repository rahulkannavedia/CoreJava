package in.com.inter;

public class TestInter {
	
	public static void main(String[] args) {
	
		RichMan rm = new BusinessMan();
		rm.earnMoney();
		rm.donation();
		rm.party();
		
		SocialWorker sw = new BusinessMan();
		sw.helpToOther();
		
		BusinessMan bm = new BusinessMan();
		bm.earnMoney();
		bm.donation();
	    bm.party();
	    bm.helpToOther();
		
	    System.out.println( RichMan.ABC);
	    
	    
	}

}
