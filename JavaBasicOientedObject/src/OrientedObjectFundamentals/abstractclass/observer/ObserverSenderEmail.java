package OrientedObjectFundamentals.abstractclass.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maumneto
 */
public class ObserverSenderEmail extends Observer {
    private List<String> emails;
    
    public ObserverSenderEmail(Subject subject) {
        subject.attach(this);
        emails = new ArrayList<>();
    }
    
    public void addEmail(String email) {
        emails.add(email);
    }
    
    public void showAllEmails() {
        for(String email: emails) {
            System.out.println(email);
        }
    }

    @Override
    public void update() {
        System.out.println("Sending emails to: ");
        showAllEmails();
    }
}
