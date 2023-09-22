package _06_Console_Store;

import java.util.Scanner;

import _02_Generics_Store.Candy;
import _02_Generics_Store.Cart;
import _02_Generics_Store.Cereal;
import _02_Generics_Store.Clothing;
import _02_Generics_Store.Toy;

public class ConsoleStore {

    /*
     * Write a program that simulates shopping in a store using the Scanner and
     * the classes in Generics_Store.
     * 
     * Note: You may need to modify existing code in Generics Store and/or add
     * additional items and pictures to fulfill all the requirements. You are
     * also free to add any additional methods or classes in Console Store that
     * might be helpful to you.
     * 
     * Requirements:
     * 
     * -Use Ternary operators in place of simple if/else statements and do-while
     * loops instead of while loops where appropriate.
     * 
     * - There should be at least four unique items the user can buy. These can
     * be food items, nonfood items or both.
     * 
     * - The user should have a stipend of money to spend and each item should
     * have its own price.
     * 
     * -The user should have the ability to add items to their cart, remove
     * items, view items or check out.
     * 
     * -The program should continue until the user chooses to check out.
     * 
     * -When the user checks out you should let them know if they do not have
     * enough money to purchase all their items and offer to put items back.
     * 
     * -If the user successfully purchases the items you should remove the
     * amount from their stipend, show them the pictures of what they bought and
     * print out a receipt showing their name, the individual prices of the
     * items and their total.
     */

    public static void main(String[] args) {
    	int money = 50;
    	Scanner s = new Scanner(System.in);
    	boolean checkOut = true;
    	Cart <Item> cart  = new Cart<Item>();
    	
    	
    	 do {
    		 System.out.println("you have $" + money + " to spend");
    		 System.out.println("would you like to add an item, remove an item, view your cart or check out? (add/delete/view/check out)");
    		 String userInput = s.nextLine();
    		 if(userInput.equals("add")) {
        		 System.out.println("which item would you like to add to cart");
        		 userInput = s.nextLine();
        		 cart.add(getObject(userInput));

    		 }else if(userInput.equals("view")) {
    			 cart.showCart();
    		 }
    		 
    		 
    		 checkOut = userInput.equals("Check Out")? false : true;
    		 
    		 
         } while (checkOut);
    	 
    	 ConsoleStore c = new ConsoleStore();
    	 c.checkOut();

    	
    	

    }
    
     static Item getObject(String s) {
    	if(s.equalsIgnoreCase("candy")) {
    		return new Candy();
    	}else if(s.equalsIgnoreCase("cereal")){
    		return new Cereal();
    		
    	}else if(s.equalsIgnoreCase("clothing")){
    		return new Clothing();
    		
    	}else if(s.equalsIgnoreCase("toy")){
    		return new Toy();
    		
    	}else {
    		return null;
    	}
    	
    }
    
     void checkOut() {
    	 
    	
    }

}
