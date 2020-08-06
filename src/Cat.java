public class Cat extends Animal {

    static int count = 0;

    public Cat(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(int distance) {
        int maxDistance = 200;
        if (distance > maxDistance) {
            System.out.printf("%s не может столько пробежать\n", name);
        } else {
            System.out.printf("%s пробежал %d метров\n", name, distance);
        }
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s не умеет плавать\n", name);
    }

    public static void printCount() {
        System.out.printf("Всего создано котов %d\n", count);
    }
}
