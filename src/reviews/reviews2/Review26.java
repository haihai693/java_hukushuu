package reviews.reviews2;

public class Review26 {
    public static void main(String[] args) {
        int[] numArray = {};
        int target = 30;//探索する整数値が代入される。今回は30
        int count = 0;
        for (int i = 0; i < numArray.length; i++) {
            if(numArray[i] == target) {
                count++;
            }
        }
        System.out.println("探索した値:" + target);
        System.out.println("一致した数:" + count);
    }
}
