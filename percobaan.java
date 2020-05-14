import java.util.Scanner;

public class percobaan{
	public static void main (String[]args){
		Scanner input = new Scanner (System.in);
		char pil;
		System.out.print ("Masukkan Nama anda : ?");
		pil = input.next().charAt(0);
		System.out.println ("Nama : "+pil);
	}
}