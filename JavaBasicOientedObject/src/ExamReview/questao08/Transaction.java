package ExamReview.questao08;

import java.util.Date;

/**
 *
 * @author maumneto
 */
public class Transaction {
    private double value;
    private Date date;
    private String type;
    public Account account;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
