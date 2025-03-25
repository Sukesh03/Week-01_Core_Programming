import java.util.Scanner;
public class temperatureConversionToC{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter temp in fahrenheit: ");
		double fahrenheit=scanner.nextDouble();
		double celcius=(fahrenheit-32)*5/9;
		System.out.println("Temperature in celcius: "+celcius);
		scanner.close();
	}
}