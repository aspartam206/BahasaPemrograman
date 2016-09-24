class Stuff {
    public static String name = "I'm a static variable";
}

class Stuff2 {
    public String name = "I'm a non Static variable";
}

class Application {
    public static void main(String[] args) {
        Stuff2 myStuff2 = new Stuff2();
        System.out.println(myStuff2.name);
        System.out.println(Stuff.name);
    }
}
