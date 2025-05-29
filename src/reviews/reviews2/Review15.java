package reviews.reviews2;

public class Review15 {
    public static void main(String[] args) {
        int num = 15; //格納される値は整数である。今回は15
        if(num % 2 == 0){
            System.out.println("偶数");
        }else if(num % 2 != 0){
            System.out.println("奇数");
        }else{
            System.out.println("無効な値です。");
        }
    }
}