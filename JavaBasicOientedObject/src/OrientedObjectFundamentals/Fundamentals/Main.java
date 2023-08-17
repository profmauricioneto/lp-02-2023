/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.Fundamentals;

/**
 *
 * @author maumneto
 */
public class Main {
    public static void main(String[] args) {
        Car polo = new Car();
        polo.doors = 4;
        polo.wheels = 4;
        polo.color = "Silver";
        
        polo.run();
        polo.stop();
        System.out.println(polo.doors);
        System.out.println(polo.wheels);
        System.out.println(polo.color);
        
        Car celta = new Car();
        celta.color = "Blue";
        celta.doors = 2;
        celta.wheels = 4;
        
        System.out.println(celta.doors);
        System.out.println(celta.wheels);
        System.out.println(celta.color);
        
    }
}
