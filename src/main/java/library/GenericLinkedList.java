package library;
import java.lang.reflect.Array;

public class GenericLinkedList<T> {
    private GenericNode<T> head;
    private int size;

    public GenericLinkedList(){
        this.head = null;
        this.size = 0;
    }

    public int size() { return size;}
    public GenericNode<T> get() { return head;}
    public boolean isEmpty() { return size==0;}

    public void add(T elem){
        GenericNode<T> node = new GenericNode<>(elem);
        if(isEmpty()){
            head=node;
        } else {
            node.setNext(head);
            head = node;
        }
        size++;
    }
    public int search(T elem){
        int result = -1;
        if(isEmpty())
            return result;
        GenericNode<T> node = head;
        for (int i = 0; i < size; i++) {
            if(node.getElem().equals(elem))
                return i;
            node = node.getNext();
        }
        return result;
    }

    public T[] toArray(Class c){
        T[] vector = (T[]) Array.newInstance(c,size);
        GenericNode<T> node = head;
        for (int i = 0; i < size; i++) {
            vector[i] =(T) node.getElem();
            node = node.getNext();
        }
        return vector;
    }

    public T remove(int index){
        T result = null;
        if(isEmpty() || index < 0 || index>=size)
            return result;
        if(index==0){
            result = head.getElem();
            head = head.getNext();
        } else {
            GenericNode<T> aux1 = head;
            GenericNode<T> aux2 = head.getNext();
            while(index>1){
                aux1 = aux2;
                aux2 = aux2.getNext();
                index--;
            }
            result = aux2.getElem();
            aux1.setNext(aux2.getNext());
        }
        size--;
        return result;
    }

    public T get(int index){
        T result = null;
        if (isEmpty() || index <0 || index>=size)
            return result;
        GenericNode<T> node = head;
        while(index>0){
            node = node.getNext();
            index--;
        }
//        for (int i = 0; i <= index; i++) {
//            node = node.getNext();
//        }
        result = node.getElem();
        return result;
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public boolean addAll(GenericLinkedList<T> list){
        boolean updated = false;
        GenericNode<T> node = list.get();

        for (int i = 0; i < list.size(); i++) {
            add(node.getElem());
            node = node.getNext();
            updated = true;
        }
        return updated;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof GenericLinkedList))
            return false;
        GenericLinkedList<T> list = (GenericLinkedList) obj;

        if(list.size() != this.size)
            return false;

        GenericNode<T> aux1 = this.head;
        GenericNode<T> aux2 = list.get();

        while(aux1 != null){
            if(!aux1.equals(aux2))
                return false;
            aux1 = aux1.getNext();
            aux2 = aux2.getNext();
        }
        return true;
    }

    @Override
    public String toString(){
        return "{ size: " + size + ", Element: " + ((head==null) ? "}" : head.toString());
    }

    public boolean contains(T elem){
        GenericNode<T> node = head;
        for (int i = 0; i < size; i++) {
            if(elem.equals(node.getElem()))
                return true;
            node = node.getNext();
        }
        return false;
    }


}