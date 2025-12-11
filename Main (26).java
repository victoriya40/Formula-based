import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Length: ");
		int l=sc.nextInt();
		System.out.println("Breath: ");
		int b=sc.nextInt();
		int result=(l*b);
		System.out.println("Area of the rectangle: "+result);
	}
}