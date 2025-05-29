package reviews.reviews2;

public class Review17 {
    public static void main(String[] args) {
        int num = 17; //格納される値は整数である。今回は17
        int sum = 0;
        int i = 1;
        for(i=1; i<=num; i++){
            if(i%2==0){
                sum += i;
            }
        } System.out.println("結果: " +sum);
    }
}