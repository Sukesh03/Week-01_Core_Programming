import java.util.Scanner;
public class arm{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=input.nextInt();
		int temp=num;
		int res=0;
		while(num!=0){
			res+=Math.pow((num%10),3);
			num=num/10;
		}
		if (temp==res){
			System.out.print("Armstrong number");
		}
		else{
			System.out.print("not an Armstrong number");
		}
	}
}	