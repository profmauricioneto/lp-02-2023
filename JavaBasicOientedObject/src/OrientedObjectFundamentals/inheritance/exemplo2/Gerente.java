/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.inheritance.exemplo2;

/**
 *
 * @author maumneto
 */
public class Gerente extends Funcionario {
    public String nomeSecretario;
    
    public Gerente(String nome, double salario, int dependentes, String nomeSecretario) {
        super(nome, salario, dependentes);
        this.nomeSecretario = nomeSecretario;
    }
}
