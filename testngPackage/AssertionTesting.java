package testngPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTesting {
	
	@Test // assertTrue
    public void TestingAssertTrue_True() {
        System.out.println(" assertTrue Method Testing with true condition");
        Assert.assertTrue(1<2, "conditions is true");
    }

	  @Test // assertFalse
	    public void TestingAssertFalse_False() {
	        System.out.println(" AssertFalse Method Testing with true condition");
	        Assert.assertFalse(3 < 2, "condition is false");
	    }
	  @Test // assertEquals
	    public void TestingAssertEquals() {
	        System.out.println(" assertEquals method checking True condition...checking integer values");
	        Assert.assertEquals(101, 101);
	        System.out.println(" assertEquals method checking True condition...checking String values");
	        Assert.assertEquals("same text string", "same text string");
	    }
	  @Test // assertNotEquals
	    public void TestingAssertNOTEquals() {
	        System.out.println(" assertNotEquals method checking False condition...checking integer values");
	        Assert.assertNotEquals(101, 102);
	        System.out.println(" assertNotEquals method checking False condition...checking String values");
	        Assert.assertNotEquals("same text string", "different text string");
	    }
	  @Test
	    public void null1() {
	        System.out.print("Example Of Assertion null Method - will Pass\n");
	        Assert.assertNull(null,"will pass");
	    }
	  @Test
	    public void notNull1() {
	        System.out.print("Example Of Assertion Not null Method - will Fail\n");
	        Assert.assertNotNull(10,"will fail\n");
	    }
	  
	  @Test
	    public void assert_same() {
	        Object obj1 = null,obj2 = null;
	        System.out.print("Asserts that two objects refer to the same object.");
	        Assert.assertSame(obj1, obj2);
	    }
	    // assertNotSame(Object actual, Object expected) -- Asserts that two objects do not refer to the same object.
	    @Test
	    public void assert_not_same() {
	        Object obj1 = null;
	        String objString = "some text";
	        System.out.print("Asserts that two objects do not refer to the same object.");
	        Assert.assertNotSame(obj1, objString);
	    }
}
