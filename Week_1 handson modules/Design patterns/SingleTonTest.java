class SingleTon {
    private static SingleTon instance;
    private SingleTon() {
    }
    public static SingleTon getInstance() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }
    public void statement(String message) {
        System.out.println("Instance created - " + message);
    }
}
public class SingleTonTest {
    public static void main(String[] args) {
        SingleTon log1 = SingleTon.getInstance();
        log1.statement("Person 1");

        SingleTon log2 = SingleTon.getInstance();
        log2.statement("Person 2");

        if (log1 == log2) {
            System.out.println("Same instance used");
        } else {
            System.out.println("Different instances created");
        }
    }
}
