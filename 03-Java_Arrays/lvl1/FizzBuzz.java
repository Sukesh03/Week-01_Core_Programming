import java.util.*;
public class FizzBuzz {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=input.nextInt();
		String arr[]=new String[num+1];
		for (int i=0;i<num+1;i++){
			if (i%15==0){
				arr[i]="FizzBuzz";
			}
			else if (i%5==0){
				arr[i]="Buzz";
			}
			else if (i%3==0){
				arr[i]="Fizz";
			}
			else{
				arr[i]=String.valueOf(i);
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}