import java.util.*;
public class Latihan2{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int baris,kolom,a=0;
		System.out.print("Masukan Jumlah Baris : ");
		baris = input.nextInt();
		System.out.print("Masukan Jumlah Kolom : ");
		kolom = input.nextInt();
		int bil[][]=new int[baris][kolom];
		int z=baris*kolom;
		int bagi[]=new int[z];
		for(int i=0;i<baris;i++){
			for(int j=0;j<kolom;j++){
				System.out.print("Masukan Bilangan "+i+" "+j+" : ");
				bil[i][j] = input.nextInt();
			}
		}
		for(int i=0;i<baris;i++){
			for(int j=0;j<kolom;j++){
				if(bil[i][j]%3!=0 && bil[i][j]%5!=0){
					bagi[a]=bil[i][j];
					a++;
				}
			}
		}
		for(int i=0;i<a;i++){
			System.out.print(bagi[i]+" ");
		}
	}
}