import org.testng.Assert;
import org.testng.annotations.Test;

public class testAnn {
	@Test(priority = 2)
	public void test1() {
		Assert.assertTrue(true);
	}

	@Test(priority = 1)
	public void test2() {
		Assert.assertTrue(true);
	}

	@Test()
	public void test3() {
		Assert.assertTrue(true);
	}

	@Test()
	public void testt4() {
		Assert.assertTrue(true);
	}

	@Test()
	public void testt5() {
		Assert.assertTrue(true);
	}
}
