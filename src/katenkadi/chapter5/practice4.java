package katenkadi.chapter5;

public class practice4 {
    public static void main(String[] args) {
        double bottom = 10.0;
        double height = 5.0;
        double radius = 5.0;
        System.out.println("三角形の底辺の長さが" + bottom +"㎝、" +"高さが" + height + "cmの場合、" + "面積は" + calcTriangleArea(10.0,5.0) + "平方cm");
        System.out.println("円の半径が" + radius + "cmの場合、" + "面積は" + calcCircleArea(5.0) + "平方cm");
    }

    public static double calcTriangleArea(double bottom, double height) {
        double calculatedArea = bottom * height / 2;
        return calculatedArea;
    }

    public static double calcCircleArea(double radius) {
        double circleArea = 3.14 * radius * radius;
        return circleArea;
    }
}