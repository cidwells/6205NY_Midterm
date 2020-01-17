package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		ArrayList<String>mainCourse = new ArrayList<String>();
		mainCourse.add("Steak");
		mainCourse.add("Salmon");
		mainCourse.add("Drunken Noodle");
		mainCourse.add("Pho");

		ArrayList<String>appetizer= new ArrayList<String>();
		appetizer.add("Spring rolls");
		appetizer.add("Shrimp dumplings");
		appetizer.add("Sweet potato fries");
		appetizer.add("Samosa");

		ArrayList<String>drink = new ArrayList<String>();
		drink.add("Coke");
		drink.add("Pina Coloda");
		drink.add("Borhani");
		drink.add("Lache");

		HashMap<String, List<String>> mapList = new HashMap<String, List<String>>();

		mapList.put("Main Course", mainCourse);
		mapList.put("Appetizer", appetizer);
		mapList.put("Drink", drink);

		for (Map.Entry<String,List<String>> hm : mapList.entrySet()){
			System.out.println( hm.getKey()+ "--------------"+hm.getValue());
		}
		System.out.println(" ");
		Set set = mapList.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}

	}

}
