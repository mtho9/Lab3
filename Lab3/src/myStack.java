import java.util.ArrayList;

public class myStack implements IStack {
    private ArrayList<String> stack = new ArrayList<>();

    @Override
    public void push(String c) {
        stack.add(c);
    }

    @Override
    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("stack empty");
        }
        int lastIndex = stack.size() - 1;
        String popped = stack.get(lastIndex);
        stack.remove(lastIndex);
        return popped;
    }

    @Override
    public String peek() {
        if (isEmpty()) {
            throw new IllegalStateException("stack empty");
        }
        int lastIndex = stack.size() - 1;
        return stack.get(lastIndex);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
