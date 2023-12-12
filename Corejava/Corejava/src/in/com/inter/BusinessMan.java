package in.com.inter;

public class BusinessMan implements RichMan, SocialWorker {

	@Override
	public void earnMoney() {
		System.out.println("EarnMoney");
		
	}

	@Override
	public void donation() {
		System.out.println("Donation");
		
	}

	@Override
	public void party() {
		System.out.println("Party");
		
	}
	

	@Override
	public void helpToOther() {
		System.out.println("HelpToOther");
		
	}
	

}
