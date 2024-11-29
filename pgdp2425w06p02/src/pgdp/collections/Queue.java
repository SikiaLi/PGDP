package pgdp.collections;

public class Queue {

    private List list;

    public Queue() {
        this.list = new List();
    }

    public String pop() {
        String s = list.get(0);
        list.remove(0);
        return s;
    }

    public void push(String value) {
        list.add(value);
    }
}
