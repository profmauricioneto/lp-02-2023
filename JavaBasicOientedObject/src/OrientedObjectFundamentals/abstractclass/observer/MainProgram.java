package OrientedObjectFundamentals.abstractclass.observer;

/**
 *
 * @author maumneto
 */
public class MainProgram {
    public static void main(String[] args) {
        Subject wine = new Subject();
        
        ObserverSenderEmail mauricio = new ObserverSenderEmail(wine);
        mauricio.addEmail("mauricio@algumacoisa.com");
        ObserverSenderSMS brayner = new ObserverSenderSMS(wine);
        brayner.addTelNumber("08511223344");
        
        for(int i = 0; i <= 5; i++) {
            if (wine.isEven(i)) {
                System.out.printf("[%d]\n", i);
                wine.notifyAllAttached();
            }
        }
        
    }
}
