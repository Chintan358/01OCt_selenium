package oops;

/*final*/ class A
{
	/* final */ public void dis()
	{
		
	}
}

class B extends A
{
	@Override
	public void dis() {
		// TODO Auto-generated method stub
		super.dis();
	}
}

public class O003_Final {
	public static void main(String[] args) {
		
		
		final int  i = 10;
		//i = 20;
		System.out.println(i);
		
	}
}
