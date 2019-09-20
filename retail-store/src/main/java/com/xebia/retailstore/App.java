package com.xebia.retailstore;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.xebia.retailstore.bean.AffiliatedUser;
import com.xebia.retailstore.bean.Customer;
import com.xebia.retailstore.bean.Employee;
import com.xebia.retailstore.bean.Item;
import com.xebia.retailstore.bean.User;
import com.xebia.retailstore.service.BillCalculator;
import com.xebia.retailstore.service.CalculatorService;

/**
 * Main class to run the application.
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
        
       User user1=new Employee(1, "user1", "1234567890", "salesman", new Date());
       User user2=new AffiliatedUser(2, "user2", "1234567891", "DMart", new Date());
       User user3=new Customer(3, "user3", "1234567892", null, "new customer");
       User user4=new Customer(3, "user3", "1234567892", register, "premium");
        
        CalculatorService service=new CalculatorService();
        BillCalculator calc=service.getDiscountApplicable(user1);
        Double sum1=calc.calculate(list,user1);
        System.out.println("Employee Discount = "+sum1);
    	
        calc=service.getDiscountApplicable(user2);
        sum1=calc.calculate(list,user2);
        System.out.println("Affiliated Customer Discount = "+sum1);
        
        calc=service.getDiscountApplicable(user3);
        sum1=calc.calculate(list,user3);
        System.out.println("New Customer discount = "+sum1);
        
        calc=service.getDiscountApplicable(user4);
        sum1=calc.calculate(list,user4);
        System.out.println("Old Customer discount = "+sum1);
    }
}
