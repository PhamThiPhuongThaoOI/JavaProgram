package lap09.exs0201;

public class MyLinkedList extends MyAbstractList{
    MyLinkedListNode head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    private MyLinkedListNode getNopeByIndex(int index) {
        MyLinkedListNode current = head;
        for( int  i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }
    @Override
    public void add(Object o) {
        add(o,size);
    }
    @Override
    public void add( Object o, int index) {
        checkBoundaries(index, size);
        if( index ==0) {
            head = new MyLinkedListNode(o,head);
        } else{
            MyLinkedListNode current = getNopeByIndex(index - 1);
            current.setNext(new MyLinkedListNode(o, current.getNext()));
        }
        size++;
    }
    @Override
    public Object get(int index) {
         checkBoundaries(index,size -1);

         MyLinkedListNode currentNode = head;
         for (int i = 0; i< index; i++) {
             currentNode = currentNode.next;
         }
         return currentNode.getPayload();
    }
    @Override
    public void remove ( int index) {
        checkBoundaries(index, size -1);

        if( index ==0) {
            head = head.next;
        } else {
            MyLinkedListNode previousNode = getNopeByIndex(index - 1);
            MyLinkedListNode currentNode = previousNode.next;
            previousNode.next = currentNode.next;
        }
        size--;
    }
    @Override
    public int size() {
        return size;
    }

}
