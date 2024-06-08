import java.util.InputMismatchException;
import java.util.Scanner;

public class BitDec {
    // Main Menu
    public static final int BIN_TO_DEC = 1;
    public static final int DEC_TO_BIN = 2;
    public static final int BIN_TO_HEX = 3;
    public static final int EXIT_PROGRAM = 4;

    public static final int RETURN_PROGRAM = 2;

    // binToDec
    public static final int TRANSFORM_BIN = 1;

    // decToBin
    public static final int TRANSFORM_DEC = 1;

    // binToHex
    public static final int TRANSFORM_HEX = 1;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            Interfacer.mainMenu();

            int choice = getValidIntInput(in);

            switch (choice) {
                case BIN_TO_DEC:
                    Interfacer.binToDec();
                    int binChoice = getValidIntInput(in);

                    switch (binChoice) {
                        case TRANSFORM_BIN:
                            System.out.println("Input a binary number: ");
                            String binInput = in.next();
                            int decResult = Converter.binConverter(binInput);
                            System.out.println("Decimal value: " + decResult);
                            break;
                        case RETURN_PROGRAM:
                            break;
                        default:
                            System.out.println("Invalid option. Please enter a correct number.");
                            break;
                    }
                    break;

                case DEC_TO_BIN:
                    Interfacer.decToBin();
                    int decChoice = getValidIntInput(in);

                    switch (decChoice) {
                        case TRANSFORM_DEC:
                            System.out.println("Input a decimal number: ");
                            int decInput = getValidIntInput(in);
                            String binResult = Converter.decConverter(decInput);
                            System.out.println("Binary value: " + binResult);
                            break;
                        case RETURN_PROGRAM:
                            break;
                        default:
                            System.out.println("Invalid option. Please enter a correct number.");
                            break;
                    }
                    break;

                case BIN_TO_HEX:
                    Interfacer.binToHex();
                    int binHexChoice = getValidIntInput(in);

                    switch (binHexChoice) {
                        case TRANSFORM_HEX:
                            System.out.println("Input a binary number: ");
                            String binHexInput = in.next();
                            String hexResult = Converter.hexConverter(binHexInput);
                            System.out.println("Hexadecimal value: " + hexResult);
                            break;
                        case RETURN_PROGRAM:
                            break;
                        default:
                            System.out.println("Invalid option. Please enter a correct number.");
                            break;
                    }
                    break;

                case EXIT_PROGRAM:
                    System.out.println("Exiting program...");
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please enter a correct number.");
                    break;
            }
        }
    }

    private static int getValidIntInput(Scanner in) {
        while (true) {
            try {
                return in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number:");
                in.next(); // Clear the invalid input
            }
        }
    }
}