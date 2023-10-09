package oops;

interface Inter
{
	int i = 10;
	public void display();	
}

interface Inter1
{
	//public void abc();
}

class InterImpl implements Inter,Inter1
{

	@Override
	public void display() {
		System.out.println("running display");
	}
	
}

public class O002_InterfaceDemo {
	public static void main(String[] args) {
		
		InterImpl i = new InterImpl();
		i.display();
	}
}
