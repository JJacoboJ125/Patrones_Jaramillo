/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;


/**
 *
 * @author ASUS
 * 
 * @param <Item> Se inicializan las variables que e asignaran en la cola
 * 
 */
public class resizegArrayQueue <Item> implements Iterable<Item>{
    private Item arreglo[];
    private int count;
    private int frontal;
    private int ultimo;

    /**
     * 
     */
    public resizegArrayQueue() {
        arreglo = (Item[]) new Object[1];
        count = 0;
        frontal = 0;
        ultimo = 0;
    }

    /**
     * 
     * @param item Se agrega un Item al final de la cola
     */
    public void enqueue(Item item) {
        if(count== arreglo.length){
            resize(arreglo.length*2);
        }
        arreglo[ultimo++]=item;
        if (ultimo==arreglo.length) {
            ultimo=0;
        }
        count++;
    }
    
    /**
     * 
     * @return elimina el elemento frontal de la cola y retorn el item
     */ 
    public Item dequeue() {
        Item item=arreglo[frontal];
        arreglo[frontal]=null;
        count--;
        frontal++;
        if(frontal==arreglo.length) {
            frontal=0;
        }
        if(count>0 && count==arreglo.length/4){
            resize(arreglo.length/2);
        }
        return item;
    }
      
    /**
     * @return Muestra mostrar que la cola no tiene items y retorna el contador inicializado en 0
     */
    public boolean isEmpty() {
        return count==0; 
    }

    /**
     * 
     * @return Retorna el tamaño de la cola @return Retorna lo que hay en el contador
     */
    public int size() {
        return count; 
    } 
    
    /**
     * 
     * @return Se redimensiona, es para indicar que ha llegado a su limite
     */

    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for(int i=0; i<count; i++) {
            temp[i] = arreglo[(frontal+i) % arreglo.length]; 
        }
        arreglo = temp;
        frontal = 0;
        ultimo = count;
    }
    
    
    @Override
    public Iterator<Item> iterator() {
        return new ArrayIterator(); //retorn el iterador de la cola.
    }
    
    private class ArrayIterator implements Iterator<Item> {
        private int i=frontal;

        @Override
        public boolean hasNext() {
            return i<count; //retorn la posicion menor al contador
        }

        @Override
        public Item next() {
           
            return arreglo[i++]; //retorn el item
        }

    }
 

    }
