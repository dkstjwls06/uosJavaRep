package ch04;

class Smartphone{

    private String manufacturer;
    private String model;
    private int battery;

    public Smartphone(String manufacturer, String model){
        this.manufacturer = manufacturer;
        this.model = model;
        this.battery = 100;
    }

    public String getManufacturer(){
        return manufacturer;
    }
    public String getModel(){
        return model;
    }

    public int getBattery(){
        return battery;
    }

    public void setBattery(int battery){
        if(battery < 0){
            this.battery = 0;
        } else if (battery > 100){
            this.battery = 100;
        } else {
            this.battery = battery;
        }
    }

    public void charge(int amount){
        setBattery(this.battery + amount);
        System.out.println("충전 완료! 현재 배터리: "+this.battery+"%");
    }

    public void use(int amount){
        if(this.battery < amount){
            System.out.println("배터리가 부족합니다. 충전이 필요합니다!");
            this.battery = 0;
        } else {
            this.battery -= amount;
            System.out.println("스마트폰을 사용했습니다. 현재 배터리:"+this.battery+"%");
        }
    }

    @Override
    public String toString(){
        return manufacturer + " " + model + " (배터리: "+battery+"%)";
    }
}

public class SmartphoneTest {
    public static void main(String[] args){
        Smartphone phone = new Smartphone("Samsung", "Galaxy S25");

        System.out.println(phone);

        phone.use(30);
        phone.use(80);
        phone.charge(50);
        phone.setBattery(120);

        System.out.println("최종 상태: "+phone);
    }
}
