package ch05;

class Pizza{
    int radius;
    Pizza(int r){
        this.radius = r;
    }
    Pizza getLarger(Pizza p1, Pizza p2){
        if(p1.radius > p2.radius) return p1;
        else return p2;
    }
}

public class PizzaTest {
    public static void main(String[] args){
        Pizza obj1 = new Pizza(14);
        Pizza obj2 = new Pizza(18);

        Pizza largest = obj1.getLarger(obj1, obj2);
        System.out.println(largest.radius + "인치 피자가 더 큼.");
    }
}
