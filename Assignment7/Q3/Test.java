package Q3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcd";
		String b = "dcba";
		String c = "abcde";
		Q3 q3 = new Q3();
		System.out.println(q3.isAngram(a, b));
		System.out.println(q3.isAngram(a, c));
	}

}
