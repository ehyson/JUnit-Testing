import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class TestSlipperySlot 
{
	
	int POWERPAY = 3;
	int FORTYTWOPAY = 2;
	int PERFECTPAY = 7;
	int FIVEPAY = 1000000;
	int FOURPAY = 10000;
	int FULLHOUSEPAY = 5000;
	int THREEPAY = 100;
	int TWOPAY = 10;
	
	//$1,000,000 and above payoff tests
	@Test 
	public void payoffTestF1()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {7,7,7,7,7};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for all five same test", pay == FIVEPAY);
	}
	
	@Test 
	public void payoffTestF2()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {42,42,42,42,42};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for all five same & 42 test", pay == FIVEPAY + FORTYTWOPAY);
	}
	
	@Test 
	public void payoffTestF3()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {8,8,8,8,8};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for all five same & power of two test", pay == FIVEPAY + POWERPAY);
	}
	
	@Test 
	public void payoffTestF4()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {49,49,49,49,49};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for all five same & perfect square test", pay == FIVEPAY + PERFECTPAY);
	}
	
	@Test 
	public void payoffTestF5()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {16,16,16,16,16};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for all five same & power of two & perefect square test", pay == FIVEPAY + POWERPAY + PERFECTPAY);
	}
	

	
	
	
	//$10,000 and above payoff tests
	@Test 
	public void payoffTestT1()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,3,3,3,20};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for four same", pay == FOURPAY);
	}
	
	@Test 
	public void payoffTestT2()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,3,3,3,42};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for four same & 42 test", pay == FOURPAY + FORTYTWOPAY);
	}
	
	@Test 
	public void payoffTestT3()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,3,3,3,8};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for four same & power of two test", pay == FOURPAY + POWERPAY);
	}
	
	@Test 
	public void payoffTestT4()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,3,3,3,49};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for four same & perfect square test", pay == FOURPAY + PERFECTPAY);
	}
	
	@Test 
	public void payoffTestT5()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {9,9,9,9,8};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for four same & perfect square & power of two test", pay == FOURPAY + PERFECTPAY + POWERPAY);
	}
	
	@Test 
	public void payoffTestT7()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {9,9,9,9,42};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for four same & perfect square & 42 test", pay == FOURPAY + FORTYTWOPAY + PERFECTPAY);
	}
	
	@Test 
	public void payoffTestT8()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {42,42,42,42,8};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for four same & 42 & power of two test", pay == FOURPAY + FORTYTWOPAY + POWERPAY);
	}
	
	
	
	
	
	
	//$5,000 and above payoff
	@Test 
	public void payoffTestP1()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {7,7,7,11,11};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for full house test", pay == FULLHOUSEPAY);
	}
	
	@Test 
	public void payoffTestP2()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,3,3,49,49};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for full house & perfect square test", pay == FULLHOUSEPAY + PERFECTPAY);
	}
	
	
	@Test 
	public void payoffTestP3()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,3,3,8,8};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for full house & power of two test", pay == FULLHOUSEPAY + POWERPAY);
	}
	
	@Test 
	public void payoffTestP4()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,3,3,42,42};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for full house & 42 test", pay == FULLHOUSEPAY + FORTYTWOPAY);
	}
	
	@Test 
	public void payoffTestP5()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {25,25,25,42,42};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for full house & perfect square & 42 test", pay == FULLHOUSEPAY + FORTYTWOPAY + PERFECTPAY);
	}
	
	@Test 
	public void payoffTestP6()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {25,25,25,8,8};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for full house & perfect square & power of two test", pay == FULLHOUSEPAY + PERFECTPAY + POWERPAY);
	}
	
	@Test 
	public void payoffTestP7()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {42,42,42,8,8};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for full house & 42 & power of two test", pay == FULLHOUSEPAY + FORTYTWOPAY + POWERPAY);
	}
	
	
	
	
	
	//$100 and above payoff
	@Test 
	public void payoffTestH1()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,3,3,11,17};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for three same test", pay == THREEPAY);
	}
	
	@Test 
	public void payoffTestH2()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,3,3,11,42};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for three same & 42 test", pay == THREEPAY + FORTYTWOPAY); 
	}
	
	@Test 
	public void payoffTestH3()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,3,3,11,49};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for three same & perefect square test", pay == THREEPAY + PERFECTPAY);
	}
	
	@Test 
	public void payoffTestH4()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,3,3,11,8};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for three same & power of two test", pay == THREEPAY + POWERPAY);
	}
	
	@Test 
	public void payoffTestH5()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,3,3,42,49};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for three same & perfect square & 42 test", pay == THREEPAY + PERFECTPAY + FORTYTWOPAY);
	}
	
	@Test 
	public void payoffTestH6()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {4,4,4,3,16};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for three same test & perfect square & power of two", pay == THREEPAY + PERFECTPAY + POWERPAY);
	}
	
	@Test 
	public void payoffTestH7()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,3,3,8,42};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for three same & power of two & 42 test", pay == THREEPAY + POWERPAY + FORTYTWOPAY);
	}
	
	@Test 
	public void payoffTestH8()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {25,25,25,8,42};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for three same & power of two & perfect square & 42 test", pay == THREEPAY + POWERPAY + PERFECTPAY + FORTYTWOPAY);
	}
	
	
	
	
	
	//$10 and above payoff
	@Test 
	public void payoffTestD1()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,3,10,11,17};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for two same test", pay == TWOPAY);
	}
	
	@Test 
	public void payoffTestD2()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,3,8,11,17};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for two same test & power of two test", pay == TWOPAY + POWERPAY);
	}
	
	@Test 
	public void payoffTestD3()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {9,9,25,11,13};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for two same test & perfect square test", pay == TWOPAY + PERFECTPAY);
	}
	
	@Test 
	public void payoffTestD4()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,3,42,11,17};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for two same test & 42 test", pay == TWOPAY + FORTYTWOPAY);
	}
	
	@Test 
	public void payoffTestD5()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,3,8,9,17};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for two same test & power of two & perfect square", pay == TWOPAY + POWERPAY + PERFECTPAY);
	}
	
	@Test 
	public void payoffTestD6()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,3,8,42,17};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for two same test & power of two & 42 test", pay == TWOPAY + POWERPAY + FORTYTWOPAY);
	}
	
	@Test 
	public void payoffTestD7()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,3,9,42,17};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for two same test & perfect square & 42 test", pay == TWOPAY + PERFECTPAY + FORTYTWOPAY);
	}
	
	@Test 
	public void payoffTestD8()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,3,42,9,8};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff for two same test & power of two test & perfect square & 42 test", pay == TWOPAY + PERFECTPAY + POWERPAY + FORTYTWOPAY);
	}
	
	
	
	
	
	//No Matches
	@Test 
	public void payoffTestN1()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,7,19,11,42};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff 42 test", pay == FORTYTWOPAY);
	}
	
	@Test 
	public void payoffTestN2()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,7,9,11,19};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff perfect square test", pay == PERFECTPAY);
	}
	
	@Test 
	public void payoffTestN3()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,7,8,11,19};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff power of two test", pay == POWERPAY);
	}
	
	@Test 
	public void payoffTestN4()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,7,8,11,42};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff power of two & 42 test", pay == FORTYTWOPAY + POWERPAY);
	}
	
	@Test 
	public void payoffTestN5()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,7,9,11,42};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff perfect square & 42 test", pay == PERFECTPAY + FORTYTWOPAY);
	}
	
	@Test 
	public void payoffTestN6()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,7,8,11,16};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff perfect square & power of two test", pay == PERFECTPAY + POWERPAY);
	}
	
	@Test 
	public void payoffTestN7()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,7,8,16,42};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff perfect square & power of two & 42 test", pay == PERFECTPAY + POWERPAY + FORTYTWOPAY);
	}
	
	@Test 
	public void payoffTestN8()
	{
		SlipperySlot newSlot = new SlipperySlot();
		int[] numbers = {3,7,28,11,45};
		int pay = newSlot.payOff(numbers);
		assertTrue("Payoff null test", pay == 0);
	}
}


