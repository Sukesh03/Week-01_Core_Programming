import java.util.Scanner;
public class FizzBuzzUsingForLoop {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=input.nextInt();
		if (num>0){
			for (int i=1;i<num+1;i++){
				if (i%15==0){
					System.out.println("FizzBuzz");
				}
				else if (i%3==0){
					System.out.println("Fizz");
				}
				else if (i%5==0){
					System.out.println("Buzz");
				}
				else{
					System.out.println(i);
				}
			}
		}
	}
}