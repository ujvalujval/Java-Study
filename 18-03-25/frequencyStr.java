public class frequencyStr {
    public static void main(String[] args) {
        String str = "learning to code is learning to create and innovate";
        String[] splitwords = str.split("\s+");
        boolean[] check = new boolean[splitwords.length];
        for (int i = 0; i < splitwords.length; i++) {
            if (check[i])
                continue;
            int count = 0;
            for (int j = 0; j < splitwords.length; j++) {
                if (splitwords[i].toLowerCase().equalsIgnoreCase(splitwords[j].toLowerCase())) {   
                    check[j] = true;
                    count++;
                }

            }
            System.out.println(splitwords[i] + " : " + count);

        }
    }
}
