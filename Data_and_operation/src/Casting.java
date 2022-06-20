
public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1.1;
		double b = 1;
		double b2 = (double)1;
		
		System.out.println(b);
		
		// inc c = 1.1;
		double d = 1.1;
		int e = (int)1.1;
		System.out.println(e); // 1
		
		//1 to String
		String f = Integer.toString(2);
		System.out.println(f);
		System.out.println(f.getClass()); // 내용이 어떤 타입인지 알려주는 함수 getclass().
	}

}
