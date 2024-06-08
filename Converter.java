public class Converter {

    // Binary to Decimal
    public static int binConverter(String binary) {
        int decimal = 0;
        int length = binary.length();
        for (int i = 0; i < length; i++) {
            if (binary.charAt(length - 1 - i) == '1') {
                decimal += Math.pow(2, i);
            }
        }
        return decimal;
    }

    // Decimal to Binary
    public static String decConverter(int decimal) {
        if (decimal == 0) return "0";
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }
        return binary.toString();
    }

    // Binary to Hexadecimal
    public static String hexConverter(String binary) {
        int decimal = binConverter(binary);
        StringBuilder hex = new StringBuilder();

        while (decimal != 0) {
            int remainder = decimal % 16;
            if (remainder > 9) {
                hex.insert(0, (char)(remainder + 55));
            } else {
                hex.insert(0, remainder);
            }
            decimal /= 16;
        }
        return hex.toString();
    }
}