package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer ayd�n = new IndividualCustomer();
		ayd�n.customerNumber ="12315";
		
		
		
		CorporateCustomer hepsiburada = new CorporateCustomer();
		hepsiburada.customerNumber ="9887";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "9999";
		
		BiseyCustomer bisey = new BiseyCustomer();
		bisey.customerNumber= "5646544";
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(abc);
		customerManager.add(ayd�n);
		customerManager.add(hepsiburada);
		customerManager.add(bisey);
		
	}
}
