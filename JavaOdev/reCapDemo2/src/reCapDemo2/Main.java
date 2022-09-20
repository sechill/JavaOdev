package reCapDemo2;

public class Main {

	public static void main(String[] args) {
	
		double[] myList =new double[4];
		double[]myList2= {1.2,1.3,4.3,5.6};
		double total=0;
		double max=myList2[0];
		
		for (double number:myList2) {
			if(max<number) {
				max=number;
			}
			total=total + number;
			System.out.println(number);
		}
		
		System.out.println("Toplam =" + total);
		System.out.println("En Büyük =" + max);

	}

}
