import java.util.Scanner;

public class hurufx{
	public static void main (String[]args){
		Scanner input = new Scanner (System.in);
		char kar;
		System.out.print ("Masukkan Karakter : ");
		kar = input.next().charAt(0);
		while (kar!='X'){
			System.out.print ("Masukkan karakter : ");
			kar = input.next().charAt(0);
		}
		
	}
}