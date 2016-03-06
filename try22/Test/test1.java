import static org.junit.Assert.*;

import org.junit.Test;

public class test1 {

	@Test
	public void test() {
//		fail("Not yet implemented");
		A a= new A();
		String ExpectedOutPut = "543210";
		String ActualOutPut = a.Rec1(5);
		
		assertEquals(ExpectedOutPut, ActualOutPut);
	}

}
