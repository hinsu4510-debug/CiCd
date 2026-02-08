package BatchTesting;

import org.testng.annotations.Test;

public class InvocationCountDemo {
	@Test(invocationCount=5)//if 0 then it will not execute
	public void testMethod1() {
		System.out.println("test method1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("test method2");
	}

}
