import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Radius: ");
	    int r=sc.nextInt();
	    Double result1=4*3.14*r*r;
	    Double result2=4/3*3.14*r*r*r;
	    System.out.println("Surface area of sphere: "+result1);
	   System.out.println("Volume of sphere: "+result2);
}
}
