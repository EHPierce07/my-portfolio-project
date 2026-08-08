import java.util.*;

public class DataStructures {

    public static void ReversedArray() {

        System.out.println("Reversed Array");

        int[] num = { 10, 20, 30, 40, 50 };

        for (int i = num.length - 1; i >= 0; i--) {

            System.out.println(num[i]);

        }
    }

    public static void Stack() {

        System.out.println("\nStack");

        Stack<String> stackObject = new Stack<>();

        stackObject.push("Math");
        stackObject.push("Science");
        stackObject.push("English");

        System.out.println("Stack: " + stackObject);

        stackObject.pop();

        System.out.println("After pop: " + stackObject);
    }

    static void QueueFunct() {

        System.out.println("\nQueue");

        Queue<Integer> que = new PriorityQueue<>();

        que.add(15);
        que.add(8);
        que.add(20);
        que.add(5);

        System.out.println("Queue: " + que);

        que.poll();

        System.out.println("After poll: " + que);
    }

    static void EvenNums() {

        System.out.println("\nEven Numbers");

        int[] numero = { 4, 9, 12, 7, 16, 21, 30 };

        for (int i = 0; i < numero.length; i++) {

            if (numero[i] % 2 == 0) {

                System.out.println("Even: " + numero[i]);

            }
        }
    }
    public static void main(String[] args) {

        ReversedArray();
        Stack();
        QueueFunct();
        EvenNums();

    }
}