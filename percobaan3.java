import java.util.Scanner;
import static java.lang.Math.*;


public class percobaan3{
	public static void main (String[]args){
		double D, a, b, c, x1, x2;
		Scanner input = new Scanner (System.in);
		System.out.print ("Masukkan nilai a : ");
		a = input.nextDouble();
		System.out.print ("Masukkan nilai b : ");
		b = input.nextDouble();
		System.out.print ("Masukkan nilai c : ");
		c = input.nextDouble();
		D = b*b-4*a*c;
		if (D>0){
			x1 = (-b+sqrt(D))/2*a;
			x2 = (-b-sqrt(D))/2*a;
			System.out.print ("Nilai x1 : "+x1+"Nilai x2 : "+x2);
			}
		else if (D==0){
			x1 = -b/(2*a);
			x2 = x1;
			System.out.print ("Nilai x1 : "+x1+"Nilai x2 : "+x2);
		}
		else if (D<0){
			x1 = (-b/(2*a)+sqrt(abs(D))/(2*a);
			x2 = (-b/(2*a)-sqrt(abs(D))/(2*a);
			System.out.print ("Nilai x1 : "+x1+"Nilai x2 : "+x2);
		}
	}
}

