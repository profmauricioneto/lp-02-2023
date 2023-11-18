/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.singleton;

/**
 *
 * @author maumneto
 */
public class TestSingleton {
    public static void main(String[] args) {
        Singleton sing1 = Singleton.getInstance();
        Singleton sing2 = Singleton.getInstance();
        System.out.println(sing1);
        System.out.println(sing2);
    }
}
