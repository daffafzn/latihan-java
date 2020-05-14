import java.util.*;
public class ArrayLat1{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("Masukan Jumlah Baris (1-10): ");
		n = input.nextInt();
		int bil[][]=new int [n][3];
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
				System.out.print("Masukan Bilangan "+i+" "+j+" : ");
				bil[i][j] = input.nextInt();
			}
		}
		System.out.println("Masukan Awal");
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
				System.out.print(bil[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
				if(bil[i][j]%2==0){
					bil[i][j]=bil[i][j]*2;
				}else{
					bil[i][j]=bil[i][j]*3;
				}
			}
		}
		System.out.println("Hasil Setelah Dirubah");
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
				System.out.print(bil[i][j]+" ");
			}
			System.out.println();
		}
	}
}
