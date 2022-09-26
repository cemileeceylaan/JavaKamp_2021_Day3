
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		IndividualCustomer cemile= new IndividualCustomer();
		cemile.customerNumber="123";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber="456";
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add(hepsiBurada);
		
		customerManager.Add(cemile);
		
		SendikaCustomer egitimsen= new SendikaCustomer();
		egitimsen.customerNumber="789";
		customerManager.Add(egitimsen);
		
		System.out.println("---- Array ile yazdýrýldý----");
		
		Customer[] customers = {cemile,hepsiBurada,egitimsen};
		customerManager.addMultiple(customers);
		
		
	}

}
