package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class GroceryStore {

	public static void main(String[] args) {
		// Project goal: Creating a local Kroger:
		// The Christa Kroger, prices are decent but she's not lol
		// Use Map: Key is Name, Value is Price
		// Shopping cart is List of what they ordered
		// Print out what they ordered so far
		// Print out average price - good luck bro!

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

		for (Map.Entry<String, Double> entry : krogers.entrySet()) {
			// krogers and <String,Double> is the only things that change in this loop
			System.out.println("" + entry.getKey() + "   $" + entry.getValue());
		}

		// user picks items

		Scanner scnr = new Scanner(System.in);
		List<String> carts = new ArrayList<>();
		List<Double> price = new ArrayList<>();
		boolean isContinue; // string ==y declaring a variable to is continue.
		do {
			System.out.println("What would you like to add?");
			String cart = scnr.nextLine();
			carts.add(cart);
			price.add(krogers.get(cart));
			// price.add(cart);
			// plural is on the left side and singular is on the right for both list and set
			// thingsSet.add(thing);// set

			if (krogers.get(cart) == null) {
				System.out.println("That item is not available at this time, please try again");
			} else {
				System.out.println("Item added.");
			}

			System.out.println("Do you want to add another (y/n)");
			isContinue = scnr.nextLine().toLowerCase().startsWith("y");
		} while (isContinue == true); // then place the variable here string variable "y"

		System.out.println("List " + carts);

		System.out.println("Price " + price);
		// System.out.println(krogers(carts-1);
	}

	private static String greet()// doesn't always have to have a parameter!
	{
		return "Welcome to Christa's Kroger!\nTake a look at our store and add items to your shopping cart as needed. "
				+ "\n" + "Items  " + " Price" + "\n" + "=====" + "   " + "=====";
		// formating is shotty but it works :-/
		// start writing the return first, or thinking of what you want the return to
		// be.
		// then think of what you want to name the method, ex: 'greet'
		// to call the method in the main, you put in an empty set of () after the name
		// to call the method.
	}

}
