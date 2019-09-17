package com.xebia.retailstore;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.*;

import com.xebia.retailstore.bean.Customer;
import com.xebia.retailstore.bean.Item;
import com.xebia.retailstore.service.AffiliatedDiscountCalculation;
import com.xebia.retailstore.service.BillCalculator;
import com.xebia.retailstore.service.CalculatorService;
import com.xebia.retailstore.service.DiscountPerHundred;
import com.xebia.retailstore.service.EmployeeDiscountCalculation;
import com.xebia.retailstore.service.YearBaseDiscount;

public class DiscountCalculationServiceTest {
	
	
	Item item1 = new Item("Apple",100,"Fruit");
    Item item2 = new Item("Basket",540,"Plastic");
    Item item3 = new Item("Sugar",200,"Grocery");
    Item item4 = new Item("Table",1060,"HouseHold");
	List<Item>  list=Arrays.asList(item1,item2,item3,item4);
	
	@Mock
	CalculatorService discount;
	
	
	@Test
	public void testEmployeeDiscount() {
		
		//when(discount.getDiscountApplicable(any(Customer.class))).thenReturn(new EmployeeDiscountCalculation());		
		EmployeeDiscountCalculation em=new EmployeeDiscountCalculation();
		double sum=em.calculate(list);
		System.out.println(sum);
		assertEquals(1390.0, sum,1);   
		
	}
	
	@Test
	public void testAffiliatedDiscount() {
		
		AffiliatedDiscountCalculation af=new AffiliatedDiscountCalculation();
		double sum=af.calculate(list);
		System.out.println(sum);
		assertEquals(1730.0, sum,1);
	}

	@Test
	public void testYearDiscount() {
		
		YearBaseDiscount yb=new YearBaseDiscount();
		double sum=yb.calculate(list);
		System.out.println(sum);
		assertEquals(1815.0, sum,1);
	}
	
	@Test
	public void testPerHundredDiscount() {
		
		DiscountPerHundred dph=new DiscountPerHundred();
		double sum=dph.calculate(list);
		System.out.println(sum);
		assertEquals(1805.0, sum,1);
	}
}
