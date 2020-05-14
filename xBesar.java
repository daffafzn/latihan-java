import java.util.Scanner;

public class xBesar{
	public static void main (String[]args){
		Scanner input = new Scanner (System.in);
		int[][] nilai = new int[100][100];
		int[][] nilai2 = new int[100][100];
		double[][] total = new double [100][100];
		int total = 0;
		int max, min;
		float jumlah=0, rata=0;
		System.out.print ("Masukkan batas : ");
		int batas = input.nextInt();
		for (int i=0;i<batas;i++){
			for (int j=0;j<batas;j++){
				System.out.print ("Masukkan nilai ke dalam array : ");
				nilai[i][j] = input.nextInt();
			}
		}
		for (int i=0;i<batas;i++){
			for (int j=0;j<batas;j++){
				System.out.print ("Masukkan nilai ke dalam array : ");
				nilai2[i][j] = input.nextInt();
			}
		}
		
		
		for (int i=0;i<batas;i++){
			for (int j=0;j<batas;j++){
				total = nilai[i][j]*nilai2[i][j];
				System.out.print (total+" ");
			}
			System.out.println();
		}
		max = total[i][j];
		min = total[i][j];
		for (int i=0;i<batas;i++){
			for (int j=0;j<batas;j++){
				if (total[i][j]>max){
					max = total[i][j];
				}
				else if (total[i][j]<min){
					min = total[i][j];
				}
			}
		}
		for (int i=0;i<batas;i++){
			for (int j=0;j<batas;j++){
				jumlah = jumlah+total[i][j];
				rata = jumlah/batas;
			}
		}
		System.out.println ("===========================");
		System.out.println ("Nilai max = "+max);
		System.out.println ("Nilai min = "+min);
		System.out.println ("rata = "+rata);
	}
}