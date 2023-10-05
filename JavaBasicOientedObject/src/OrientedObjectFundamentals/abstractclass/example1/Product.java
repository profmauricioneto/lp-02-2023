/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.abstractclass.example1;

/**
 *
 * @author maumneto
 */
public abstract class Product {
    public String name;
    public double price;
    public int id_product;
    
    public Product(double price, String name){
        this.price = price;
        this.name = name;
    }
    
    public void setId(int id_product) {
        this.id_product = id_product;
    }
    
    public int getId() {
        return id_product;
    }
    
    public abstract void update(double price, String name);
    public abstract void showInfo();
}
