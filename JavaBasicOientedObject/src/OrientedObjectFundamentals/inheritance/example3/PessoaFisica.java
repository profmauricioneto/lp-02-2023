/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.inheritance.example3;

/**
 *
 * @author maumneto
 */
public class PessoaFisica extends Pessoa {
    public String cpf;
    
    public PessoaFisica(int id, String nome, Departamento departamento) {
        super(id, departamento);
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
