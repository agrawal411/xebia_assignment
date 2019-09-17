package com.xebia.retailstore;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.xebia.retailstore.bean.Customer;
import com.xebia.retailstore.bean.Item;
import com.xebia.retailstore.service.BillCalculator;
import com.xebia.retailstore.service.CalculatorService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Item item1 = new Item("Apple",100,"Fruit");
        Item item2 = new Item("Basket",540,"HouseHold");
        Item item3 = new Item("Sugar",200,"Grocery");
        Item item4 = new Item("Table",1060,"HouseHold");
        
        List<Item> list=new ArrayList<>();
        list.add(item1);
        list.add(item2);
        list.add(item3);
        list.add(item4);
        
        String date="10/10/2013";
        SimpleDateFormat sd=new SimpleDateFormat("dd/mm/yyyy");
        Date register=null;
		try {
			register = sd.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
        
        Customer cust1=new Customer("Ankit1", "1234567890", null , true, false);
        Customer cust2=new Customer("Ankit2", "1234567891", null , false, true);
        Customer cust3=new Customer("Ankit3", "1234567892", register , false, false);
        Customer cust4=new Customer("Ankit4", "1234567893", null , false, false);
        
        CalculatorService service=new CalculatorService();
        BillCalculator calc=service.getDiscountApplicable(cust1);
        Double sum1=calc.calculate(list);
        System.out.println("Employee Discount = "+sum1);
    	
        calc=service.getDiscountApplicable(cust2);
        sum1=calc.calculate(list);
        System.out.println("Affiliated Customer Discount = "+sum1);
        
        calc=service.getDiscountApplicable(cust3);
        sum1=calc.calculate(list);
        System.out.println("2 Years Old customer Discount = "+sum1);
        
        calc=service.getDiscountApplicable(cust4);
        sum1=calc.calculate(list);
        System.out.println("Discount Per Hundred Dollar = "+sum1);
    }
}
