package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) throws IOException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir")+"/src/data/self-driving-car";
		FileReader fr = null;
		BufferedReader br = null;
		String line;
		String store = "";

		try{
			fr = new FileReader(textFile);


		}catch(Exception e){
			System.out.println("Could not find file ");
		}

		try{
			br = new BufferedReader(fr);
			while((line =br.readLine())!= null){
				System.out.println(line);
				store+= line;

			}
		}catch(Exception e){
			System.out.println("Cannot read file ");
		}

		String[] storeArray = store.split(" ");

		Stack<String> myStack = new Stack<String>();
		List<String> myList = new LinkedList<String>();
		for(String element : storeArray){
			myStack.push(element);
		}
		for (String element : storeArray){
			myList.add(element);
		}
		System.out.println("***The LinkedList LIFO****\n");
		Iterator<String> it = myList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("\n*****The Stack  LIFO****\n");

		while(!myStack.isEmpty()){
			System.out.print("peek: ");
			System.out.println(myStack.peek());
			System.out.print("pop: ");
			System.out.println(myStack.pop());
		}


	}

}
