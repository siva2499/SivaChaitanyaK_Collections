package hello;

import java.util.*;
public class CollectionsClass {
	public static void main(String args[])
	{
		List<Integer> custom_list=new ArrayList<Integer>(10);
		List<Integer> dummy=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		custom_list.addAll(dummy);
		custom_list.add(25);
		int fetching=custom_list.get(3);
		custom_list.remove(1);
		System.out.println("Fetching an element : "+fetching);
		custom_list.add(24);
		custom_list.add(5);
		custom_list.add(99);
		custom_list.remove(6);
		System.out.println("List size : "+custom_list.size()+"\nPrinting elements : ");
		Iterator<Integer> it=custom_list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
