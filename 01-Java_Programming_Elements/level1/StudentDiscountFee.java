import java.util.Scanner;
public class StudentDiscountFee {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Fees: ");
		int fee=input.nextInt();
		System.out.print("Discount percent: ");
		int discountpercent=input.nextInt();
		int discountamt=discountpercent*fee/100;
		int discountfee=fee-discountamt;
		System.out.println("Discount: "+discountamt+ " Discount fee: "+discountfee);
		input.close();
	}
}