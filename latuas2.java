import java.util.Scanner;

public class latUas2{
	public static void main (String[]args){
		Scanner input = new Scanner (System.in);
		int[] nilai = new int[100];
		int i, max, min;
		float total=0, rata=0;
		System.out.print ("Masukkan batas nilai yang dimasukkan  : ");
		int n = input.nextInt();
		//menginput data ke array
		for (i=0;i<n;i++){
			System.out.print ("Masukkan nilai : ");
			nilai[i] = input.nextInt();
		}
		//mencari nilai max dan min
		max = nilai[0];
		min = nilai[0];
		for (i=0;i<n;i++){
			if (nilai[i]>max){
				max = nilai[i];
			}
			else if (nilai[i]<min){
				min = nilai[i];
			}
		}
		//mencari rata
		for (i=0;i<n;i++){
			total = total+nilai[i];
			rata = total/i;
		}
		System.out.println ("=============================");
		System.out.println ("Nilai max ="+max);
		System.out.println ("Nilai min ="+min);
		System.out.println ("Rata-rata = "+rata);
	}
}