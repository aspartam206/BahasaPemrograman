/*/
	MIT License
	Copyright (c) 2016 Mochammad Rizki
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

public class Math {

    public static void main(String args[]) {
        Integer i = -8;
        double d = -100;
        double x = 52.13;
        //value of E
        System.out.printf("The value of e is\t %.4f%n", Math.E);
        System.out.println("");

        //absolute value
        System.out.println("abs of integer is\t " + Math.abs(i));
        System.out.println("abs of double is\t " + Math.abs(d));
        System.out.println("abs of 2nd double is\t " + Math.abs(x));
        System.out.println("");

        //ceil,round,floor
        System.out.printf("ceil(%.3f) is \t %.3f%n", x, Math.ceil(x));
        System.out.printf("round(%.3f) is \t %d %n", x, Math.round(x));
        System.out.printf("floor(%.3f) is \t %.3f%n", x, Math.floor(x));
        System.out.println("");
        
        //squareroot a.k.a akar
        System.out.printf("sqrt(%.3f) is \t %.3f%n", x, Math.sqrt(x));
        System.out.println("");
    }
}
