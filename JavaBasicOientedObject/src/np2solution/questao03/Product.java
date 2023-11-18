/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package np2solution.questao03;

/**
 *
 * @author maumneto
 */
public class Product {
    public int id_product;
    public String name;
    public double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public void setId(int id_product) {
        this.id_product = id_product;
    }
    
    public int getId() {
        return id_product;
    }
    
    public void update(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public void showInfo() {
        System.out.println(id_product);
        System.out.println(name);
        System.out.println(price);
    }
}
