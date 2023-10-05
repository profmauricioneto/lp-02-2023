/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.abstractclass.example1;

/**
 *
 * @author maumneto
 */
public class Main {
    public static void main(String[] args) {
        Product boladegude = new Ball(5, "bola de gude!");
        Product fofao = new Toy(100, "Boneco fofao");
        Product hotwheels = new Car(50, "hot wheels");
        System.out.println("===================");
        boladegude.showInfo();
        System.out.println("===================");
        fofao.showInfo();
        System.out.println("===================");
        hotwheels.showInfo();
    }
}
