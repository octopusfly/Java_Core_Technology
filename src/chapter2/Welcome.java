package chapter2;

/**
 * This program displays a greeting from the authors.
 * @version 1.20 2016-08-09
 * @author ’≈”Ó∑…
 */
public class Welcome {
	public static void main(String[] args) {
		String[] greeting = new String[3];
		greeting[0] = "Welcome to core Java";
		greeting[1] = "by Cay Horstmann";
		greeting[2] = "and Gary Cornell";
		
		for(String g : greeting) {
			System.out.println(g);
		}
	}
}
