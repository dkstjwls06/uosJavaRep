package ch06;

class Animal{
    void speak(){ System.out.println("동물이 소리를 냅니다."); }
}

class Dog extends Animal {
    @Override void speak(){ System.out.println("멍멍"); }
}
class Cat extends Animal {
    @Override void speak(){ System.out.println("야옹"); }
}
class Duck extends Animal {
    @Override void speak(){ System.out.println("꽥꽥"); }
}

public class Zoo {
    public static void main(String[] args){
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Duck();
        for(Animal a : animals){
            a.speak();
        }
    }
}
