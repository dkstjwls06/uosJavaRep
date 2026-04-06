package ch05;

class Single{
    private static Single instance = new Single();
    private Single(){}

    public static Single getInstance(){
        return instance;
    }
}

public class SingleTest {
    public static void main(String[] args){
        Single obj1 = Single.getInstance();
        Single obj2 = Single.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
