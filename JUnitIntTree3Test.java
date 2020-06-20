import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntTree3Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		//fail("Not yet implemented");
		IntTree3 tree1 =new IntTree3(19);
		IntTree3 tree2 =new IntTree3(100);
		assertEquals(true,tree1.isFull());
		assertEquals(false,tree2.isFull());
		
	}

}
