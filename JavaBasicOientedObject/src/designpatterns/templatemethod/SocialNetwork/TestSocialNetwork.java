/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.templatemethod.SocialNetwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author maumneto
 */
public class TestSocialNetwork {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SocialNetwork network = null;
// username and password
        System.out.print("Nome do Usuário: ");
        String username = scan.next();
        System.out.print("Senha: ");
        String password = scan.next();
// enter with message
        System.out.print("Coloque o seu Post: ");
        String message = reader.readLine();
        System.out.print("Escolha a Rede Social a ser postada: [facebook/twitter] ");
        String socialNet = scan.next();
        if (socialNet.equals("facebook")) {
            network = new FacebookNetwork(username, password);
        } else {
            network = new TwitterNetwork(username, password);
        }
        network.postData(message);
    }
}
