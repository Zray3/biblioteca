package library;

class GenericNode<T> {
    private T elem;
    private GenericNode<T> next;

    public GenericNode(T elem){
        this.elem=elem;
        this.next=null;
    }

    public GenericNode<T> getNext() {
        return next;
    }

    public T getElem() {
        return elem;
    }

    public void setElem(T elem) {
        this.elem = elem;
    }

    public void setNext(GenericNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString(){
        return elem + ((next!=null)?", " + next : " }");
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof GenericNode))
            return false;
        GenericNode<T> node = (GenericNode) obj;
        return (node.getElem().equals(elem));
    }

}
