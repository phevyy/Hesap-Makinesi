package aa;

import java.util.Scanner;

public class HesapMakinesiSwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sayi1 , sayi2, secim;
		System.out.println("Lütfen birinci sayıyı giriniz");
		sayi1 = scan.nextInt();
		System.out.println("Lütfen ikinci sayıyı giriniz");
		sayi2 = scan.nextInt();
		
		System.out.println("Yapmak istediğiniz işlemi seçiniz");
		System.out.println("1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölme");
		secim = scan.nextInt();
		
		switch(secim) {
		case 1:
			System.out.println("Sonuç = " + (sayi1 + sayi2));
			break;
		case 2:	
			System.out.println("Sonuç = " + (sayi1 - sayi2));
			break;
		case 3:	
			System.out.println("Sonuç = " + (sayi1*sayi2));
			break;
		case 4:	
			System.out.println("Sonuç = " + (sayi1/sayi2));
			break;
				
			
		}
	}

}
