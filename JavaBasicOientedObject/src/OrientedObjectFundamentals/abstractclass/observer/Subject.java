/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.abstractclass.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maumneto
 */
public class Subject {
    public List<Observer> observers;
    
    public Subject() {
        observers = new ArrayList<>();
    }
    public boolean isEven(int value) {
       boolean flag = false;
       if (value % 2 == 0) {
           flag = true;
       }
       return flag;
    }
    
    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }
    public void notifyAllAttached() {
        for(Observer ob: observers) {
            ob.update();
        }
        
    }
}
