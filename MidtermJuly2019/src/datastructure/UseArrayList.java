package datastructure;

import javafx.css.StyleableStringProperty;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
       ArrayList<String> myLocation = new ArrayList<String>();
       	myLocation.add("Brooklyn");
		myLocation.add("Queens");
		myLocation.add("Manhattan");
		myLocation.add("Staten Island");
		myLocation.add("Bronx");
		myLocation.add("Newark");
		for(String location : myLocation){
			System.out.println(location);
		}
		System.out.println("Last index value is:"+myLocation.get(myLocation.size()-1));

		while (!myLocation.isEmpty()){
			System.out.println(myLocation);
			myLocation.remove(myLocation.size()-1);
		}
	}

}
