package ExamReview.questao08;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maumneto
 */
public class Account {
    public int id_accout;
    public Client client;
    List<Transaction> transactions = new ArrayList<>();
    
    public void setClient(Client client) {
        this.client = client;
    }
    
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }
}
