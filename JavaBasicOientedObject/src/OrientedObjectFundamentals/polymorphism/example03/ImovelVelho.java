
package OrientedObjectFundamentals.polymorphism.example03;

/**
 *
 * @author maumneto
 */
public class ImovelVelho extends Imovel {
    private double desconto;
    
    public ImovelVelho(double preco, double desconto) {
        super(preco);
        this.desconto = desconto;
    }
    
    public double getDesconto() {
        return desconto;
    }
    
    @Override
    public double calcularImovel() {
        return getPreco() - getPreco()*desconto;
    }
}
