import java.util.Scanner;
public class BMICalculation {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number of ppl: ");
		int n=input.nextInt();
		double w[]=new double[n],h[]=new double[n],b[]=new double[n];
		String ws[]=new String[n];
		for (int i=0;i<n;i++){
			System.out.print("Enter the height: ");
			h[i]=input.nextDouble();
			h[i]/=100;
			System.out.print("Enter the weight: ");
			w[i]=input.nextDouble();
			b[i]=w[i]/(h[i]*h[i]);
			if (b[i]<=18.4){
				ws[i]="Underweight";
			}
			else if (b[i]>=18.5 && b[i]<25){
				ws[i]="Normal";
			}
			else if (b[i]>=25 && b[i]<40){
				ws[i]="Overweight";
			}
			else{
				ws[i]="Obese";
			} 
		}
		for (int i=0;i<n;i++){
			System.out.print("Height: "+h[i]);
			System.out.print("Weight: "+w[i]);
			System.out.print("BMI: "+b[i]);
			System.out.println("Weight Status: "+ws[i]);
		}
	}
}