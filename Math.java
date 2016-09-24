
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
