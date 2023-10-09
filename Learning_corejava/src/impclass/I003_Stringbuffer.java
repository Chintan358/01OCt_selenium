package impclass;

public class I003_Stringbuffer {
	public static void main(String[] args) {
		
		
		
		double startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Hello");
		for(int i=1;i<=1000000;i++)
		{
			sb.append("java");
		}
		
		double endTime = System.currentTimeMillis();
		
		double startTime1 = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("Hello");
		for(int i=1;i<=1000000;i++)
		{
			sb1.append("java");
		}
		double endTime1 = System.currentTimeMillis();
		
		System.out.println("time taken by buffer : "+(endTime-startTime));
		System.out.println("time taken by builder : "+(endTime1-startTime1));
		
		
		
		
	}
}
