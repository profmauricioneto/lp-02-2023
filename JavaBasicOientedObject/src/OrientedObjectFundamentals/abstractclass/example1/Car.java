/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.abstractclass.example1;

/**
 *
 * @author maumneto
 */
public class Car extends Product {
    public Car(double price, String name) {
        super(price, name);
    }

    @Override
    public void update(double price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
    }
    
    
    
    
}
