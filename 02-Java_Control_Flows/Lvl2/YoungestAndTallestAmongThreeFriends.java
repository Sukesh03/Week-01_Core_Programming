import java.util.Scanner;
public class YoungestAndTallestAmongThreeFriends {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double ama,amh,aka,akh,ana,anh;
		System.out.print("Enter amar age: ");
		ama=input.nextDouble();
		System.out.print("Enter amar height: ");
		amh=input.nextDouble();
		System.out.print("Enter akbar age: ");
		aka=input.nextDouble();
		System.out.print("Enter akbar height: ");
		akh=input.nextDouble();
		System.out.print("Enter anthony age: ");
		ana=input.nextDouble();
		System.out.print("Enter anthony height: ");
		anh=input.nextDouble();
		String tall="",young="";
		if (ama<aka && ama<ana){
			young="Amar";
		}
		else if (aka<ana){
			young="Akbar";
		}
		else if (ana<aka){
			young="Anthony";
		}
		if (amh>akh && amh>anh){
			tall="Amar";
		}
		else if (akh>anh){
			tall="Akbar";
		}
		else if (anh>akh){
			tall="Anthony";
		}
		System.out.println("Youngest: "+young+"\nTallest: "+tall);
	}
}