
public class CustomerManager {
	public void Add(Customer customer) {
		System.out.println(customer.customerNumber + " no'lu m�steri kaydedilmistir.");
		
	}
	public void addMultiple(Customer[] customers) {
		for(Customer customer: customers) {
			Add(customer);
		}
	}
}
