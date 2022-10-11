import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Declaring variables
        String var1;
        String var2;

        System.out.println("Enter first string: ");
        var1 = scan.nextLine();

        //Computes the info for var1 (First String)
        System.out.println("String length: " + var1.length());
        int var1length = var1.length();
        boolean evenIndex = var1length % 2 == 0; //Use this to figure out the odd or even string length when splitting them up
        if (evenIndex) {
            System.out.println("First half: " + var1.substring(0, (var1length /2) ));
            System.out.println("Second half: " + var1.substring((var1length/2)));
        } else {
            System.out.println("First half: " + var1.substring(0, (var1length-1) / 2));
            System.out.println("Second half: " + var1.substring((var1length-1) /2));
        }

        System.out.println("Enter second string: ");
        var2 = scan.nextLine();
        int var2Length = var2.length();

        if (var1length > var2Length) {
            System.out.println(var1 + " is longer.");
        } else if (var1length == var2Length) {
            System.out.println("Both strings have the same length");
        } else {
            System.out.println(var2 + " is longer.");
        }

        int compareToVar = var1.compareTo(var2);

        if (var1.equals(var2)) {
            System.out.println("Both strings have the same characters");
        } else if (compareToVar <0) {
            System.out.println(var1 + " is first alphabetically");
        } else {
            System.out.println(var2 + " is first alphabetically");
        }

        int indexOfNumber = var1.indexOf(var2);
        if (indexOfNumber != -1) {
            System.out.println(var2 + " is found in " + var1 + " at index " + indexOfNumber);
        } else {
            System.out.println(var2 + " is NOT found in " + var1);
        }

    }
}