package ejerProps.ejer12_20;

import java.util.ArrayList;

public class SuperCola <T>{
    private ArrayList<T> colaList;

    public SuperCola(){
        this.colaList=new ArrayList<T>();
    }

    public void enColar(T obj){
        colaList.add(obj);
    }

    public T desEncolar(){
        if(isEmpty()){
            System.out.println("La cola esta vacía");
        }
        return colaList.remove(0);
    }

    @Override
    public String toString() {
        return " "+colaList;
    }

    public boolean isEmpty(){
        return colaList.isEmpty();
    }
}
