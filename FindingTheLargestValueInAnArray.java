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

public class FindingTheLargestValueInAnArray
{
	public static void main( String[] args )
	{
		int[] numbers = new int[10];
		int max_num = 0;
		
		System.out.print( "Array: " );
		for ( int i = 0; i < numbers.length; i++ )
		{
			numbers[i] = 1 + (int)(Math.random() * 100);
			System.out.print( numbers[i] + " " );
		}
		
		for ( int i = 0; i < numbers.length; i++ )
		{
			if ( max_num < numbers[i] )
				max_num = numbers[i];
		}
		
		System.out.println( "\n\nThe largest value is " + max_num );
	}
}