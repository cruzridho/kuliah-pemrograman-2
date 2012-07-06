import java.util.Scanner;

public class latihan_concat{
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		System.out.println("Masukan huruf/angka pertama : ");
		String string1 = s.nextLine();
		System.out.println("Masukan huruf/angka kedua  : ");
		String string2 = s.nextLine();
		String hasil = string1.concat(string2);
		System.out.println("\nHasil : " +hasil);
			}
		}