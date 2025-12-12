import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Fahrenheit: ");
		int f=sc.nextInt();
		 Double result=(f-32)*0.5/0.9;
		 System.out.println("Fahrenheit to celsius: "+result); 
	}
}
