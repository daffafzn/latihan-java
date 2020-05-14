java.util.Scanner;

public class haqu{
	public static void main (String[]args){
		Scanner input = new Scanner (System.in);
		char opsi, jwb;
		System.out.print ("Haqu kamu mau gk aku ajak nonton avenger end game ? y/n");
		opsi = input.next().charAt(0);
		if (opsi=='y'){
			System.out.print ("Okey km bisanya kapan :) : ");
			jwb = input.next().charAt(0);
			System.out.print 