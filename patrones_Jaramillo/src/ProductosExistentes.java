
import java.util.Iterator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class ProductosExistentes <Item> implements Iterable<Item>{
     private node first;
    private node last;
    private int count;



    public class node {

        Item item;
        node Next;
    }

    public ProductosExistentes () {

        first = null;
        last = null;
        count = 0;
    }

    void add(int index, Item item) {
        node gost = first;
        node newNode;

        if (index <= count + 1) {
            newNode = new node();
            newNode.item = item;
            if (index == 1) {
                newNode.Next = gost;
                first = newNode;
            } else {

                for (int i = 1; i < index - 1; i++) {
                    gost = gost.Next;
                }

                newNode.Next = gost.Next;
                gost.Next = newNode;
            }
            count++;
        }

    }

    boolean addFirst(Item item) {

        add(1, item);
        return true;
    }

    boolean addLast(Item item) {

        add(count + 1, item);
        return true;
    }

    void clear() {
        count=0;
        first = last=null;
    }

    boolean contains() {
        return true;
    }

    int indexOf(Item item) {
        return 0;

    }

    int lastIndexOf() {
        return 0;

    }
    
    boolean isEmpty() {
        return first == null;
    }

    Item remove(int Index) {
        Item item=null;
        node gost = first;
        if (Index <= count) {
            if (Index == 1) {
                item = first.item;
                first = first.Next;
            } else {
                for (int i = 1; i < Index; i++) {
                    gost = gost.Next;

                }
                item = gost.Next.item;

                if (Index == count) {
                    gost.Next = null;
                } else {

                    gost = gost.Next.Next;

                }
            }
            count--;
        }
        return item;
    }
    
    public Item removeFirst(){
        return remove(1);
        
    }
    
   
    public Item removelast(){
        return remove(count);
        
    }
    
    int find(Item item){
        int pos =0;
        node gost = first;
        
        while(gost!=null){
            pos++;
            if(gost.item.equals(item)){
                return pos;
            }
            gost=gost.Next;
                
            
        }
        return -1;
    }

    
    
    Item remove(Item item) {
        int pos;
        pos = find(item);
        if(pos!=-1){
           return remove(pos);
           
            
        }
        return null;
        
    }
    
    boolean replace(Item item, Item newItem){
         int pos = find(item);
        node gost =first;
        
        if(pos!=-1){
            
        
        
                for (int i = 1; i < pos; i++) {
                    gost = gost.Next;
                }
                gost.item=newItem;
                return true;
        }
        return false;
    }

    Item set(int index, Item item) {
        return first.item;
    }

    int size() {
        return count;
    }

    public Item []toArray(){
        Item array []=(Item[]) new Object [count];
        int i=0;
        for (node gost=first;gost!=null;gost=gost.Next)
            array[i++]=gost.item;
        
        return array;
    }
    
    @Override
    public Iterator<Item> iterator() {
        return  new LinkIterator();
    }
    
      private class LinkIterator implements Iterator <Item>{

        
        private node current = first;
        @Override
        public boolean hasNext() {
           return current!=null;
        }

        @Override
        public Item next() {
          Item item = current.item;
          current=current.Next;
          return item;
        }
}
}
