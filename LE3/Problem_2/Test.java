public class Test implements Testable{
	public void display() {
		System.out.println("display() fun called (Test implements Testable).");
	}
	public static void main(String[] args) {
		Test a=new Test();
		a.display();
	}
}
