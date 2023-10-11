/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.interfaceclass.example1;

/**
 *
 * @author maumneto
 */
public class ContaCorrenteEspecial extends ContaCorrente {

    public ContaCorrenteEspecial() {
        super();
    }
    
    public ContaCorrenteEspecial(double valor) {
        super(valor);
    }

    @Override
    public void saque(double valor) {
        if(montante >= (valor + valor*0.01)) {
            this.montante -= (valor + valor*0.01);
        } else {
            System.out.println("Não é possível sacar o valor requerido!");
        }
    }
    
    
    
}
