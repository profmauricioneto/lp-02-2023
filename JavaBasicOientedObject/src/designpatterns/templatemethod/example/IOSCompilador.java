/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.templatemethod.example;

/**
 *
 * @author maumneto
 */
public class IOSCompilador extends Compilador {

    @Override
    public void codigoFonte() {
        System.out.println("Capturando código Swift.");
    }

    @Override
    public void compilarParaObjeto() {
        System.out.println("Gerando código IOS intermediário");
    }

    @Override
    public void executar() {
        System.out.println("Executando código Swift");
    }  
}
