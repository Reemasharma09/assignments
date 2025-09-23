class Animal {
    String name;
    int age;
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println(name + " says: Woof!");
    }
    void fetch() {
        System.out.println(name + " is fetching the ball!");
    }
}
class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println(name + " says: Meow!");
    }
    void scratch() {
        System.out.println(name + " is scratching the furniture!");
    }
}
class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println(name + " says: Tweet!");
    }
    void fly() {
        System.out.println(name + " is flying high!");
    }
}
public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal a1 = new Dog("Buddy", 3);
        Animal a2 = new Cat("Whiskers", 2);
        Animal a3 = new Bird("Tweety", 1);
        Animal[] animals = {a1, a2, a3};
        for (Animal a : animals) {
            System.out.println(a.name + " is " + a.age + " years old.");
            a.makeSound();
        }
        ((Dog) a1).fetch();
        ((Cat) a2).scratch();
        ((Bird) a3).fly();
    }
}