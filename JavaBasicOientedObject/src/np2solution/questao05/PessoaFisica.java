/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package np2solution.questao05;

/**
 *
 * @author maumneto
 */
public class PessoaFisica extends Pessoa {
    private String cpf;
    
    public PessoaFisica(int id, String name) {
        super(id);
        setName(name);
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
