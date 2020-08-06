public class Dog extends Animal {
    static int count = 0;

    public Dog(String name) {
        super(name);
        count++;
    }

    @Override
    public void swim(int distance) {
        int maxDistance = 10;
        if (distance > maxDistance) {
            System.out.printf("%s не может столько проплыть\n", name);
        } else {
            System.out.printf("%s проплыл %d метров\n", name, distance);
        }

    }

    @Override
    public void run(int distance) {
        int maxDistance = 500;
        if (distance > maxDistance) {
            System.out.printf("%s не может столько пробежать\n", name);
        } else {
            System.out.printf("%s пробежал %d метров\n", name, distance);
        }
    }

    public static void printCount() {
        System.out.printf("Всего создано собак %d\n", count);
    }

}
