package collection;

import java.util.ArrayList;

public class C002_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> sports = new ArrayList<String>();
		sports.add("Cricket");
		sports.add("Hockey");
		
		ArrayList<String> sub = new ArrayList<String>(sports);
		sub.add("java");
		sub.add("php");
		sub.add("android");
		sub.add(null);
		sub.add("java");
		sub.addAll(sports);
		
		for(String s : sub)
		{
			System.out.println(s);
		}
		
		
		
	}
}
