package reviews.review3;

import java.io.*;

public class Review29{
    public static void main(String[] args){
        KeyInput key = new KeyInput();
        System.out.print("宛先を入力>");
        String to = key.readString();
        System.out.print("件名を入力>");
        String subject = key.readString();
        System.out.print("本文を入力>");
        String body = key.readString();
        System.out.println(to +"に以下のメールを送信しました。");
        System.out.println("件名:" + subject);
        System.out.println("本文:" + body);
    }
}

class KeyInput {
    public String readString() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = "";
        try {
            inputStr = br.readLine();
        } catch (IOException e) {
            System.out.println("ERROR: IOException");
        }
        return inputStr;
    }
}
