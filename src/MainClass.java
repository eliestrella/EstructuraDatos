/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author educacionit
 */
public class MainClass {
    public static void main (String args){
    Pila<String> p = new Pila<>();
    p.empujar("A");
    p.empujar("B");
    p.empujar("C");
    sop(p.sacar());
    String e = (String) p.sacar();
    }
}
