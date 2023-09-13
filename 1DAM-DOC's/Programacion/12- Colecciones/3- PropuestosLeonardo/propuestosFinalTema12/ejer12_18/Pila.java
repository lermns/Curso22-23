package ejerProps.ejer12_18;

import java.util.ArrayList;

public class Pila <T>{
    private ArrayList<T> pila;

    public Pila(){this.pila=new ArrayList<T>();}

    public void aPilar(T obj){pila.add(obj);}

    public T desApilar(){
        if(isEmpty()){
            System.out.println("La Pila esta vacía");
        }
        return pila.remove(pila.size()-1);
    }

    public T verPila(){
        if(isEmpty()){
            System.out.println("La Pila esta vacía");
        }
        return pila.get(pila.size()-1);
    }

    public boolean isEmpty(){
        return pila.isEmpty();
    }
}
