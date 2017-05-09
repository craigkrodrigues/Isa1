import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

	@Test
	public void test() {
		Car a=new Car(10000);
		assertEquals(10,a.getEngineCapacity());
	}

}
