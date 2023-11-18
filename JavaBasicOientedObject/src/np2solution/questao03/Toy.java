/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package np2solution.questao03;

/**
 *
 * @author maumneto
 */
public class Toy extends Product {
    public Toy(String name, double price) {
        super(name, price);
    }
    
    @Override
    public void update(String name, double price) {
        System.out.println("Toy calls");
        this.name = name;
        this.price = price;
    }
    
    @Override
    public void showInfo() {
        System.out.println("Toy calls");
        System.out.println(id_product);
        System.out.println(name);
        System.out.println(price);
    }
}
