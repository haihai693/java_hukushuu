import java.io.*;

public class Review9 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("名前を入力してください>");
        String inputName = br.readLine();
        System.out.print("年齢を入力してください>");
        int age = Integer.parseInt(br.readLine());

        System.out.println(age + "齢の"+inputName + "さん。");
        System.out.println("こんにちは。");
    }
}
