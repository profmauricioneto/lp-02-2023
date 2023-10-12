/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.interfaceclass.example1;

/**
 *
 * @author maumneto
 */
public class ContaCorrente implements OperacoesBancarias, OperacoesPessoais {
    protected double montante;
    protected String nome;
    protected int id;

    public ContaCorrente() {
        this.montante = 0;
        this.nome = "Unknown";
        this.id = 0;
    }

    public ContaCorrente(double montante) {
        this.montante = montante;
        this.nome = "Unknown";
        this.id = 0;
    }
    
    @Override
    public void deposito(double valor) {
        this.montante += valor;
    }

    @Override
    public double valorSaldo() {
        return montante;
    }

    @Override
    public void saque(double valor) {
        if(montante >= (valor + 0.05*valor)){
            this.montante -= (valor + 0.05*valor);
        } else {
            System.out.println("Não é possível debitar a quantia desejada.");
        }
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
