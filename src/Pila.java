/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author educacionit
 * @param <T>
 */
public class Pila <T>{

    private final int max;
    private T[] elementos;
    private int tope = -1;

    public Pila(int max) {
        this.max = max;
        elementos = (T[]) new Object[max];/// esto es solo para arreglos 
         // elementos = (T) new T[max]; debo hacer new  Object y castear a T
// elementos = new object this.max revisar
    }

    public void empujar (T e)
{
            while (elementos!=null ) {
            System.out.println(elementos[tope++]);
            
        }
    }
     public sacar (T ) {
         
            
            
        }
    }

}
