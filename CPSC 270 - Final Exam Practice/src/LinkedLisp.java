
public class LinkedLisp implements LispADT {

    private Integer size;
    private MyNode head;
    private MyNode tail;
    private MyNode current;
    
    public LinkedLisp(){
        size = 0;
        tail = new MyNode(null);
        head = new MyNode(tail);
        current = tail;
    }
    
    public LinkedLisp(Integer size){
        this();
    }
    
    @Override
    public LispADT add(Object c) {
        MyNode dupe = new MyNode(current.getElement(), current.next());
        current.setNext(dupe);
        current.setElement(c);
        
        if(current == tail){
            tail = current.next();
        }
        
        size++;
        return this;
    }

    @Override
    public Integer curPos() {
        MyNode iterator = head.next();
        int pos;
        
        for(pos = 0; iterator != current; pos++){
            iterator = iterator.next();
        }
        
        return pos;
    }

    @Override
    public Object get() throws RuntimeException {
        if(current == tail){
            throw new RuntimeException();
        }
        
        return current.getElement();
    }

    @Override
    public LispADT moveTo(Integer p) {
        if(p > -1 && p <= size){
            current = head.next();
            
            for(int i = 0; i < p; i++){
                current = current.next();
            }
        }
        
        return this;
    }

    @Override
    public LispADT next() {
        if(current != tail){
            current = current.next();
        }
        
        return this;
    }

    @Override
    public LispADT prev() {
        if(current != head.next()){
            MyNode iterator = head;
            
            while(iterator.next() != current){
                iterator = iterator.next();
            }
            
            current = iterator;
        }
        
        return this;
    }

    @Override
    public LispADT remove() {
        if(current != tail){
            size--;
            current.setElement(current.next().getElement());
            
            if(current.next() == tail){
                tail = current;
            }
            
            current.setNext(current.next().next());
        }
        
        return this;
    }

    @Override
    public Integer size() {
        return size;
    }
    
    
    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        }
        
        if(!(o instanceof LinkedLisp)){
            return false;
        }
        
        return o.toString().equals(this.toString());
    }

    @Override
    public String toString() {
        String out = "< ";
        
        for(MyNode iterator = head.next(); iterator != tail; iterator = iterator.next()){
            if(current == iterator){
                out = out + "| ";
            }
            
            else if(iterator != head.next()){
                out = out + ", ";
            }
            
            out = out + iterator.getElement() + " ";
        }
        
        if(current == tail){
            out = out + "| ";
        }
        
        out = out + ">";
        return out;
    }
}
