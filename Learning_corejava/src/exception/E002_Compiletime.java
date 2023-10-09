package exception;

public class E002_Compiletime {
	public static void main(String[] args) {
		
		
		try {
			Class.forName("exception.Demo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
