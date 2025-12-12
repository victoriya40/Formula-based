import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Length: ");
		int l=sc.nextInt();
		System.out.println("Breath: ");
		int b=sc.nextInt();
		System.out.println("height: ");
		int h=sc.nextInt();
		 int result1=2*((l*b)+(b*h)+(h*l));
		 int result2=l+b+h;
		 System.out.println("Surface area of cuboid: "+result1); 
		 System.out.println("volume of cuboid: "+result2);
	}
}
