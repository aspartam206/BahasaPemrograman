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
class StaticNonStaticValue {

  static int count = 0;
  private int nonStatic = 0;

  public StaticNonStaticValue(){  //Constructor
    nonStatic = nonStatic+1;
  }

  public int getNonStatic() { //Return NON Static
    return nonStatic;
  }

  public void setNonStatic(int nonStatic) {
    this.nonStatic = nonStatic;
  }

  public static int addStaticValueByOne() {
    count = count+1; 
    return count;
    /*
     * one can not use non static variables in static method.so if we will
     * return nonStatic it will give compilation error. return nonStatic;
     */
  }
}

public class StaticNonStaticCheck {

    public static void main(String[] args){
      for(int i=0;i<5;i++) {
        StaticNonStaticValue p =new StaticNonStaticValue();
        System.out.println("current static value of count \t: " +StaticNonStaticValue.count);
        System.out.println("adding static value by one  \t: " +StaticNonStaticValue.addStaticValueByOne());
        System.out.println("non static count \t\t: " +p.getNonStatic());
        System.out.println(" ");
        System.out.println("next Iteration: ");
      }
  }
}