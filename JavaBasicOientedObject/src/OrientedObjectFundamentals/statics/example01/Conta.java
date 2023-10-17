
package OrientedObjectFundamentals.statics.example01;

/**
 *
 * @author maumneto
 */
public class Conta {
    private double saldo;
    public static int id = 1;
    
    public static int incrementarId() {
        return ++id;
    }
    
    public static void main(String[] args) {
        Conta c1 = new Conta();
        System.out.println(c1.incrementarId());
        Conta c2 = new Conta();
        System.out.println(c2.incrementarId());
    }
}
