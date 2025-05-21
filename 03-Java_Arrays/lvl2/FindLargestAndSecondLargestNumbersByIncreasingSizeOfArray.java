import java.util.Scanner;
public class FindLargestAndSecondLargestNumbersByIncreasingSizeOfArray {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=input.nextInt();
		int maxdigit=10;
		int[] digits=new int[maxdigit];
		int id=0;
		while (num!=0){
			if (id==maxdigit){
				maxdigit+=10;
				int[] temp=new int[maxdigit];
				for (int i=0;i<id;i++){
					temp[i]=digits[i];
				}
				digits=temp;
			}
			digits[id++]=num%10;
			num/=10;
		}
		int lar=-1,sec=-1;
		for (int i=0;i<id;i++){
			if (digits[i]>lar){
				sec=lar;
				lar=digits[i];
			}
			else if(digits[i]>sec && digits[i]!=lar){
				sec=digits[i];
			}
		}
		System.out.println("Largest digit: "+lar);
		if (sec==-1){
			System.out.println("No secound largest number.");}
		else{
			System.out.println("Second largest digit: "+sec);
		}
	}
}