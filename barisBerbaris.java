import java.util.Scanner;

public class barisBerbaris{
	public static void main (String[]args){
		Scanner input = new Scanner (System.in);
		int baris1, baris2, max, i, sisa, hsl, max2;
		System.out.print ("Masukkan Jumlah Siswa Baris Pertama : ");
		baris1 = input.nextInt();
		System.out.print ("Masukkan Jumlah Siswa Baris ke dua : ");
		baris2 = input.nextInt();
		System.out.print ("Maksimal siswa per baris : ");
		max = input.nextInt();
		System.out.println ("No\tJumlah\tMaksimal\tSisa");
		for (i=1;i<=5;i++){
			if (baris1%max!=0){
				hsl=baris1/max;
				max2=max*hsl;
				sisa=32-baris1;
				System.out.println (i+"\t"+baris1+"\t" +max2+"\t\t" +sisa);
				}
			}
		}
	}