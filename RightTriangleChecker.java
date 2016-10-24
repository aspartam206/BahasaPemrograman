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

public class RightTriangleChecker
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int side1, side2, side3;
		double triangle_test;
		
		System.out.println( "Enter three integers:" );
		System.out.print( "Side 1: " );
		side1 = keyboard.nextInt();
		
		do
		{
			System.out.print( "Side 2: " );
			side2 = keyboard.nextInt();
			
			if ( side1 > side2 )
				System.out.println( side2 + " is smaller than " + side1 + ". Try again." );
		} while ( side1 > side2);
		
		do
		{
			System.out.print( "Side 3: " );
			side3 = keyboard.nextInt();
			
			if ( side2 > side3 )
				System.out.println( side3 + " is smaller than " + side2 + ". Try again." );
		} while ( side2 > side3 );
		
		System.out.println( "Your three sides are " + side1 + " " + side2 + " " + side3 );
		
		triangle_test = Math.sqrt( (side1 * side1 ) + (side2 * side2) );
		
		if (triangle_test == side3 )
			System.out.println( "These sides *do* make a right triangle. Yippy-skippy!" );
		else
			System.out.println( "NO! These sides do not make a right triangle!" );
	}
}