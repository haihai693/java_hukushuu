package reviews.reviews1;

public class Review8 {
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        a = (int)b; // doubleからintへの明示的型変換
        a = (int)10000L;
        b = (double)10000L;
        b=(int)a;
        float f = 6L; //float型のためLを追加
        short s = 10;
    }
}
