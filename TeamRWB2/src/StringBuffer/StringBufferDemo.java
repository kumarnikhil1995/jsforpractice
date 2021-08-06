package StringBuffer;

public class StringBufferDemo {

	public static void concat(String s) {

		s = s + "newString";

	}

	public static void concat1(StringBuilder s1) {

		s1.append("newString");

	}

	public static void concat2(StringBuffer s2) {
		s2.append("ThisIs");
	}

	public static void main(String[] args) {
		String s = "new";
		concat(s);
		System.out.println(s);

		StringBuilder s1 = new StringBuilder("nikhil");
		concat1(s1);
		System.out.println(s1);

		StringBuffer s2 = new StringBuffer("newString");
		concat2(s2);
		System.out.println(s2);

	}

}
