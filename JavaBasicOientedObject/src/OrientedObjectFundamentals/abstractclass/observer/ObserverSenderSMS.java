
package OrientedObjectFundamentals.abstractclass.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maumneto
 */
public class ObserverSenderSMS extends Observer {
    private List<String> telNumbers;
    
    public ObserverSenderSMS(Subject subject) {
        subject.attach(this);
        telNumbers = new ArrayList<>();
    }
    
    public void addTelNumber(String number) {
        telNumbers.add(number);
    }
    
    public void showAllTelNumbers() {
        for(String number: telNumbers) {
            System.out.println(number);
        }
    }

    @Override
    public void update() {
        System.out.println("Sending SMS...");
        showAllTelNumbers();
    }
    
    
}
