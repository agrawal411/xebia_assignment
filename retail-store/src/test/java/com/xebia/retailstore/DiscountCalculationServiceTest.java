package com.xebia.retailstore;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import org.mockito.*;
import com.xebia.retailstore.bean.Customer;
import com.xebia.retailstore.bean.Item;
import com.xebia.retailstore.bean.User;
import com.xebia.retailstore.service.AffiliatedDiscountCalculation;
import com.xebia.retailstore.service.EmployeeDiscountCalculation;
import com.xebia.retailstore.service.CustomerDiscount;

public class DiscountCalculationServiceTest {
	
	
	Item item1 = new Item("Apple",100,"Fruit");
    Item item2 = new Item("Basket",540,"Plastic");
    Item item3 = new Item("Sugar",200,"Grocery");
    Item item4 = new Item("Table",1060,"HouseHold");
	List<Item>  list=Arrays.asList(item1,item2,item3,item4);
	
	 String date="10/10/2013";	
	 User user3=new Customer(3, "user3", "1234567892", null, "new customer");
	 User user4=new Customer(3, "user3", "1234567892", new Date(date), "premium");
	
	@Mock
	User user;
	
	@Test
	public void testEmployeeDiscount() {
		
				
		EmployeeDiscountCalculation em=new EmployeeDiscountCalculation();
		double sum=em.calculate(list,user);
		System.out.println(sum);
		assertEquals(1325.0, sum,1);   
		
	}
	
	@Test
	public void testAffiliatedDiscount() {
		
		AffiliatedDiscountCalculation af=new AffiliatedDiscountCalculation();
		double sum=af.calculate(list,user);
		System.out.println(sum);
		assertEquals(1645.0, sum,1);
	}

	@Test
	public void testYearDiscount() {
		
		CustomerDiscount yb=new CustomerDiscount();
		double sum=yb.calculate(list,user3);
		System.out.println(sum);
		assertEquals(1805.0, sum,1);
	}
	
	@Test
	public void testPerHundredDiscount() {
		
		CustomerDiscount yb=new CustomerDiscount();
		double sum=yb.calculate(list,user4);
		System.out.println(sum);
		assertEquals(1725.0, sum,1);
	}
}
