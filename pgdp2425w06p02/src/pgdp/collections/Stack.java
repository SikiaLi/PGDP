package pgdp.collections;

public class Stack {

    private List list;

    public Stack() {
        list = new List();
    }

    public String pop() {
        String s = list.get(0);
        list.remove(0);
        return s;
    }

    public void push(String value) {
        list.add(0, value);
    }
}
