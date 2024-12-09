package pgdp.stack;

import java.util.LinkedList;
import java.util.List;

public class Stack <T> {

    private final LinkedList<T> stackList  = new LinkedList<>();

    public void push(T element){
        stackList.add(element);
    }

    public T pop(){
        if (stackList.isEmpty()){
            return null;
        }
        return stackList.remove(stackList.size()-1);
    }

	public static void main(String[] args) {
        // kommentiere das hier aus zu probieren

        Stack<String> stack = new Stack<>();

        stack.push("A");
        System.out.println("Pushed: A");
        stack.push("B");
        System.out.println("Pushed: B");
        stack.push("C");
        System.out.println("Pushed: C");
        stack.push("D");
        System.out.println("Pushed: D");

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        stack.push("E");
        System.out.println("Pushed: E");

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        stack.push("F");
        System.out.println("Pushed: F");
        stack.push("G");
        System.out.println("Pushed: G");

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        stack.push("H");
        System.out.println("Pushed: H");

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

    }
}