import java.util.Scanner;
public class bonus{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter salary: ");
		int salary=input.nextInt();
		System.out.print("Enter years of service: ");
		int service=input.nextInt();
		int bonus=0;
		if (service>5){
			bonus=5*salary/100;
			System.out.print("Bonus: "+bonus);
		}
		else{
			System.out.print("Bonus: "+bonus);
		}
	}
}