package be.continuum;

public class Main {

    public static void main(final String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a name as a command-line argument");
            return;
        }
        System.out.println(String.format("Hello, %s!", args[0]));
    }

}
