package oop1;

public class Product {
	//ilerde sadece okunabilir yada sadece yazılabilir olabilmesi için başlarına private yazıyoruz..
	//private sadece o classın içinde kullanılabilir demek..
	private String name;  //field-alan...camelCase
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unitsInStock;
	
	//boşlukta sağ tık > source > generic getter setter oto oluşturuyor...
	public String getName() {  // get okumak için
		return name;
	}
	public void setName(String name) { //set yazmak için
		this.name = name;
	}
	
	//UnitPrice sadece okunacak dediğinde yönetici, set metodunu sileriz
	//discountu okurken yani mevcutta 5 görünüyor indirim sepette bir 5 daha indiriyoruz,get metodunda
	//ama bu kullanımlar eski yöntemdir artık böyle yapmıyoruz..Ama yinede kullandığımız senaryolar var..
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}


}
