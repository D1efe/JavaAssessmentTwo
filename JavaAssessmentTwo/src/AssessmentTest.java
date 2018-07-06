
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AssessmentTest {

	 @Test
	 public void doubleCharTest() {
	
	 taskOne one = new taskOne();
	
	 String doubleChar = "Test";
	 String[] doubler = doubleChar.split("");
	 String input = null;
	

	
	 assertEquals("tteesstt", one.doubleChar("test"));
	
	 }
	
//	 @Test
//	 public void getSandwichTest() {
//	
//		 taskOne one = new taskOne();
//		 
//	 String sandWich = "breadjambread";
//	 String result;
//	
//	 one.getSandwich("breadjambread");
//	
//	 assertEquals("jam", result);
//	 }
	
	 @Test
	 public void evenlySpacedTest() {
	
	 taskOne one = new taskOne();
	
	 int a;
	 int b;
	 int c;
		
	 assertEquals(true, one.evenlySpaced(2, 4, 6));
	 assertEquals(true, one.evenlySpaced(4, 6, 2));
	 assertEquals(false, one.evenlySpaced(4, 6, 3));
	
	 }
	
	 @Test
	 public void nTwiceTest() {
	
	 String word;
	 int n;
	
	 taskOne one = new taskOne();
	
	 assertEquals("Helo", one.nTwice("Hello", 2));
	 assertEquals("Choate", one.nTwice("Chocolate", 3));
	 assertEquals("Ce", one.nTwice("Chocolate", 1));
	
	 }
	 @Test
	 public void endlyTest() {
	
	 taskOne one = new taskOne();
	
	 String ending = "ly";
	 String input;
	 boolean reveal = false;
	
	 assertEquals(true, one.endly("oddly"));
	 assertEquals(false, one.endly("y"));
	 assertEquals(false, one.endly("oddy"));
	 assertEquals(false, one.endly("l"));
	 }

//	@Test
//	public void stringClean() {
//
//		taskOne one = new taskOne();
//
//		String duplicatedStr;
//		String reducedStr;
//		String[] holder;
//
//		System.out.println(one.stringClean("yyzzza"));
//
//		assertEquals("yza", one.stringClean("yyzzza"));
//		assertEquals("abcd", one.stringClean("abbbcdd"));
//		assertEquals("helo", one.stringClean("hello"));
//
//	}
	@Test
	public void fibonacci() {
		int counter = 0;
		int adder = 0;
		
		taskOne one = new taskOne();

		System.out.println(one.fibonacci(3));
		
		//I think I misunderstood this one -_-
		assertEquals(1, one.fibonacci(1));
		assertEquals(3, one.fibonacci(2));
		assertEquals(6, one.fibonacci(3));
		

	}
}
