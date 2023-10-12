
package OrientedObjectFundamentals.interfaceclass.example1;

/**
 *
 * @author maumneto
 */
public class Main {
    public static void main(String[] args) {
        OperacoesBancarias contaMauricio = new ContaCorrente(1000);
        OperacoesBancarias contaGuilherme = new ContaCorrenteEspecial(1000);
        contaMauricio.saque(500);
        contaGuilherme.saque(500);
        System.out.println("Conta Mauricio: " + contaMauricio.valorSaldo());
        System.out.println("Conta Guilherme: " + contaGuilherme.valorSaldo());
    }
}
