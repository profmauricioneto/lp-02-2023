
package OrientedObjectFundamentals.statics.example01;

/**
 *
 * @author maumneto
 */
public class Circulo {
    double x;
    double y;
    double raio;
    public final static double raiz2 = 1.41;
    
    public double area() {
        return Math.PI*raio*raio;
    }
    
    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.raio = 3;
        double z = c.area();
        System.out.println(z);
        System.out.println(Circulo.raiz2);
    }
}
