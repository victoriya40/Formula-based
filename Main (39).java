import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Radius: ");
		int r=sc.nextInt();
		System.out.println("height: ");
		int h=sc.nextInt();
		 Double result1=2*(3.14*r*(h+r));
		 Double result2=3.14*r*r*h;
		 System.out.println("Surface area of Cylinder: "+result1); 
		 System.out.println("volume of Cylinder: "+result2);
	}
}
