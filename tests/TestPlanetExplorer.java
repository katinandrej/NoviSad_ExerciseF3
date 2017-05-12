import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {
	PlanetExplorer explorer;

	/*@Test
	public void test_creatingSpace() {
		Explorer one = new Explorer (0, 0, "N");
		explorer = new PlanetExplorer(100,100,"(5,5)(7,8)", one);
		
		one.movingRight();
		
		assertEquals("E", one.toString());
		
	}*/
	
	@Test
	public void test_movingForwardOne() {
		Explorer one = new Explorer (0, 0, "E");
		explorer = new PlanetExplorer(100,100,"(5,5)(7,8)", one);
		
		one.movingForward(one.getDirection());
		
		assertEquals("(1, 0), S", one.ispis());
	}
	
	@Test
	public void test_movingForwardTwo() {
		Explorer one = new Explorer (0, 0, "E");
		explorer = new PlanetExplorer(100,100,"(5,5)(7,8)", one);
		
		one.movingForward(one.getDirection());
		
		assertEquals("(0, 1), E", one.ispis());
	}
}
