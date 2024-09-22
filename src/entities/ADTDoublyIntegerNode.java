package entities;

public class ADTDoublyIntegerNode {
    private final int ELEMENT;
    private ADTDoublyIntegerNode next, previous;

    public ADTDoublyIntegerNode(int ELEMENT) {
        this.ELEMENT = ELEMENT;
        next = null;
        previous = null;
    }

    public int getELEMENT() {
        return ELEMENT;
    }

    public ADTDoublyIntegerNode getNext() {
        return next;
    }

    public void setNext(ADTDoublyIntegerNode next) {
        this.next = next;
    }

    public ADTDoublyIntegerNode getPrevious() {
        return previous;
    }

    public void setPrevious(ADTDoublyIntegerNode previous) {
        this.previous = previous;
    }
}
