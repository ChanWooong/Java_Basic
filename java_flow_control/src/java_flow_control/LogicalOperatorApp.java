package java_flow_control;

public class LogicalOperatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1 == 1);
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false
		
		System.out.println(true || true); // true
		System.out.println(true || false); // false
		System.out.println(false || true); // false
		System.out.println(false || false); // false
		
		System.out.println(!true); // true
		System.out.println(!false); // false
	}

}
