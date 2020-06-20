import static org.junit.Assert.assertSame;
import java.util.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EqualStacksTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		//fail("Not yet implemented");
		//EqualStacks es1= new EqualStacks();
		int[] test1 = {1,3,5,7,9};
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		
		for (int i:test1) {
			s1.push(i);
			s2.push(i);
			
		}
		int[] test2 = {1,3,5,7,11};
		Stack<Integer> s3 = new Stack<Integer>();
		
		for (int i:test2) {
			s3.push(i);
		}
		
		assertSame(true,EqualStacks.equals(s1, s2));
		assertSame(false,EqualStacks.equals(s1, s3));
	}

}
