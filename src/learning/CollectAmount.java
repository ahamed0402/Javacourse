package learning;

public class CollectAmount {

	public Long collectedAmount=7000l;
			
	public Long moneyvangiten() {
		System.out.println("collectedAmount");
		return collectedAmount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CollectAmount ca = new CollectAmount();
		Long amount= ca.moneyvangiten();
		System.out.println("Got the amount" + amount );
		
	}

}
