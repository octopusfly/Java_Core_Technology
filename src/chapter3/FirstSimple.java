package chapter3;

/**
 * This is the first sample program in Core Java Chapter 3
 * @version 1.01 2016-08-09
 * @author ’≈”Ó∑…
 */
public class FirstSimple {
	public static void main(String[] args) {
		System.out.println("We will not use hello world");
		String string = "\uD835\uDD6Babc";
		System.out.println(string.charAt(2));
		System.out.println(string.codePointAt(2));
		System.out.println(string);
	}
}
