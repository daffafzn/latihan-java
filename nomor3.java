import java.util.Scanner;

public class nomor3{
	public static void main (String[]args){
		Scanner input = new Scanner (System.in);
		char opsi;
		int a=0, hasil=0, n=0, bil, max=0, min=999999;
		System.out.print ("Mau masukkan lagi y/n");
		opsi = input.next().charAt(0);
		while (opsi=='y'||opsi=='Y'){
		n=n+1;
		System.out.print ("Masukkan bilangan : ");		
		bil = input.nextInt();
		if (bil>max){
			max = bil;
		}
		else if (bil<min){
			min = bil;
		}
		hasil = bil+bil;
		rata = hasil/n;
		}
		System.out.print ("Hasilnya : "+hasil+"\nRata-rata : "+rata);
	}
}
				