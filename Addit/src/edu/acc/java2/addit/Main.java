package edu.acc.java2.addit;

public class Main {

    public static void main(String[] args) {
        final String USAGE = "Usage: java -jar addit.jar {integer} {integer}";
        
        if (args.length != 2) {
            System.out.println(USAGE);
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int sum = num1 + num2;
            System.out.printf("The sum of %d and %d is %d\n", num1, num2, sum);            
        }
        catch (NumberFormatException nfe) {
            System.out.println("Unable to parse argument: " + nfe.getMessage());
            System.out.println(USAGE);
        }
    }
}
