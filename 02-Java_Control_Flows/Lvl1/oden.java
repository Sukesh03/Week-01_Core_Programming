import java.util.Scanner;
public class oden{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a num: ");
		int num=input.nextInt();
		if (num>0){
			for (int i=2;i<num;i++){
					if (i%2==0){
						System.out.println(i+" is even");
					}
					else{
						System.out.println(i+" is odd");
					}
			}
		}
	}
}