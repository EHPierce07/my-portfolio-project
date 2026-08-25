import java.util.*;

public class Stacks {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        Stack<String> browserHistory = new Stack<>();

        System.out.println("Code is working");

        System.out.println("Enter first website visited (e.g. google.com):");
        String firstPage = input.next();
        browserHistory.push(firstPage);

        System.out.println("Enter second website visited (e.g. youtube.com):");
        String secondPage = input.next();
        browserHistory.push(secondPage);

        System.out.println("Current Stack (Browser History): " + browserHistory);

        String lastVisited = browserHistory.pop();
        System.out.println("Pressed BACK button. Left: " + lastVisited);
        System.out.println("Now on page: " + browserHistory.peek());
    }
}