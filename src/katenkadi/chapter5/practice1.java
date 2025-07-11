package katenkadi.chapter5;

public class practice1 {
    public static void main(String[] args){
        introduceOneself("湊雄",22,169.9,'辰');
    }
    public static void introduceOneself(String name,int age,double longer,char zodiac) {
        System.out.print("私の名前は" + name + "です。");
        System.out.print("歳は" + age + "です。");
        System.out.println("身長は" + longer + "です。");
        System.out.print("十二支は" + zodiac + "です。");
    }
}
