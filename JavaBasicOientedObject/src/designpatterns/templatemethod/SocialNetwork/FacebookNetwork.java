/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.templatemethod.SocialNetwork;

/**
 *
 * @author maumneto
 */
public class FacebookNetwork extends SocialNetwork {

    public FacebookNetwork(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean login(String username, String password) {
        System.out.println("Name: " + username);
        System.out.print("Senha: ");
        for (int i = 0; i < password.length(); i++) {
            System.out.print("*");
        }
        System.out.println("\nLogin realizado com sucesso!");
        return true;
    }

    @Override
    public boolean sendData(byte[] data) {
            boolean response = true;
            System.out.println("Mensagem: " + new String(data) + " foi postada no facebook!");
            return true;
        }

    @Override
    public void log_out() {
        System.out.println("Saindo do Facebook.");
    }
     
    
}
