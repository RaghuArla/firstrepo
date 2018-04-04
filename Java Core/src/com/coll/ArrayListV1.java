package com.coll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayListV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll=new LinkedList();
		ll.add(12);
		ll.add(22);
		ll.add(12);
		ll.add(42);
		ll.add(52);
		System.out.println(ll);
		
		
		ArrayList al=new ArrayList();
		ArrayList all=new ArrayList();
		all.add(1);
		all.add(3);
		all.add(6);
		all.add(2);
		System.out.println(all);
		al.add("hai");
		al.add('A');
		al.add(300);
		al.add(9789.9);
		System.out.println(al);
		System.out.println("size "+al.size());
		System.out.println("isEmpty "+al.isEmpty());
		System.out.println("contains "+al.contains("hai"));
		System.out.println("get  "+al.get(0));
		System.out.println("remove "+al.remove("hai"));


		//using iterator interface
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//using object[]
		Object obj[]=al.toArray();
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i]);
		}
		
		ListIterator li=al.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next());
		}
		

	}

}
