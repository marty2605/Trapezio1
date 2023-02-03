/**
 * <U>classe trapezio</U>
 * @author <b>Marta</b>
 * @version 1.0
 *
 */
public class Trapezio {

	private float B, b, h;

	/**
	 * 
	 * @param B base maggiore
	 * @param b base minore
	 * @param h altezza
	 */
	public Trapezio(float B, float b, float h) {
		this.B = B;
		this.b = b;
		this.h = h;
	}

	/**
	 * 
	 * @return area
	 */
	public float calcoloArea() {
		return B + b * h / 2;
	}

	public String toString() {
		String s = "base maggiore: " + B + "\nbase minore: " + b + "\naltezza: " + h + "\n\narea: " + calcoloArea();
		return s;
	}

	public static void main(String[] args) {
		Trapezio t = new Trapezio(10, 2, 3);
		System.out.println(t);
	}
}
