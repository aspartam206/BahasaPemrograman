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


import java.util.Scanner; 

class ifelse{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//int input = 5;
		System.out.print("Masukan Sebuah Bilangan \t:");
		double input = in.nextDouble();
		else if (input <= 10.0 ) {
			System.out.println("Belok Kiri");
		}
		else if (input <= 20.0 ) {
			System.out.println("Belok Kanan");
		}
		String sInput = "Mochammad Rizki";

		//System.out.print("Masukan namamu :");
		//String sInput = in.next();
		String namapanggilan = sInput.substring(10);
		String namapendek = sInput.substring(10,13);

		System.out.println("nama asli adalah : "+sInput);
		System.out.println("nama panggilan adalah : "+namapanggilan);
		System.out.println("nama pendek adalah : "+namapendek);
		System.out.println("panjang nama adalah : "+sInput.length());
	}
}
