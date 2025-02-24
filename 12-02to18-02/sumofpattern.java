public class sumofpattern {
    public static void main(String[] args) {
        int x = 3;
        int n = 5;
        int sum = 0; 
        for (int i = 0; i < n; i++) { 
            sum = sum*10 + x; 
            System.out.print(sum+" "); 
        }
    }
}
