/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.inheritance.questao05;

/**
 *
 * @author maumneto
 */
public class TesteMain {
    public void Venda(Funcionario func, Cliente cliente) {
        
    }
    
    public static void main(String[] args) {
        Funcionario joao = new Funcionario(100, "Joao da Silva");
        Cliente zezinho = new Cliente(01, "Zezinho da Budega");
        
        Venda pirulito = new Venda(1, zezinho, joao);
        joao.addVendaFuncionario(pirulito);
        zezinho.addVendaCliente(pirulito);
    }
}
