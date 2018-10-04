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
		collectList.add("Javascript");
		collectList.add("C++");
		collectList.add("Powershell");
		collectList.add("Bash");
		collectList.add("Python");
		collectList.add("PLSQL");
		
		//create an iterator that will go through the values in list
		Iterator<String> ir = collectList.iterator();
		 while(ir.hasNext()){
	            System.out.println(ir.next());
	        }
		 System.out.println(collectList.size());
		
		 
		 System.out.println();
		 
//*****************************************************************
		 //create hashset that contains names 
		 Set<String> hashSet = new HashSet<>();
		 
		 //add values to the set
		 hashSet.add("Zerin");
		 hashSet.add("Rachel");
		 hashSet.add("Sam");
		 hashSet.add("Sam");
		 //print the set
		 System.out.println(hashSet);
		 
		 hashSet.add("Adam");
		
		
		 //hash set is not ordered, but 
		 System.out.println(hashSet);
		 System.out.println(hashSet.size());
		 
		 hashSet.clear();
		 System.out.println();
		 
//**********************************************************************		 
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
		
		treeSet.add("Adam");
		System.out.println(treeSet);
		System.out.println(treeSize);
		//print first in the set
		System.out.println(treeSet.first());
		
		treeSet.clear();
		
		
		System.out.println();

		
//***************************************************************************
		//create a map (similar to hashtable) where a key is mapped to a value
		Map<String, Integer> carMap = new HashMap<>();
		
		//add key, value to the map
		carMap.put("Audi",5);
		carMap.put("Ford", 10);
		carMap.put("Toyota", 8);
		carMap.put("Chevrolet", 12);
		carMap.put("Honda", 7);
		carMap.put("Buick", 4);
		carMap.put("Mazda", 4);
		carMap.put("BMW", 6);
		carMap.put("Mercedes", 2);
		
		//print out the hashMap
		System.out.println(carMap);
		System.out.println("Total Vehicle Types: " + carMap.size());
		//loop through all the keys and out put the value of that key in a sentance structrue
		 for(String key: carMap.keySet())
			 System.out.println("Found " + carMap.get(key) + " " + key + " cars in the Lot.");
		 
		 			      
		 System.out.println();
		 //using a variable called searchKey it will match like above
	     String searchKey = "Audi";
	     // searches the map and verifies if that key exists.	 	
	     if(carMap.containsKey(searchKey))
			 		System.out.println("Found " + carMap.get(searchKey) + " " + searchKey + " cars in the lot!\n");
			          

		
		
	    System.out.println();

	    
//********************************************************************************
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


     