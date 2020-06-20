import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkedIntList3Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		//fail("Not yet implemented");
		//LinkedIntList3 l1= new LinkedIntList3();
		
		LinkedIntList list1 = new LinkedIntList();
		list1.add(12);
		list1.add(6);
		list1.add(4);
		list1.add(8);
		
		assertSame(false,list1.hasTwoConsecutive());
		
		list1.add(9);
		assertSame(true,list1.hasTwoConsecutive());
		
	}

	private void assertSame(boolean b, boolean sorted) {
		// TODO Auto-generated method stub
		
	}

}
