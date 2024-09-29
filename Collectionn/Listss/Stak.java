import java.util.Stack;

public class Stak {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();

        numbers.push(67);
        numbers.push(34);
        numbers.push(56);
        numbers.push(18);
        numbers.push(22);
        numbers.push(89);

        System.out.println(numbers);

        // System.out.println("peek(): " + numbers.peek());
        // System.out.println("pop(): " + numbers.pop());
        // System.out.println(numbers.search(18));
        // numbers.clear();
        // System.out.println(numbers.empty());
        // System.out.println(numbers.size());

        // System.out.println(numbers);
    }
}
/*
LIFO - Last In First Out

Methods of Stack:
1. push() - adds an element to the stack
2. pop() - removes an element from the stack
3. peek() - returns the top element of the stack
4. empty() - returns true if the stack is empty
5. search() - returns the position of the element from the top of the stack
6. size() - returns the size of the stack

*/