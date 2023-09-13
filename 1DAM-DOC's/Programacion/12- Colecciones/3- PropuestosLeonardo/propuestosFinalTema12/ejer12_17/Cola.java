package ejerProps.ejer12_17;

import java.util.ArrayList;

public class Cola <T>{
    private ArrayList<T> colaList;

    public Cola(){
        this.colaList=new ArrayList<T>();
    }

    public void enColar(T objeto){
        colaList.add(objeto);
    }

    public T desEncolar(){
        if(isEmpty()){
            System.out.println("La cola esta vacía");
        }
        return colaList.remove(0);
    }
    public T verCola(){
        if(isEmpty()){
            System.out.println("La cola esta vacía");
        }
        return colaList.get(0);
    }
    public boolean isEmpty(){
        return colaList.isEmpty();
    }
}
