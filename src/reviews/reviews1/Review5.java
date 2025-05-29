package reviews.reviews1;

public class Review5 {
    public static void main(String[] args) {
        int a = 10;int b = 20;int c = 10;
        System.out.println(a == b); //10==20
        System.out.println(a == c); //10==10
        System.out.println(a != b); //10!=20
        System.out.println(a != c); //10!=10
        System.out.println(a < b); //10<20
        System.out.println(a <= b); //10<=20
        System.out.println(a > b); //10>20
        System.out.println(a >= b); //10>=20
        System.out.println(a+10 == b); //10+10 == 20
        System.out.println(c+10 < b+-5); //10+10 < 20-5
    }
}
