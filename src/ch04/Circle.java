package ch04;

class Circle {
    public int radius;
    public String color;

    public double getArea(){
        return 3.14 * (radius * radius);
    }
    public double getArea(int r){
        return 3.14 * r * r;
    }

}
