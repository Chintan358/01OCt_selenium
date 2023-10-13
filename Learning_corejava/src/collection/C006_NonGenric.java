package collection;

import java.util.ArrayList;

public class C006_NonGenric {
	public static void main(String[] args) {
		
		
		ArrayList list = new ArrayList();
		list.add("abc");
		list.add(10);
		list.add(10.23);
		list.add('A');
		
		for(Object o : list)
		{
			System.out.println(o);
		}
		
	}
}
