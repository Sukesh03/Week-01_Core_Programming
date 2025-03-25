public class programfive{
	public static void main(String[] args){
		int pens=14,students=3;
		int penperstudent=pens/students;
		int remainingPen=pens%students;
		System.out.println("Pen per student: "+penperstudent+" undistributed pens: "+remainingPen);
	}
}		