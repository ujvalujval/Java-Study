import java.util.HashMap;

public class RomenToInt {
    public static void main(String[] args) {

        String romen = "XXI";

        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        int result = 0;
        for (int i = 0; i < romen.length(); i++) {
            int firstval = hashMap.get(romen.charAt(i));

            if (i < romen.length() - 1 && firstval < hashMap.get(romen.charAt(i + 1)))
                result -= firstval;

            else
                result += firstval;
        }
        System.out.println(result);

    }

}