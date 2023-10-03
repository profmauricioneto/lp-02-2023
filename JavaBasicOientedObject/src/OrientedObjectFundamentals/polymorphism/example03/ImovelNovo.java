package OrientedObjectFundamentals.polymorphism.example03;

/**
 *
 * @author maumneto
 */
public class ImovelNovo extends Imovel {
    private double adicional;
    
    public ImovelNovo(double preco, double adicional) {
        super(preco);
        this.adicional = adicional;
    }
    
    public double getAdicional() {
        return adicional;
    }
    
    @Override
    public double calcularImovel() {
        return getPreco() + getPreco()*adicional;
    }
}
