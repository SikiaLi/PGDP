package pgdp.zoo;

public class Cat extends Mammal {
    private String name;
    public Cat(String name, String nickName, int age) {
        super(name, age);
        this.name = nickName;
    }


    public String getNickname() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println(super.name + " is eating their favourite treat!");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is loafing around!");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
