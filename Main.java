package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer aydýn = new IndividualCustomer();
		aydýn.customerNumber ="12315";
		
		
		
		CorporateCustomer hepsiburada = new CorporateCustomer();
		hepsiburada.customerNumber ="9887";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "9999";
		
		BiseyCustomer bisey = new BiseyCustomer();
		bisey.customerNumber= "5646544";
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(abc);
		customerManager.add(aydýn);
		customerManager.add(hepsiburada);
		customerManager.add(bisey);
		
	}
}
