package pgdp.exceptions;

public class NotEnoughException extends Exception{
    private final int should, is;
    public NotEnoughException(int should, int is){
        if (is >= should){
            throw new IllegalArgumentException();
        }
        this.should = should;
        this.is = is;
    }

    @Override
    public String toString() {
        return "NotEnoughException{" + "should=" + should + ", is=" + is + '}';
    }
}
