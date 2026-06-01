package ch12;

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode(){
        int result  = name.hashCode();
        result = 31 * result + age;
        return result;
    }
}

public class PersonTest {
    public static void main(String[] args){
        Person person1 = new Person("Kim",30);
        Person person2 = new Person("Kim",30);
        System.out.println(person1.equals(person2));
    }
}
