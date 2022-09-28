package methods2;

public class Main {

	//variable argüman ..Ama int... bu yapıda ne gönderildiği belli olmadığından çok kullanılmaz...
	public static void main(String[] args) {
		String mesaj="Bugün hava çok güzel";
		String yeniMesaj=sehirVer();
		System.out.println(yeniMesaj);
		int sayi=topla(15,7);
		System.out.println(sayi);
		int toplam=topla2(2,3,4,5,6,10);
		System.out.println(toplam);
		
		
		//int toplam=topla2();
		//System.out.println(toplam);
		//sonuç 0 gelir yani boş bir array göndermiş gibi oluruz..
		//Aynı hesap makinesini açtığımızda 0 yazması gibi...
	}
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	public static void sil() {
		System.out.println("Silindi");
	}
	public static void guncelle() {
		System.out.println("Güncellendi");
			}
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	public static int topla2(int... sayilar) {//... üç nokta birden fazla değer göndermek demek ,arka planda diziye çeviriyor
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
	public static String sehirVer() {
		return "Ankara";
	}
}
