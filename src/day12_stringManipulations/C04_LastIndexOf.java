package day12_stringManipulations;

import java.util.Scanner;

public class C04_LastIndexOf {

	public static void main(String[] args) {
		

		// Soru 1) Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup
				// olmadigini yazdirin
				
				
			Scanner scan=new Scanner(System.in);
				
			System.out.println("Lutfen bir cumle giriniz");
				
			String cumle=scan.nextLine();
				
			System.out.println("lutfen varligini kotrol etmek icin bir harf giriniz");
				
			char krk=scan.next().charAt(0);
			
			int index=cumle.lastIndexOf(krk);
			
			
			if (index== (-1)) {
				System.out.println("Harf cumlede kullanilmamis");
			} else {
                System.out.println("Harf cumlede kullanilmis");
			}
		
		
	}

}
