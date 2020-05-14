import java.util.Scanner;

public class latihan{
	public static void swap(int[] data, int i, int j){
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	
	public static void Bubble(int[] data){
		for (int i=0;i<data.length;i++){
			for (int j=data.length-1;j>=i;j--){
				if (data[j-1]>data[j]){
					swap(data,j-1,j);
				}
			}
		}
	}
	
	public static void main (String[] args){
		int[] data = {2,5,6,7,8,9,4,5,6,7};
		System.out.print ("Data sebelum diurutkan : ");
		for (int a:data){
			System.out.print (a+" ");
			Bubble(data);
			System.out.println ("");
			System.out.print ("Data sesudah diurutkan : ");
			
		for (int a:data){
			System.out.print (a+" ");
			}
		}
	}
}
		
