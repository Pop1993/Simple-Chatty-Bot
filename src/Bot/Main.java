package Bot;

public class Main {

    public static void main(String[] args) {
        SimpleBot qubit = new SimpleBot();
        qubit.greet("Qubit", "2020");
        qubit.remindName();
        qubit.guessAge();
        qubit.count();
        qubit.test();
        qubit.end();
    }
}
