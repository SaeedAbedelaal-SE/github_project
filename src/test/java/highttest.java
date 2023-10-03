
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class highttest {

	higght hi = new higght();
	SoftAssert softassert = new SoftAssert();

	@Test
	@DataProvider(name = "data1")
	public Object[][] dpMethod() {
		return new Object[][] { { "saeed", 5 }, { "ibraheem", 8 }, { " ", 1 }  };
	}

	@Test(dataProvider = "data1")
	public void test1(String name, int num) {
		double result = hi.hightOfString(name);
		softassert.assertEquals(result, num);
	}
}
