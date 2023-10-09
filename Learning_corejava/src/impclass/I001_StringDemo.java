package impclass;

public class I001_StringDemo {
	public static void main(String[] args) {
		
		
//		String str = "tops";
//		String str1 = new String("tech");
//		System.out.println(str+" "+str1);
		
//		String s = "Hello";
//		String s1 =  s.concat("java");
//		System.out.printl n(s1);
		
		
		String s1 = "java";
		String s2 = "mava";
		String s3 = "java";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		
		System.out.println("******************");
		
		String str1 = new String("java");
		String str2 = new String("mava");
		String str3 = new String("java");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1==str3);
		
		
	}
}
