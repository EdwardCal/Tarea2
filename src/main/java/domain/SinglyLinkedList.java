package domain;

public class SinglyLinkedList implements List {

    @Override
    public int size() throws ListException {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object element) throws ListException {
        return false;
    }

    @Override
    public void add(Object element) {

    }

    @Override
    public void addFirst(Object element) {

    }

    @Override
    public void addLast(Object element) {

    }

    @Override
    public void addInSortedList(Object element) {

    }

    @Override
    public void remove(Object element) throws ListException {

    }

    @Override
    public Object removeFirst() throws ListException {
        return null;
    }

    @Override
    public Object removeLast() throws ListException {
        return null;
    }

    @Override
    public void sort() throws ListException {

    }

    @Override
    public int indexOf(Object element) throws ListException {
        return 0;
    }

    @Override
    public Object getFirst() throws ListException {
        return null;
    }

    @Override
    public Object getLast() throws ListException {
        return null;
    }

    @Override
    public Object getPrev(Object element) throws ListException {
        return null;
    }

    @Override
    public Object getNext(Object element) throws ListException {
        return null;
    }

    @Override
    public Node getNode(int index) throws ListException {
        return null;
    }
}
