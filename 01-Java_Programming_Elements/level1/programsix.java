public class programsix{
	public static void main(String[] args){
		int fee=125000,discountpercent=10;
		int discount=discountpercent*fee/100;
		int feepaid=fee-discount;
		System.out.println("Discount amount: "+discount+" Discounted fee: "+feepaid);
	}
}