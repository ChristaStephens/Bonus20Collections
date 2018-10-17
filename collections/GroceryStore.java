package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GroceryStore {
	
	public static void main(String[] args) {
		//Project goal: Creating a locale Kroger
		//use map: key is name, value is price
		//shopping cart is list of what they ordered
		//print out what they ordered so far
		//print out average price
		
		System.out.println(greet());
		
		Map<String, Double> krogers = new HashMap<>();
		krogers.put("apple", .99);
		krogers.put("pineapple", 4.99);
		krogers.put("chia seed", 5.45);
		krogers.put("lettuce", 2.25);
		krogers.put("tea", 3.45);
		krogers.put("turkey meat", 3.89);
		krogers.put("pull ups", 8.99);
		krogers.put("diaper wipes", 5.99);
		krogers.put("granola", 6.08);
		krogers.put("salsa", 3.55);
		krogers.put("egg noodles", .89);
		krogers.put("bananas", 1.49);
		
		//System.out.println(krogers + "   "  );
		for (Map.Entry<String, Double> entry : krogers.entrySet()) {
		    System.out.println("Items:  " + entry.getKey() + ":   $" + entry.getValue());
		}
		
		//System.out.println(krogers); //menu works
		
		//System.out.println("Welcome to Christa's Kroger!");
		//System.out.println("Take a look at our store and add items to your shopping cart as needed.");
		
	}
	private static String greet()//doesn't always have to have a parameter!
	{
		return "Welcome to Christa's Kroger!\nTake a look at our store and add items to your shopping cart as needed";
		// start writing the return first, or thinking of what you want the return to be.
		//then think of what you want to name the method, ex: 'greet'
		//to call the method in the main, you put in an empty set of () after the name to call the method.
	}
}
