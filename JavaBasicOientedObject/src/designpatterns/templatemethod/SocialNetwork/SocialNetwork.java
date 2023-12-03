/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.templatemethod.SocialNetwork;

/**
 *
 * @author maumneto
 */
public abstract class SocialNetwork {
    public String username;
    public String password;
    
    public SocialNetwork(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public boolean postData(String message) {
        boolean flag = false;
        if(login(this.username, this.password)){
            boolean response = sendData(message.getBytes());
            if (response) {
                System.out.println("Message posted with success.");
            } else {
                System.out.println("Post failed.");
            }
            log_out();
            flag = true;
        } else {
            System.out.println("login failed.");
        }
        return flag;
    }
    
    public abstract boolean login(String username, String password);
    public abstract boolean sendData(byte[] data);
    public abstract void log_out();
}
