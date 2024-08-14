

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Customer c =  new Customer();
		c.setId(1);
		c.setName("John");
		c.setTier(2);
		
		Product p1 = new Product();
		p1.setId(1);
		p1.setName("Mouse");
		p1.setCateory("Toys");
		p1.setPrice(200);
		
		Product p2 = new Product();
		p2.setId(2);
		p2.setName("Key Board");
		p2.setCateory("Toys");
		p2.setPrice(300);
		
		List<Product> plist = new ArrayList<>();
		plist.add(p1);
		plist.add(p2);
	
		Order o = new Order();
		o.setId(1);
		o.setCustomer(c);
		o.setProducts(plist);
		o.setOrderDate(LocalDate.of(2021, 3, 10));
		o.setDeliveryDate(LocalDate.of(2021, 3, 27));
		
		
		List<Order> orders = new ArrayList<>();
		orders.add(o);
		orders.add(o);

		o.getProducts().stream()
		               .filter(p->p.getCateory().equals("books"))
		               .filter(p->p.getPrice()>100)
		               .forEach(System.out::println);


 //Exercise : 4 Solution
		
		/*
		List<Product> result = orders
				  .stream()
				  .filter(or -> or.getCustomer().getTier() == 2)
				  .filter(or -> or.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
				  .filter(or -> or.getDeliveryDate().compareTo(LocalDate.of(2021, 4, 1)) <= 0)
				  .flatMap(or -> or.getProducts().stream())
				  .distinct()
				  .collect(Collectors.toList());
		System.out.println(result);
	*/
	
}
}
