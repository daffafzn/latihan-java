import java.util.Scanner;

public class trythis{
	public static void main (String[]args){
	
		System.out.println ("Klik n pada keyboard untuk next/selanjutnya");
			Scanner input = new Scanner (System.in);
			char t, ya, haqu;
			int n=1, y=2, next=3;
			System.out.print ("\nme : haqu");
			next = input.next().charAt(0);
			System.out.print ("\nyou : iya");
			next = input.next().charAt(0);
			System.out.print ("\nme : aku mau ngajak km nntn di bioskop jujur to the point dr \ndulu aku suka sm km tp klo km g bs gpp aku gk maksa kok y/n : ");
			haqu = input.next().charAt(0);
			if (haqu==1){
				System.out.println ("you : boleh mau nontn apa sm kapan");
				next = input.next().charAt(0);		
				System.out.println ("me : malem minggu nnt aku jemput dkt sc kita nonton avengers end of game");
				next = input.next().charAt(0);			
				System.out.println ("you : oke");
				next = input.next().charAt(0);			
				System.out.println ("me : makasih yaa pokoknya bahagia aku ada dikamu wkw");
				next = input.next().charAt(0);			
				System.out.println ("you : sama-sama..");
			}
			else if (haqu==2){
				System.out.println ("you : maaf yaa gabisa..");
				System.out.println ("me : oh iya gpp kok :D ");
				System.out.println ("me : makasih udh mau jawab");
			}
			else
				System.out.println ("System : Maaf kamu salah input coba dengan y = untuk ya, n = buat no");
		}
	}