# Browser History Stack

## Description

A simple Java program that demonstrates the use of the **Stack** data structure by simulating browser history.

The program allows the user to enter two websites they visited. These websites are stored in a stack, with the most recently visited page placed on top. The program then simulates pressing the **BACK** button by removing the most recently visited page.

## Features

- Creates a `Stack<String>` for browser history
- Accepts website names from the user
- Uses `push()` to add websites to the stack
- Uses `pop()` to simulate pressing the BACK button
- Uses `peek()` to display the current page
- Displays the current browser history

## Concepts Used

- Stack data structure
- `Stack<String>`
- `Scanner`
- User input
- `push()`
- `pop()`
- `peek()`
- Variables
- `System.out.println()`

## How It Works

The program follows the **LIFO (Last In, First Out)** principle of a stack.

For example:

```text
First website:  google.com
Second website: youtube.com

Stack:
[google.com, youtube.com]
```

When the BACK button is pressed, the most recently visited website is removed:

```text
youtube.com ← removed

Remaining:
[google.com]
```

The program then displays `google.com` as the current page.

## How to Run

Open `Stacks.java` using a Java compiler such as **OnlineGDB** or **Visual Studio Code**.

For OnlineGDB:

1. Select **Java** as the language.
2. Make sure the class is named `Stacks`.
3. Paste the code into the editor.
4. Click **Run**.
5. Enter the websites when prompted.

## Sample Output

```text
Code is working
Enter first website visited (e.g. google.com):
google.com
Enter second website visited (e.g. youtube.com):
youtube.com

Current Stack (Browser History): [google.com, youtube.com]
Pressed BACK button. Left: youtube.com
Now on page: google.com
```

## Purpose

This program was created as a data structures exercise to demonstrate how the **Stack** data structure works using a simple browser history simulation.

## Author

**Pierce Ely G. Hibionada**