/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.encapsulation.exemplo1;

/**
 *
 * @author maumneto
 */
public class MainEncapsulation {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        
        System.out.println(objA.b);
        objA.setA(222); 
        System.out.println(objA.getA());
    }
}
