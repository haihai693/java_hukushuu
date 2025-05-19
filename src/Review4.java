public class Review4 {
    public static void main(String[] args) {
        int number = 5;  //1numberをnumberに変更
        String str = 88+"88";
        final double PI = 3.141592;
        double pi = 3.14; //PIは5行目にfinal変数で既に宣言されているため、他の変数を使用。もしくは5行目にfinal変数をつけない。
        float circ = 3.14159f;  //3.14を3.14159fに変更
        long a = 2147483647; //10000000000を2147483647に変更。これはlong型における最大値。
        boolean flg = true;  //"true"をtrueに変更 文字列型ではない。
        byte b = 35;
        int num = 0x735;
        char c = 'a';  //"a"を'a'変更　charは"ではなく、'で囲む。
    }
}
