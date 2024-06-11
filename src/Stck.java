import java.util.Stack;

public class Stck <T> {
    Stack <T> stack = new Stack<>();
    public void push(T item){
        stack.push(item);
        System.out.println(stack);
    }
    public void pop(){
        stack.pop();
        System.out.println(stack);
    }
    public void peek(){
        System.out.println(stack.peek());
    }
    public void isempty(){
        System.out.println(stack.isEmpty());
    }
    public void size(){
        System.out.println(stack.size());
    }
}
