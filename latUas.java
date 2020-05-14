import java.util.Scanner;

public class prima{
	public static void main (String[]args){
		Scanner input = new Scanner (System.in);
		int[] nilai = new int [100];
		int max, min, batas;
		int i;
		float rata=0, total=0;
		System.out.print ("Masukkan batas : ");
		batas = input.nextInt();
		//inputan nilai oleh user dibatasi
		for (i=0;i<batas;i++){
			System.out.print ("Masukkan inputan nilai : ");
			nilai[i] = input.nextInt();
		}
		//Mencari nilai maksimum dan minimum
		min = nilai[0];
		max = nilai[0];
		for (i=0;i<batas;i++){
			if (nilai[i]>max){
			max = nilai[i];
			}
			else if (nilai[i]<min){
			min = nilai[i];
			}
		}
		//mencari rata-rata
		for (i=0;i<batas;i++){
			total = total + nilai[i];
			rata = total/i;
		}
		System.out.println ("------------------------");
		System.out.println ("Nilai max = "+max);
		System.out.println ("Nilai min = "+min);
		System.out.println ("Rata-rata = "+rata);
	}
}
		
		
		