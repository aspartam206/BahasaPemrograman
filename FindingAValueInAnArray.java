/*/
	MIT License
	Copyright (c) 2016
	Permission is hereby granted, free of charge, to any person obtaining a copy
	of this software and associated documentation files (the "Software"), to deal
	in the Software without restriction, including without limitation the rights
	to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
	copies of the Software, and to permit persons to whom the Software is
	furnished to do so, subject to the following conditions:
	The above copyright notice and this permission notice shall be included in all
	copies or substantial portions of the Software.
	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
	IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
	FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
	AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
	LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
	OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
	SOFTWARE.
//*/

import java.util.Scanner;

public class FindingAValueInAnArray
{
	public static void main( String[] args )
	{
		int[] numbers = new int[10];
		int userNumber;
		Scanner keyboard = new Scanner(System.in);
		boolean numFound = false;
		
		System.out.print( "Array: " );
		for ( int i = 0; i < numbers.length; i++ )
		{
			numbers[i] = 1 + (int)(Math.random() * 50);
			System.out.print( numbers[i] + " " );
		}
		System.out.println();
		
		System.out.print( "Value to find: " );
		userNumber = keyboard.nextInt();
		
		for ( int i = 0; i < numbers.length; i++ )
		{
			if ( userNumber == numbers[i] && ! numFound )
				numFound = true;
		}
		
		System.out.println();
		if (numFound)
			System.out.println( userNumber + " is in the array." );
		else
			System.out.println( userNumber + " is not in the array." );
			
	}
}
		