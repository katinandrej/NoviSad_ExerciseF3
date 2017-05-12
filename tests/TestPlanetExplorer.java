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
	public void test_movingForward() {
		Explorer one = new Explorer (0, 0, "E");
		explorer = new PlanetExplorer(100,100,"(5,5)(7,8)", one);
		
		one.movingForward(one.getDirection());
		
		assertEquals("E", one.toString());
	}
}
