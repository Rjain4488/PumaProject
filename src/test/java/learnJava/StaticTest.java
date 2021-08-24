package learnJava;

public class StaticTest {
	
	static {System.out.println("static block invoked");}
	
	static int a = 40;
	
	public static void run() {
		System.out.println("TestRun");
	}
	
//static is used for memory efficiency
	public static void main(String[] args) {
		
		StaticTest.run();
		
		System.out.println(a);
	}

}
