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

public class NumberGuessingWithACounter
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int secret = 1 + (int)(Math.random() * 10);
		int tries = 0;
		int guess;
		
		System.out.println( "I have chosen a number between 1 and 10. Try to guess it." );
		System.out.print( "Your guess: " );
		guess = keyboard.nextInt();
		tries++;
		
		while ( guess != secret )
		{
			System.out.println( "That is incorrect. Guess again." );
			System.out.print( "Your guess: " );
			guess = keyboard.nextInt();
			tries++;
		}
		
		System.out.println( "That's right! You're a good guesser." );
		System.out.println( "It only took you " + tries + " tries." );
	}
}