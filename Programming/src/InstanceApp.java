import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class InstanceApp {
// 인스턴트는 클래스를 컴퓨터상에 실체화한 것.
// math는 constructor가 없지만 printwriter는 constructor가 있다.
	//new 키워드로 인스턴스 생성함.
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		PrintWriter  p1 = new PrintWriter("result1.txt");
//		p1.write("Hello 1");
//		p1.close();
//		
//		PrintWriter  p2 = new PrintWriter("result2.txt");
//		p2.write("Hello 1");
//		p2.close();
		
		PrintWriter.write("result1.txt","Hello 1");
		PrintWriter.write("result1.txt","Hello 2");
		PrintWriter.write("result1.txt","Hello 1");
		PrintWriter.write("result1.txt","Hello 2");
		PrintWriter.write("result1.txt","Hello 1");
		PrintWriter.write("result1.txt","Hello 2");
		PrintWriter.write("result1.txt","Hello 1");
		PrintWriter.write("result1.txt","Hello 2");
		PrintWriter.write("result1.txt","Hello 1");
		PrintWriter.write("result1.txt","Hello 2");
		PrintWriter.write("result1.txt","Hello 1");
		PrintWriter.write("result1.txt","Hello 2");
		
	}

}
