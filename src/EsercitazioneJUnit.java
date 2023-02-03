import static org.junit.Assert.*;

import org.junit.Test;

public class EsercitazioneJUnit {

	@Test
	public void testCalcoloArea1() {
		//fail("Not yet implemented");
		Trapezio t=new Trapezio(3, 2, 1);
		assertEquals(2.5, t.calcoloArea(),0.2f);
	}
	
	@Test
	public void testCalcoloArea2() {
		//fail("Not yet implemented");
		Trapezio t=new Trapezio(6, 5, 5);
		assertEquals(27.5, t.calcoloArea(),0.2f);
	}
	
	@Test
	public void testCalcoloArea3() {
		//fail("Not yet implemented");
		Trapezio t=new Trapezio(32, 5, 1);
		assertEquals(18.5, t.calcoloArea(),0.2f);
	}

}
