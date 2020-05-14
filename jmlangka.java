import java.util.Scanner;

public class jmlangka{
	public static void main (String[]args){
		Scanner input = new Scanner (System.in);
		char opsi;
		int a=0, hasil=0, n=0, bil;
		System.out.print ("Mau masukkan lagi y/n");
		opsi = input.next().charAt(0);
		while (opsi=='y'||opsi=='Y'){
		n=n+1;
		System.out.print ("Masukkan bilangan : ");		
		bil = input.nextInt();
		break;
		hasil = bil+bil;
		}
		System.out.print ("Hasilnya : "+hasil);
	}
}
				