package Bot;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("What's your name?");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "! That's a cool name!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Give me the remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want. Give me a number. Not too big though :)");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("See? Told ya!");
    }

    static void test() {
        System.out.println("Let's see if you can guess this:");
        System.out.println("What is my favorite food?");
        System.out.println("1. Lasagna");
        System.out.println("2. French fries");
        System.out.println("3. Pizza");
        System.out.println("4. Burgers");

        while (true) {
            int guess = scanner.nextInt();
            if (guess == 2) {
                break;
            }
            System.out.println("Nope. Try again.");
        }
        System.out.println("Yey, that's it! I LOOOOVE fries. Digital ones, ofcourse.");
    }

    static void end() {

        System.out.println("Well, it was nice meeting you, but i got to power down now... Byee!");
    }
}
