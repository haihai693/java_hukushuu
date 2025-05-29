package reviews.reviews2;

public class Review21 {
    public static void main(String[] args) {
        int num = 21; //格納される値は整数である。今回は21
        int sum = 0;
        for(int i = 1; i < num; i=i+2) {
            sum += i+1;
        }System.out.println("結果: " + sum);
    }
}
