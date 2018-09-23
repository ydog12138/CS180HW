import java.util.Scanner;

/**
 * This is CS180 HW4
 * The program is used to rearrange DNA sequence
 * @author Haoran Yin
 * @version 9/23/2018-0
 */
public class DNACompressor {

    public static void main(String[] args) {
        System.out.println("Welcome to the DNA Compressor!");
        String options = "Enter in one of the following options:\n" +
                "(1) Compress DNA Sequence\n" +
                "(2) Decompress DNA Sequence\n" +
                "(3) Exit\n";
        Scanner input = new Scanner(System.in);
        System.out.print(options);
        int option = input.nextInt(); //user's option
        String skip = input.nextLine(); //skip to next line
        while (option != 3) {
            switch (option) {

                case 1:
                    System.out.println("Enter DNA Sequence to compress:");
                    String dnaCompress = input.nextLine().trim();
                    int count = 1; //current count for the letter
                    int index = 0; // current index
                    String compressResult = ""; // result string
                    while (index < dnaCompress.length()) {
                        if (index < dnaCompress.length() - 1
                                && dnaCompress.charAt(index) == dnaCompress.charAt(index + 1))
                            count++;
                        else {
                            compressResult += count;
                            compressResult += dnaCompress.charAt(index);
                            count = 1;
                        }
                        index++;
                    }
                    System.out.println("Compressed DNA Sequence:\n" + compressResult);
                    break;

                case 2:
                    System.out.println("Enter Compressed DNA Sequence:");
                    String dnaDecompress = input.nextLine().trim();
                    String decompressResult = ""; //result string
                    String number = "";
                    while (dnaDecompress.length() != 0) {
                        if (dnaDecompress.charAt(0) >= '0' && dnaDecompress.charAt(0) <= '9') {
                            number += dnaDecompress.charAt(0);
                            dnaDecompress = dnaDecompress.substring(1);
                        } else {
                            for (int i = 0; i < Integer.parseInt(number); i++) {
                                decompressResult += dnaDecompress.charAt(0);
                            }
                            dnaDecompress = dnaDecompress.substring(1);
                            number = "";
                        }
                    }
                    System.out.println("Decompressed DNA Sequence:\n" + decompressResult);
                    break;

                default:
                    System.out.println("Error: Option not available.");
                    break;
            }
            System.out.print(options);
            option = input.nextInt();
            skip = input.nextLine(); //skip to next line
        }
    }

}