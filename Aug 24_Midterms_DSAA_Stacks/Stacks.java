import java.util.*;

public class Stacks {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Stack<Integer> bookPages = new Stack<>();

        System.out.println("Code is working");

        System.out.println("Enter page count for the first book:");
        int firstBook = input.nextInt();
        bookPages.add(firstBook);

        System.out.println("Enter page count for the second book:");
        int secondBook = input.nextInt();
        bookPages.add(secondBook);

        System.out.println(bookPages);
    }
}