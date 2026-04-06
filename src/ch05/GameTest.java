package ch05;

class Character{
    String name;
    int health;
    int attackPower;
    int defense;

    public Character(String name, int health, int attackPower, int defense){
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    public void attack(Character target){
        int damage = this.attackPower - target.defense;
        if(damage > 0){
            target.health -= damage;
            System.out.println(this.name+"가 "+target.name+"을(를) 공격하여 " + damage+"의 피해를 입혔습니다.");
        } else {
            System.out.println(this.name + "가 " + target.name+"을(를) 공격했지만 효과가 없었습니다.");
        }
    }

    public void defend(){
        this.defense += 5;
        System.out.println(this.name + "가 방어 중입니다. 방어력이 " + this.defense + " 증가했습니다.");
    }
}

public class GameTest{
    public static void main(String[] args){
        Character warrior = new Character("전사", 100, 20, 10);
        Character mage = new Character("마법사", 80, 25,5);

        warrior.attack(mage);
        mage.defend();
        mage.attack(warrior);
    }
}

