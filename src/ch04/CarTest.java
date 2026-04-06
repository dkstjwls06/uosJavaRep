package ch04;

class Car{
    private String name;
    private int speed = 0;

    public Car(String name){
        this.name = name;
    }

    public void accelerate(){
        this.speed += 10;
    }

    public void brake(){
        this.speed -= 5;
        if(this.speed < 0 ) this.speed = 0;
    }

    public int getSpeed(){
        return this.speed;
    }

    public String getName(){
        return this.name;
    }
}

public class CarTest {
    public static void main(String[] args){
        Car car1 = new Car("Car1");
        Car car2 = new Car("Car2");

        for(int i=0; i<4; i++){
            car1.accelerate();
            car2.accelerate();
        }
        car1.brake();
        System.out.println(car1.getName()+ " 속도: "+car1.getSpeed()+"km/h");
        System.out.println(car2.getName()+ " 속도: "+car2.getSpeed()+"km/h");
        System.out.println("빠른 자동차는 " + ((car1.getSpeed() > car2.getSpeed()) ? car1.getName() : car2.getName()) + "이며, 속도는 " + ((car1.getSpeed() > car2.getSpeed()) ? car1.getSpeed() : car2.getSpeed()) + "km/h 입니다.");
    }


}
