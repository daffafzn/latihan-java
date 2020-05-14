import java.util.Scanner;

public class lataja{
	public static void main (String[]args){
		Scanner input = new Scanner (System.in);
		int bil;
		System.out.print ("Masukkan bilangan : ");
		bil = input.nextInt();
		if (bil>1){
			if (bil%2==1 || bil==2){
				System.out.print (bil+" adalah bilangan prima");
			}
			else
			System.out.print (bil+" bukan bilangan prima");
		}
		else
			System.out.print (bil+" bukan bilangan prima");
	}
}
