
public class DecimalToAll {
    public static void main(String[] args) {
        int decimal = 156;
        // Decimal to Binary----------------
        String binary = "";
        int tempDecimal1 = decimal;
        while (tempDecimal1 > 0) {
            binary = (tempDecimal1 % 2) + binary;
            tempDecimal1 /= 2;
        }
        System.out.println("Decimal to Binary : " + binary);

        //Decimal to Octal-------------------
        String Octal = "";
        int tempDecimal2 = decimal;
        while (tempDecimal2 > 0) {
            Octal = (tempDecimal2 % 8) + Octal;
            tempDecimal2 /= 8;
        }
        System.out.println("Decimal to Binary : " + Octal);

        // decimal to Hexa------------------------
        String Hexa = "";
        int tempDecimal3 = decimal;
        while (tempDecimal3 > 0) {
            int rem = tempDecimal3 % 16;
            // Hexa = (rem < 10 ? rem : (char) ('A' + rem - 10)) + Hexa;
            Hexa = (rem < 10 ? String.valueOf(rem) : String.valueOf((char) ('A' + rem - 10))) + Hexa;
            System.out.println("  : "+Hexa);
            tempDecimal3 /= 16;
            // Hexa = (rem < 10 ? rem : rem);
        }
        System.out.println("Decimal to Hex : " + Hexa);

    }
}
