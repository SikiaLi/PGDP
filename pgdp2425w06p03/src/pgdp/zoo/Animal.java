package pgdp.zoo;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Some animal called " + name + " is eating food!");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void makeSound() {
        System.out.println("Some animal called " + name + " is making a sound?");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
