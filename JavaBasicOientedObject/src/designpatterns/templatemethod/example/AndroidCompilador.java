/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.templatemethod.example;

/**
 *
 * @author maumneto
 */
public class AndroidCompilador extends Compilador {

    @Override
    public void codigoFonte() {
        System.out.println("Capturando código Java");
    }

    @Override
    public void compilarParaObjeto() {
        System.out.println("Gerando código Intermediário Java.");
    }

    @Override
    public void executar() {
        System.out.println("Executando código Android.");
    }
    
}
