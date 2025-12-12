import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
System.out.println("X1: ");
		int x1=sc.nextInt();
		System.out.println("X2: ");
		int x2=sc.nextInt();
		System.out.println("y1: ");
		int y1=sc.nextInt();
		System.out.println("y2: ");
		int y2=sc.nextInt();
		int dx=(x2-x1);
		int dy=(y2-y1);
			int result=dx*dx+dy*dy;
			Double distance=Math.sqrt (result);
		 System.out.println("The distance of two points: "+distance); 
	}
}
