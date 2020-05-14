import java.util.Scanner;

public class bubbleSort{
	
	public static void main(String[]args){
		int[] data = {6, 4, 3, 2, 1, 10, 11, 15};
		System.out.print ("Nilai sebelum diurutkan : ");
		for (int a: data)
			System.out.print (a+" ");
		
		Bubble(data);
		System.out.println();
		
		System.out.print("Nilai sesudah diurutkan : ");
		for (int a: data)
			System.out.print (a+" ");
		System.out.println();
	}
}
		
		
	
	
			