/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class carroCompra<Key extends Comparable<Key>, Value>{
 private producto [] prodAgregados;
 
 private Key[] keys;
    private Value[] vals;
    private int N;

    public carroCompra(int capacity) {
        keys = (Key[]) new Comparable[capacity];
        vals = (Value[]) new Object[capacity];
    }


    public Value get(Key key) {
        if (isEmpty()) {
            return null;
        }
        int i = rank(key, 0, N-1);
        if (i < N && keys[i].compareTo(key) == 0) {
            return vals[i];
        } else {
            return null;
        }
    }

    public void put(Key key, Value val) {
        
        { // Search for key. Update value if found; grow table if new.
            if(N>=keys.length)
            resize(keys.length*2);
            int i = rank(key, 0, N-1);
            if (i < N && keys[i].compareTo(key) == 0) {
                vals[i] = val;
                return;
            }
            
            for (int j = N; j > i; j--) {
                keys[j] = keys[j - 1];
                vals[j] = vals[j - 1];
            }
             keys[i] = key;
            vals[i] = val;
            N++;
            
        }
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public boolean contains(Key key) {
        return get(key) != null;
    }

    public void delete(Key key) {
        
         int i = rank(key, 0, N-1);
        if (i < N ) {
                vals[i] = null;
                keys[i]=null;
                
                for (int j = i; j < N-1; j++) {
                keys[j] = keys[j + 1];
                vals[j] = vals[j + 1];     
            }     
            }
        keys[N-1]=null;
        vals[N-1]=null;
        N--;
    }

    public Key min() {
       return keys[0];
    }

    public Key max() {
        return keys[N-1];   
    }

    public Key floor(Key key) {
        int i = rank(key, 0, N-1);
        if(keys[i].compareTo(key)==0){
            return keys[i];
        }
     return keys[i-1];
    }

    public Key ceiling(Key key) {
       int i = rank(key, 0, N-1);
     return keys[i]; 

    }

    public int rank(Key key, int lo, int hi) {
        if (hi < lo) {
            return lo;
        }
        int mid = lo + (hi - lo) / 2;
        int cmp = key.compareTo(keys[mid]);
        if (cmp < 0) {
            return rank(key, lo, mid - 1);
        } else if (cmp > 0) {
            return rank(key, mid + 1, hi);
        } else {
            return mid;
        }
    }

    public Key select(int position) {
        return keys[position-1];
    }

    public void deletemin() {
        delete(min());
    }

    public void deletemax() {
        delete(max());
    }
    private void resize(int maxCap){
        Key tempkey[] = (Key[]) new Comparable [maxCap];
        Value tempval[] = (Value[]) new Object [maxCap];
        for(int i = 0; i < this.N ;i++){
            tempkey[i] = keys[i];
            tempval [i]=vals[i];
        }
        keys = tempkey;
        vals = tempval;
    }
       
 
 public Iterable<Key> keys(Key lo, Key hi)
{
 resizegArrayQueue<Key> q = new resizegArrayQueue<Key>();
 for (int i = rank(lo, 0, N-1); i < rank(hi, 0, N-1); i++)
 q.enqueue(keys[i]);
 if (contains(hi))
 q.enqueue(keys[rank(hi, 0, N-1)]);
   
 return q;
}

        
    public Iterable<Key> keys(){
        
        return keys(min(), max());
    }
    
}
