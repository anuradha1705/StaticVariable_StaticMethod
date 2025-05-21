class counter {
    static int count = 0;

    counter() {
        count++;
    }

    static void display() {
        System.out.println("Total objects created: " + count);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        counter c1 = new counter();
        counter c2 = new counter();
        counter c3 = new counter();

        counter.display(); // Correct method call
    }
}
