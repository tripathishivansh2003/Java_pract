class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    Dog() {
        super();
        System.out.println("Dog constructor");
    }
}

class TestSuper {
    public static void main(String args[]) {
        Dog d = new Dog();
    }
}