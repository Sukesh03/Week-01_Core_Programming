import java.util.Scanner;
public class ChocolatesDistribution {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter num of chocolates: ");
		int numberOfchocolates=input.nextInt();
		System.out.print("Enter num of children: ");
		int numberOfChildren=input.nextInt();
		System.out.println("Number of chocolates each child will get: "+(numberOfchocolates/numberOfChildren)+"Remaining chocolate:"+(numberOfchocolates%numberOfChildren));
	}
}