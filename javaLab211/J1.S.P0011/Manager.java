public class Manager {
    private static final char[] hexDigits = {
            '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };

    public void binaryConvert() {
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Binary to Hexadecimal");
        System.out.println("Enter your choice:");
        String binary = ValidateInput.checkInputBianry();
        int choice = ValidateInput.checkIntputRange(1, 2);
        switch (choice) {
            case 1:
                System.out.println("Decimal: " + binaryToDecimal(binary));
                break;
            case 2:
                System.out.println("Hexadecimal: " + binaryToHexa(binary));
                break;
        }
    }

    public void decimalConvert() {
        System.out.println("1. Decimal to Binary");
        System.out.println("2. Decimal to Hexadecimal");
        System.out.println("Enter your choice:");
        String decimal = ValidateInput.checkInputDecimal();
        int choice = ValidateInput.checkIntputRange(1, 2);
        switch (choice) {
            case 1:
                System.out.println("Binary: " + decimalToBinary(decimal));
                break;
            case 2:
                System.out.println("Hexadecimal: " + decimalToHexa(decimal));
                break;
        }
    }

    public void hexaConvert() {
        System.out.println("1. Hexadecimal to Binary");
        System.out.println("2. Hexadecimal to Decimal");
        System.out.println("Enter your choice:");
        String hexa = ValidateInput.checkInputHexa();
        int choice = ValidateInput.checkIntputRange(1, 2);
        switch (choice) {
            case 1:
                System.out.println("Binary: " + hexaToBinary(hexa));
                break;
            case 2:
                System.out.println("Decimal: " + hexaToDecimal(hexa));
                break;
        }
    }

    public String binaryToDecimal(String binary) {
        Integer decimal = Integer.parseInt(binary, 2);
        return decimal.toString();
    }

    public String binaryToHexa(String binary) {
        return decimalToHexa(binaryToDecimal(binary));
    }

    public String decimalToBinary(String decimal) {
        Integer deci = Integer.parseInt(decimal);
        StringBuilder binary = new StringBuilder();
        while (deci > 0) {
            binary.append(deci % 2);
            deci /= 2;
        }
        return binary.reverse().toString();
    }

    public String decimalToHexa(String decimal) {
        Integer deci = Integer.parseInt(decimal);
        StringBuilder hexa = new StringBuilder();
        while (deci > 0) {
            hexa.append(hexDigits[deci % 16]);
            deci /= 16;
        }
        return hexa.reverse().toString();
    }

    public String hexaToBinary(String hexa) {
        return decimalToBinary(hexaToDecimal(hexa));
    }

    public String hexaToDecimal(String hexa) {
        Integer decimal = Integer.parseInt(hexa, 16);
        return decimal.toString();
    }
}
