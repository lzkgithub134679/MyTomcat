package myTomcat.mytomcat;

/**
 * @author Administrator
 *
 */
public class Demo {
	public static void main(String[] args) {
		new Thread(()->System.out.println("11")).start();
	}
}
