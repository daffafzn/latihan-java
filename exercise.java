import java.util.Scanner;

public class exercise{
	public static void main (String[]args){
		Scanner input = new Scanner (System.in);
		int n, hasil, bil;
		System.out.print ("Masukkan nilai n : ");
		n = input.nextInt();
		for (int i=2;i<=n;i=i+2){
			System.out.print ("Masukkan bilangan : ");
			bil = input.nextInt();
			hasil = bil+bil;
			}
		System.out.print ("Hasilnya : "+hasil);
		}
	}
