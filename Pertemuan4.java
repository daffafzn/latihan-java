import java.util.Scanner;

public class Pertemuan4{
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);
		int nilai;
		System.out.print ("Masukkan nilai anda : ");
		nilai = in.nextInt();
		if (nilai>0&&nilai<=19){
			System.out.print ("Nilai anda adalah E");
			}
		else if(nilai>19&&nilai<=34){
			System.out.print ("Nilai anda adalah D");
			}
		else if(nilai>34&&nilai<=49){
			System.out.print ("Nilai anda adalah C");
			}
		else if(nilai>49&&nilai<=64){
			System.out.print ("Nilai anda adalah BC");
			}
		else if(nilai>64&&nilai<=74){
			System.out.print ("Nilai anda adalah B");
			}
		else if(nilai>74&&nilai<=84){
			System.out.print ("Nilai anda adalah AB");
			}
		else if(nilai>84&&nilai<=100){
			System.out.print ("Nilai anda adalah A");
			}
		else
			System.out.print ("Salah input !");
		}
	}
		