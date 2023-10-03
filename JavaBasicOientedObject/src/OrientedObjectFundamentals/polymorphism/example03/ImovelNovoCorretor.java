
package OrientedObjectFundamentals.polymorphism.example03;

/**
 *
 * @author maumneto
 */
public class ImovelNovoCorretor extends ImovelNovo {
    private double porcentagem;
    
    public ImovelNovoCorretor(double preco, double adicional, double porcentagem) {
    super(preco, adicional);
        this.porcentagem = porcentagem;
    }
    
    public double getPorcentagem() {
        return porcentagem;
    }
    
    @Override
    public double calcularImovel() {
        double precoTotal = getPreco() + getPreco()*getAdicional() + getPreco()*porcentagem;
        return precoTotal;
    }
}
