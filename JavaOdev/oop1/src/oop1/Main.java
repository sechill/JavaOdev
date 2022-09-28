package oop1;

public class Main {

	public static void main(String[] args) {
		// String mesaj="Vade oranı"; ....set işlemi

		Product product1 = new Product();
		// set value - değer atamak,ayarlamak
		
		
		/*product1.name = "Delonghi Kahve Makinesi";
		product1.unitPrice = 7500;
		product1.discount = 7;
		product1.unitsInStock = 3;
		product1.imageUrl = "bilmemne1.jpg";*/
		
		//fieldları private yaptıktan sonra yukarda ki kod patlar artık aşağıda ki gibi yazarız..
		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitsInStock(3);
		product1.setImageUrl("bilmemne1.jpg");
		
		
		// get - okumak
		//System.out.println(product1.name);

		Product product2 = new Product();
		
	/*	product2.name = "Smeg Kahve Makinesi";
		product2.unitPrice = 7500;
		product2.discount = 8;
		product2.unitsInStock = 2;
		product2.imageUrl = "bilmemne2.jpg";*/
		
		product2.setName("Smeg Kahve Makinesi");
		product2.setUnitPrice(7500);
		product2.setDiscount(7);
		product2.setUnitsInStock(3);
		product2.setImageUrl("bilmemne1.jpg");

		Product product3 = new Product();

		/*product3.name = "Kitchen Kahve Makinesi";
		product3.unitPrice = 7500;
		product3.discount = 9;
		product3.unitsInStock = 4;
		product3.imageUrl = "bilmemne3.jpg";*/
		
		product3.setName("Kitchen Kahve Makinesi");
		product3.setUnitPrice(7500);
		product3.setDiscount(7);
		product3.setUnitsInStock(3);
		product3.setImageUrl("bilmemne1.jpg");
		
		Product [] products= {product1,product2,product3};
		
		/*System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" +product.name+ "</li>");
		}
		System.out.println("</ul>");*/
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" +product.getName()+ "</li>");
		}
		System.out.println("</ul>");
		
		//kodu çalıştır, çıktıyı kopyala,text belgesine yapıştır,uzantıyı html yap...
		
		
		IndividualCustomer individualCustomer=new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("4645445");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demirog");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("kodlamaio");
		corporateCustomer.setPhone("53654364354");
		corporateCustomer.setTextNumber("jhkhkıh");
		corporateCustomer.setCustomerNumber("563");
		
		
		Customer [] customers= {individualCustomer,corporateCustomer};
		

	}

}
