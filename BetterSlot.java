import java.util.Arrays;

public class BetterSlot 
{
	
	//PullTheLever Method
	public int[] pullTheLever()
	{
		int[] numbers = new int[5];
		
		for( int i = 0; i < 5; i++)
		{
			numbers[i] = (int)(Math.random() * 50+1 );
		}
		
		return numbers;
	}
	
	
	
	//PayOff Method
	public int payOff( int[] numbers )
	{
		//Indexes in Array
		int first = 0;
		int second = 1;
		int third = 2;
		int fourth = 3;
		int fifth = 4;
		
		int pay = 0;
		
		boolean powerOfTwo = false;
		boolean perfectSquare = false; 
		boolean fortyTwo = false; 
		boolean five = false;
		boolean four = false;
		boolean fullHouse = false;
		boolean three = false;
		boolean two = false;
		
		int POWERPAY = 3;
		int FORTYTWOPAY = 2;
		int PERFECTPAY = 7;
		int FIVEPAY = 1000000;
		int FOURPAY = 10000;
		int FULLHOUSEPAY = 5000;
		int THREEPAY = 100;
		int TWOPAY = 10;
		
	
		
		
		for( int i = 0; i < 5; i++)
		{
			
			//Power of Two Test
			if( numbers[i] == 1 || numbers[i] == 2 || numbers[i] == 4 || numbers[i] == 8 || 
					numbers[i] == 16 || numbers[i] == 32 )
				powerOfTwo = true;
			
			//Perfect Square Test
			if( numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 9 || numbers[i] == 16 || 
					numbers[i] == 25 || numbers[i] == 36 || numbers[i] == 49 )
				perfectSquare = true;
	
			
			//Forty-Two Test
			if( numbers[i] == 42)
				fortyTwo = true;
			
			
			//Test For Matches
			for( int j = i +1; j < 5; j++ )
			{
				if( numbers[i] == numbers[j] )
				{
					for( int k = j+1; k < 5; k++ )
					{
						if( numbers[j] == numbers[k] )
						{
							for( int l = k+1; l < 5; l++ )
							{
								if( numbers[k] == numbers[l] )
								{
									for( int m = l+1; m < 5; m++ )
									{
										if( numbers[l] == numbers[m] )
											five = true;
										
									}
									
									
									if( !five )
										four = true;
									
										
								}
							}
							
							if( !five && !four )
								three = true;
								
						}
					}
					
					if( !five && !four && !three )
						two = true;
				}
			}
			
		}
		
		
		//Sort for FullHouse Test
		int[] sortedNumbers = new int[5];
		
		for( int i = 0; i < 5; i++ )
		{
			sortedNumbers[i] = numbers[i];
		}
		
		Arrays.sort(sortedNumbers);
		
		
		
		
		if( !five && !four && three)
		{
		
			if( sortedNumbers[first] == sortedNumbers[second] && sortedNumbers[second] == sortedNumbers[third] && sortedNumbers[fourth] == sortedNumbers[fifth] ||
					sortedNumbers[first] == sortedNumbers[second] && sortedNumbers[third] == sortedNumbers[fourth] && sortedNumbers[fourth] == sortedNumbers[fifth] )
			{
				three = false;
				two = false;
				fullHouse = true; 
			}
		}
		
		
		if( powerOfTwo == true )
			pay += POWERPAY;
		if( fortyTwo == true )
			pay += FORTYTWOPAY;
		if( perfectSquare == true )
			pay += PERFECTPAY;
		if( five == true )
			pay += FIVEPAY;
		if( four == true )
			pay += FOURPAY;
		if( three == true )
			pay += THREEPAY;
		if( two == true )
			pay += TWOPAY;
		if( fullHouse == true )
			pay += FULLHOUSEPAY;
			
		
		
		return pay;
	}
}
