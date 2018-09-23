import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double euro = 0.00;
        double dollar = 0.00;
        final char   EURO_CHARACTER   = '€';
        final char   US_CHARACTER     = '$';
        System.out.println("Enter in number of 1 Euro Cent Coins:");
        euro += input.nextInt() * 0.01;
        System.out.println("Enter in number of 2 Euro Cent Coins:");
        euro += input.nextInt() * 0.02;
        System.out.println("Enter in number of 5 Euro Cent Coins:");
        euro += input.nextInt() * 0.05;
        System.out.println("Enter in number of 10 Euro Cent Coins:");
        euro += input.nextInt() * 0.10;
        System.out.println("Enter in number of 20 Euro Cent Coins:");
        euro += input.nextInt() * 0.20;
        System.out.println("Enter in number of 50 Euro Cent Coins:");
        euro += input.nextInt() * 0.50;
        System.out.println("Enter in number of 1 Euro Coins:");
        euro += input.nextInt() * 1.0;
        System.out.println("Enter in number of 2 Euro Coins:");
        euro += input.nextInt() * 2.0;
        System.out.println("Enter in number of 5 Euro Banknotes:");
        euro += input.nextInt() * 5.0;
        System.out.println("Enter in number of 10 Euro Banknotes:");
        euro += input.nextInt() * 10.0;
        System.out.println("Total EU Money: " + String.format(EURO_CHARACTER + "%.2f",euro));
        dollar = euro * 1.160000;
        System.out.println("Total US Money: " + String.format(US_CHARACTER + "%.2f",dollar) );
        System.out.println(US_CHARACTER + "10: " + (int)(dollar/10.0));
        dollar = dollar % 10.0;
        System.out.println(US_CHARACTER + "5: " + (int)(dollar/5.0));
        dollar = dollar % 5.0;
        System.out.println(US_CHARACTER + "1: " + (int)(dollar/1.0));
        dollar = dollar % 1.0;
        System.out.println("Quarters: " + (int)(dollar/0.25) );
        dollar = dollar % 0.250;
        System.out.println("Dimes: " + (int)(dollar/0.100));
        dollar = dollar % 0.100;
        System.out.println("Nickels: " + (int)(dollar/0.050));
        dollar = dollar % 0.050 ;
        System.out.println("Pennies: " + (int)(dollar/0.009999) );

    }

}

