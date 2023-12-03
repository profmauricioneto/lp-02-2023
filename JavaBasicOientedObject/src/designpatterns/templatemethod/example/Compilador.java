/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.templatemethod.example;

/**
 *
 * @author maumneto
 */
public abstract class Compilador {
    public Compilador() {
        this.codigoFonte();
        this.compilarParaObjeto();
        this.executar();
    }
    
    public abstract void codigoFonte();
    public abstract void compilarParaObjeto();
    public abstract void executar();
}
