package reviews.reviews2;

public class Review18 {
    public static void main(String[] args) {
        int num = 18;//格納される値は整数である。今回は18
        int sum = 0;
        int i = 1;
        for(i = 1; i <= num; i++) {
            if(i % 2 != 0) {
                sum = sum + i;
            }
        } System.out.println("結果: " + sum);
    }
}
