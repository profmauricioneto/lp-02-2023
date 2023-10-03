
package OrientedObjectFundamentals.polymorphism.example03;

/**
 *
 * @author maumneto
 */
public class Imovel {
    private double preco;
    protected String endereco;
    
    public Imovel(double preco) {
        this.preco = preco;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public double calcularImovel() {
        return preco;
    }
}
