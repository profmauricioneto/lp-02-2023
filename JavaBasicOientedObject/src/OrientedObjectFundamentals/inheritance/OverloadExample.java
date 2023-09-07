/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.inheritance;

/**
 *
 * @author maumneto
 */
public class OverloadExample {
    public int sum(int a, int b) {
        return a + b;
    }
    public int sum(int ...args) {
        int total = 0;
        for(int i: args) {
            total += i;
        }
        return total;
    }
    
    public static void main(String[] args) {
        OverloadExample ol = new OverloadExample();
        System.out.println(ol.sum(1,2));
        System.out.println(ol.sum(1,2,3,4,5,6,7,8,9));
    }
}
