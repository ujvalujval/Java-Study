public class consecutiveval {
    public static void main(String[] args) {
        String str = "110101001110111101";
        char target = '1';
        int countonce = 0;
        int countzero = 0;
        int maxonce = 0;
        int maxzeros = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == target && str.charAt(i + 1) == target) {
                if (str.charAt(i) == target) {
                    countonce++;
                    if (countonce > maxonce)
                        maxonce = countonce;
                } else {
                    countzero++;
                    if (countzero > maxzeros)
                        maxzeros = countzero;
                }
            } else {
                countonce = 0;
                countzero = 0;
            }
        }
        System.out.println(maxonce +" "+maxzeros);
    }
}
