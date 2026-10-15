package polymorphism;

class Animal {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog bark");
    }
}

public class RunTimePolymorphism {

    public static void main(String[] args) {

        Animal a = new Dog();   // Parent reference, child object
        a.sound();             // Dog bark
    }
}

