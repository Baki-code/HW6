import com.sun.org.apache.xerces.internal.impl.dv.xs.AnyURIDV;

public class HW6 {
    public static void main(String[] args) {
        Animal cat1 = new Cat("Барсик");
        Animal dog1 = new Dog("Тузик");
        Animal cat2 = new Cat("Мурзик");

        cat1.run(400);
        cat1.swim(100);
        cat1.run(100);
        dog1.run(300);
        dog1.run(1000);
        dog1.swim(100);
        dog1.swim(8);

        Cat.printCount();
        Dog.printCount();
        Animal.printCount();

    }
}
