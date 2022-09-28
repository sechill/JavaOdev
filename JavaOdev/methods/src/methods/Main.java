package methods;

public class Main {

	public static void main(String[] args) {  //metod=fonksiyon=operasyon

		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 9;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (aranacak == sayi) {
				varMi = true;
				break;
			}
		}

		String mesaj = " ";
		if (varMi) {
			mesaj = " sayı mevcuttur." + aranacak;
			mesajVer(mesaj);

		} else {
			mesajVer(" sayı mevcut değildir." + aranacak);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
