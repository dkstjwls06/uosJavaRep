package ch04;

public class CircleTest {
    public static void main(String[] args){
        Circle obj = new Circle();
        obj.radius = 100;

        obj.color = "blue";

        double area1= obj.getArea();
        System.out.println("원의 면적="+area1);
        double area2 = obj.getArea(50);
        System.out.println("반지름 50의 원의 면적="+area2);

    }
}
