package reviews.reviews1;

public class Review7 {
public static void main(String[] args) {
System.out.println(4*5*2+10+"3"+6+2);
    System.out.println("10"+(4*3-5)+8/4);//(4*3-5)としてかっこを追加　-は文字列を連結できないから
    System.out.println(15-3*2+"5"+3*7);
    System.out.println("5"+6*4+7+10/2);
    System.out.println((10+5)*3+"2"+4*-5); // 3-"2"を3+"2"に変更　-は文字列を連結できないから
    System.out.println(4*(5+2)-10+"3"+6+2);
    System.out.println("10"+(4*3-5)+8/4);
    System.out.println((15-3*2)+"5"+(3*7)); // (15-3)*(2+"5")を分解して、(15-3*2)+"5"に　*は文字列を連結できないから
    System.out.println("5"+(6*4+7)+10/2);
    System.out.println((3+4)*2+"20"+12/(4+2));
}
}
