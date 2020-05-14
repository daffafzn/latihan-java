import java.util.*;
import java.util.Scanner;

public class Uas1{
	
	public static void swap(int[] data,int i,int j){
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
		
    public static int binarySrc(int data[], int pertama, int akhir, int kunci){
        if (akhir>=pertama){  
            int tengah = pertama + (akhir - pertama)/2;  
            if (data[tengah] == kunci){  
            return tengah;  
            }  
            if (data[tengah] > kunci){  
            return binarySrc(data, pertama, tengah-1, kunci); 
            }
			else{  
            return binarySrc(data, tengah+1, akhir, kunci); 
            }  
        }  
        return -1;
	}

	public static void bubble(int[] data){
		int i, j, temp;
	for (i=1;i<data.length;i++){
		temp = data[i];
		for (j=i-1; (j>=0)&&(data[j]<temp); j--)
			data[j+1] = data[j];
		data[j+1] = temp;
	}
	}
	
    public static void main(String args[]){ 
		Scanner in=new Scanner(System.in);
		int kunci;
		int kali;

		System.out.println("ingin berapa kali masukan angka?");
		kali=in.nextInt();
		int data[]=new int[kali];
		int akhir=data.length-1;  
		for(int i=0;i<kali;i++){
			System.out.println("masukan angka : ");
			data[i]=in.nextInt();
		}
		bubble(data);
		System.out.print ("data sesudah diurutkan : ");
		for (int a:data){
			System.out.print (a+" ");
		}
		System.out.println("Bilangan yang dicari ?");
		kunci=in.nextInt();
		
		int hasil = binarySrc(data,0,akhir,kunci);
		
		
        if (hasil == -1)  
            System.out.println("Data nihil");  
        else  
            System.out.println("data ditemukan di index: "+hasil);  
    }  
}  
