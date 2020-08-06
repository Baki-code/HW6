
public abstract class Animal {

    static int count = 0;
    String name;

    public Animal(String name) {
        this.name = name;
        count++;

    }

    public abstract void swim(int distance);

    public abstract void run(int distance);

    public static void printCount() {
        System.out.printf("Всего создано животных %d", count);
    }
}
