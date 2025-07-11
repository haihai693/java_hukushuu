package katenkadi.chapter3;

public class practice3 {
    public static void main(String[] args){
        int isHungry = 1; //空腹時
        String food = "ラーメン";
        System.out.println("こんにちは");
        if(isHungry == 0){
            System.out.println("お腹いっぱいです");
        }else if(isHungry == 1){
            System.out.println("はらぺこです");
            System.out.println(food + "をいただきます");
        }
        System.out.println("ごちそうさまでした");
    }
}
