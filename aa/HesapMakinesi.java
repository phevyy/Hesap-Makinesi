package aa;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sayi1 , sayi2 , secim;
		System.out.println("İlk sayıyı giriniz");
		sayi1 = scan.nextInt();
		System.out.println("İkinci sayıyı giriniz");
		sayi2 = scan.nextInt();
		System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
		System.out.println("1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölme");
		System.out.println("Seçiminiz : ");
		secim = scan.nextInt();
		
		if (secim ==1) {
			System.out.println("Sonuç = " + (sayi1 + sayi2));
		}else if (secim ==2) {
			System.out.println("Sonuç = " + (sayi1 - sayi2));	
		}else if (secim==3) {
			System.out.println("Sonuç = " + (sayi1*sayi2));
		}else if(secim==4) {
			if (sayi2==0) {
				System.out.println("İkinci sayı sıfıra eşit olamaz");
			}else {
			System.out.println("Sonuç = " + (sayi1/sayi2));
			}
		}else {
			System.out.println("Geçersiz bir işlem girdiniz tekrar deneyiniz");
		}
		
		
	}

}
