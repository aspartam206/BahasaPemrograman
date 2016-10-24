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
import java.util.Random;

public class HiLoLimited
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int secret = 1 + r.nextInt(100);
		int tries = 1;
		int guess;
		
		System.out.println( "I'm thinking of a number between 1-100. You have 7 guesses." );
		System.out.print( "First guess: " );
		guess = keyboard.nextInt();
		tries++;
		
		while ( secret != guess && tries < 8 )
		{
			if ( secret < guess )
			{
				System.out.println( "Sorry, you're too high." );
				System.out.print( "Guess # " + tries + ": " );
				guess = keyboard.nextInt();
				tries++;
			} 
			else if ( secret > guess )
			{
				System.out.println( "Sorry, you're too low." );
				System.out.print( "Guess # " + tries + ": " );
				guess = keyboard.nextInt();
				tries++;
			}
			else
			{
				System.out.println ("ERROR.");
				tries = 8;
			}
		}
		
		if ( secret == guess )
			System.out.println( "You guess it! What are the odds?!?" );
		else if ( tries > 7 )
		{	
			System.out.println( "Sorry, you didn't guess it in 7 tries. You lose." );
		}
	}
}