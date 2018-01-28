package algorytmy2.MyList;

public class Element {

    private int data;
    private Element next;
    private Element prev;

    public Element getNext() {
        return next;
    }

    public Element getPrev() {
        return prev;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public void setPrev(Element prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "Element{data="+data+"}";
    }
}