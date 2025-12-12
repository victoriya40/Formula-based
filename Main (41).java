import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Celsius: ");
		int c=sc.nextInt();
		 double result=c*(0.9/0.5)+32;
		 System.out.println("Celsius to Fahrenheit: "+result); 
	}
}
