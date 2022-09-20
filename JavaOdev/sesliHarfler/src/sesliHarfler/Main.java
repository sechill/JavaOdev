package sesliHarfler;

public class Main {

	public static void main(String[] args) {

		char harf = 'A';

		switch (harf) {
		case 'A':
		case 'B':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf girdiniz");
		default:
			System.out.println("İnce sesli harf girdiniz");
		}

//		char[] inceSesli = { 'e', 'i', 'ö', 'ü', 'E', 'İ', 'Ö', 'Ü' };
//		char[] kalinSesli = { 'a', 'o', 'u', 'ı', 'A', 'O', 'U', 'I' };
//		String birlesikDizi = "eiöüEİÖÜaouıAOUI";
//		int ayir = 0;
//
//		for (char birles : birlesikDizi.toCharArray()) {
//			if (harf != birles) {
//				ayir++;
//			}
//		}
//
//		if (ayir == 16) {
//			System.out.println("Lütfen sesli harf giriniz");
//			return;
//		}
//
//		for (int i = 0; i < inceSesli.length; i++) {
//
//			if (harf == inceSesli[i]) {
//				System.out.println("Harf ince seslidir.");
//			}
//		}
//
//		for (int i = 0; i < kalinSesli.length; i++) {
//			if (harf == kalinSesli[i]) {
//				System.out.println("Harf kalın seslidir.");
//			}
//		}
	}
}
