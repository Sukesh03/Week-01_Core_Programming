import java.util.Scanner;
public class BMICalculationAndStoringInTwoDimensionalArray {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number of ppl: ");
		int n=input.nextInt();
		double[][] pd=new double[n][3];
		String ws[]=new String[n];
		for (int i=0;i<n;i++){
			double height;
            do {
                System.out.print("Enter height (cm, positive value): ");
                height = input.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be a positive value.");
                }
            } while (height <= 0);
            pd[i][0] = height / 100; // Convert cm to meters

            // Get valid weight
            double weight;
            do {
                System.out.print("Enter weight (kg, positive value): ");
                weight = input.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be a positive value.");
                }
            } while (weight <= 0);
            pd[i][1] = weight;
			pd[i][2]=pd[i][1]/(pd[i][0]*pd[i][0]);
			if (pd[i][2]<=18.4){
				ws[i]="Underweight";
			}
			else if (pd[i][2]>=18.5 && pd[i][2]<25){
				ws[i]="Normal";
			}
			else if (pd[i][2]>=25 && pd[i][2]<40){
				ws[i]="Overweight";
			}
			else{
				ws[i]="Obese";
			} 
		}
		for (int i=0;i<n;i++){
			System.out.print("Height: "+pd[i][0]);
			System.out.print("Weight: "+pd[i][1]);
			System.out.print("BMI: "+pd[i][2]);
			System.out.println("Weight Status: "+ws[i]);
		}
	}
}