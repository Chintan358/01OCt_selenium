package assignment;

public class A5 {
	public static void main(String[] args) {
		
		for(int i=1000;i<=9999;i++)
		{
		
		int num = i;
		int temp = num;
		int sum = 0;
		
		while(num!=0)
		{
			int rem = num%10;
			sum = sum +(rem*rem*rem*rem);
			num = num/10;
		}
		
		if(temp==sum)
		{
			System.out.println(temp+" : Armstromg");
		}
//		else
//		{
//			System.out.println("not armstrong");
//		}
		
		}
	}
}
