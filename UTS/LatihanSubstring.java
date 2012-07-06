import java.util.Scanner;

public class LatihanSubstring{
	public static void main(String[] args){
	
	Scanner s = new Scanner(System.in);
		System.out.println("Masukkan kalimat : ");
		String string1 = s.nextLine();

	String substring = string1.substring(4);
		System.out.println("Kalimat setelah string ke-4: " + substring); 
	
	substring = string1.substring(2, 5);
		System.out.println("Kalimat diantara string ke-2 dan ke-5: " + substring);
	}
}