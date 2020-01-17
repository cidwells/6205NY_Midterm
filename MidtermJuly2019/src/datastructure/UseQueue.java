package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> myQueue = new LinkedList<String>();
		myQueue.add("Sun");
		myQueue.add("Mercury");
		myQueue.add("Venus");
		myQueue.add("Earth");
		myQueue.add("Mars");
		myQueue.add("Jupiter");
		myQueue.add("Saturn");
		myQueue.add("Neptune");
		myQueue.add("Uranus");
		myQueue.add("Pluto");
		if(myQueue!= null){
			System.out.println("\nThe first celestial body is the " + myQueue.peek());

		}
		System.out.println("\nRemoving the first celestial object");
		System.out.println("The "+ myQueue.poll() + " has been removed \n");
		Iterator myIterator = myQueue.iterator();
		while (myIterator.hasNext()){
			System.out.println(myIterator.next());
		}
		System.out.println("\nRemoving any non-planetary object ");
		myQueue.remove("Pluto");
		System.out.println("\nPlanets of the solar system");
		for (String planets : myQueue){
			System.out.println(planets);
		}

	}

}
