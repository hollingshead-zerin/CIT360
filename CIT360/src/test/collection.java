package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.*;


public class collection {

	public static void main(String a[]) {
		
		//create a list called collectList
		List<String> collectList = new ArrayList<String>();
		collectList.add("Java");
		collectList.add("Unix");
		
		//create an itorator that will go through the values in list
		Iterator<String> ir = collectList.iterator();
		 while(ir.hasNext()){
	            System.out.println(ir.next());
	        }
	
		 System.out.println();
		 
		 
		 //create hashset that contains names 
		 Set<String> hashSet = new HashSet<>();
		 
		 //add values to the set
		 hashSet.add("Zerin");
		 hashSet.add("Rachel");
		 hashSet.add("Sam");
		 
		 //print the set
		 System.out.println(hashSet);
		 
		 //hashSet.first();
		 
		 
		//create a treeset with the same names to show difference
		TreeSet<String> treeSet = new TreeSet<String>();
		
		//treeSet.add(null);
		treeSet.add("Zerin");
		treeSet.add("Rachel");
		treeSet.add("Sam");
		//tree set will not add a duplicate 
		treeSet.add("Sam");
		//find the size of tree set in length
		int treeSize = treeSet.size();
		//will print out set in sorted order. not order that was inserted.
		System.out.println(treeSet);
		System.out.println(treeSize);
		
		//print first in the set
		System.out.println(treeSet.first());
		
		System.out.println();
		
		//create a map (similar to hashtable) where a key is mapped to a value
		Map<Integer, String> mapTable = new HashMap<>();
		
		//add key, value to the table.
		mapTable.put(400, "Bad Request");
		mapTable.put(404, "not Found");
		mapTable.put(501, "Not Authorized");
		mapTable.put(405, "Internal Error");
		
		//check for a value and print the text
		if(mapTable.containsValue("Internal Error")) {
			System.out.println("Found Internal Error");
		}
	    
		if(mapTable.containsKey(400)) {
	    	System.out.println("400: Bad Request");
	    
	    	System.out.println(mapTable);
		}
		
	    System.out.println();
	    
	    //source: https://www.geeksforgeeks.org/queue-interface-java/
	    
	    //create new queue
	    Queue<Integer> q = new LinkedList<>();
	    
	    q.add(0);
	    q.add(10);
	    q.add(20);
	    q.add(30);
	    q.add(40);
	    
	    System.out.println("Whats in the Queue -:" + q);
	    //remove and item and show that removal
	    int rem = q.remove();
	    System.out.println("removed element-" + rem);
	    
	    System.out.println(q);
	    //check to see the next item.
	    int head = q.peek();
	    System.out.println("head of queue-" + head);
	    //check the size of the queue
	    int sz = q.size();
	    System.out.println("Size of queue-" + sz);
	   
	    
	    
	}
	
}


     