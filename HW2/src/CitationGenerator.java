import java.util.Scanner;

public class CitationGenerator {

    //Takes input and converts it to MLA Format and APA Format
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Author First Name:");
        String firstName = new String(input.nextLine());
        System.out.println("Enter Author Last Name:");
        String lastName = new String(input.nextLine());
        System.out.println("Enter Book Title:");
        String title = new String(input.nextLine());
        System.out.println("Enter Publisher:");
        String publisher = new String(input.nextLine());
        System.out.println("Enter Publisher City:");
        String city = new String(input.nextLine());
        System.out.println("Enter Publishing Year:");
        String year = new String(input.nextLine());
        System.out.println("MLA: " + lastName + ", " + firstName + ". " + title + ". " + publisher + ", " + year + ".");
        System.out.println("APA: " + lastName + ", " + firstName.trim().charAt(0) + ". (" + year + "). " + title + ". " + city + ": " + publisher + ".");
    }
}
