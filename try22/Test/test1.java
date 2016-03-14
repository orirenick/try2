import static org.junit.Assert.*;

import org.junit.Test;

public class test1 {

	@Test(timeout=1)
	public void test() {
//		fail("Not yet implemented");
		A a= new A();
		String ExpectedOutPut = "543210";
		String ActualOutPut = a.Rec1(5);
		
		assertEquals(ExpectedOutPut, ActualOutPut);
		
//		System.out.println(a.Factorial(4));
		
		assertEquals(24, a.Factorial(4));
		assertTrue(a.Factorial(10) != 0);
		
	}

}
