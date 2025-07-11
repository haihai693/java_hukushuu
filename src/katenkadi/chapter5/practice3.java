package katenkadi.chapter5;

public class practice3 {
    public static void main(String[] args) {
        email("欠席についての件","241014@std.hi.Yamamoto","お世話になっております。本日、授業を欠席します。");
    }

    public static void email(String title, String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました。");
        System.out.println("件名:無題");
        System.out.println("本文:" + text);
    }
}
