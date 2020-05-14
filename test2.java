import java.util.Scanner;

public class test2{
	public static void main (String[]args){
		Scanner input = new Scanner (System.in);
		int bil, i, j;
		System.out.print ("Masukkan tinggi segitiga : ");
		bil = input.nextInt();
		for (i=bil;i>0;i--){
			for (j=i;j>0;j--){
				System.out.print ("*");
			}
			System.out.println ();
		}
	}
}